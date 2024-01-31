package exercise;

    public class Segment {
        private Point beginPoint;
        private Point endPoint;

        public Segment(Point beginPoint, Point endPoint) {
            this.beginPoint = beginPoint;
            this.endPoint = endPoint;
        }

        public Point getBeginPoint() {
            return beginPoint;
        }

        public Point getEndPoint() {
            return endPoint;
        }

        public Point getMidPoint() {
            return new Point((this.getBeginPoint().getX() + this.getEndPoint().getX()) / 2, (this.getBeginPoint().getY() + this.getEndPoint().getY()) / 2 );
        }
}
