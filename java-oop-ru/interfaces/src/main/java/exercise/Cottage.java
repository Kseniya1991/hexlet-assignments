package exercise;


    public class Cottage implements Home {
        double area;
        int floorCount;

        public Cottage(double area, int floorCount) {
            this.area = area;
            this.floorCount = floorCount;
        }

        @Override
        public String toString() {
            return floorCount + " этажный коттедж площадью " + area + " метров";
        }

        @Override
        public double getArea() {
            return area;
        }

        @Override
        public int compareTo(Home another) {
            if (this.getArea() == another.getArea()) {
                return 0;
            }
            if (this.getArea() > another.getArea()) {
                return 1;
            } else {
                return -1;
            }
        }
    }