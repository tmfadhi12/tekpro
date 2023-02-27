import java.text.DecimalFormat;

public class PaintThings {
    public static void main(String[] args) {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);    

        Rectangle deck = new Rectangle(20, 35);
        Sphere bigBall = new Sphere(15);
        Cylinder tank = new Cylinder(10, 30);

        double deckAmt = paint.amount(deck), ballAmt = paint.amount(bigBall), tankAmt = paint.amount(tank);

        DecimalFormat ftm = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed...\n");
        System.out.println("Deck " + ftm.format(deckAmt) + "\n");
        System.out.println("Bigball " + ftm.format(ballAmt) + "\n");
        System.out.println("Deck " + ftm.format(tankAmt) + "\n");
    }
}
