/*
 * Created by Axel_ST on 10.03.2023
 *
 *  Head First Java, 2nd Edition (RU) p. 224
 */

package poolPuzzle;

public class TestBoats {
    public static void main(String[] args) {
        Boat b1 = new Boat();
        Sailboat b2 = new Sailboat();
        Rowboat b3 = new Rowboat();
        b2.setLength(32);
        b1.move();
        b3.move();
        b2.move();
    }
}
