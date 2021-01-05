public class Main {
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(5, 4);
        System.out.println(myRectangle.calculateArea());
        myRectangle.printRectangle();
        RoundedRectangle myRoundedRectangle = new RoundedRectangle(5, 4, 2.0);
        System.out.println(myRoundedRectangle.toString());
    }
}
