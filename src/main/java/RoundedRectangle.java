public class RoundedRectangle extends Rectangle{
    private double roundRadius;

    public RoundedRectangle(int height, int width) {
        super(height, width);
    }

    public RoundedRectangle(int height, int width, int size) {
        super(height, width, size);
    }

    public RoundedRectangle(int height, int width, double roundRadius) {
        super(height, width);
        this.roundRadius = roundRadius;
    }

    public double getRoundRadius() {
        return roundRadius;
    }

    @Override
    public double calculateArea() {
        return (getWIDTH() * getHEIGHT())
                - (4 * (roundRadius * roundRadius))
                + (roundRadius * roundRadius * Math.PI);
    }
//    OAW:
//    @Override
//    public double calculateArea() {
//        return (super.calculateArea())
//                - (4 * (roundRadius * roundRadius))
//                + (roundRadius * roundRadius * Math.PI);
//    }

    @Override
    public String toString() {
        return "RoundedRectangle{" +
                "roundRadius=" + roundRadius +
                "} " + super.toString();
    }
}
