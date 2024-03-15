package exercise;

import io.javalin.Javalin;
import io.javalin.http.NotFoundResponse;

import java.util.List;
import java.util.Map;

// BEGIN

// END

public final class App {

    private static final List<Map<String, String>> COMPANIES = Data.getCompanies();

    public static Javalin getApp() {

        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });

        // BEGIN
        app.get("/companies/{id}", ctx -> { //обработчик для динамического маршрута /companies/{id}
            var id = ctx.pathParam("id");
            Map<String, String> company = COMPANIES.stream() //Каждая компания — это словарь Map<String, String> с ключом id
                    .filter(c -> c.get("id").equals(id))
                    .findFirst()
                    .orElse(null);

            if (company == null) {
                throw new NotFoundResponse("Company not found");
                //Если компания с таким идентификатором не существует, приложение должно возвращать страница с HTTP-кодом 404 и текстом Company not found
            }

            ctx.json(company); //приложение должно отдавать представление компании в формате json
        });
        // END

        app.get("/companies", ctx -> {
            ctx.json(COMPANIES);
        });

        app.get("/", ctx -> {
            ctx.result("open something like (you can change id): /companies/5");
        });

        return app;

    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
