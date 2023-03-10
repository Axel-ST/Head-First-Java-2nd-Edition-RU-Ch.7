/*
 * Created by Axel_ST on 10.03.2023
 *
 *  Head First Java, 2nd Edition (RU) p. 224
 */

package poolPuzzle;

public class Boat {
    private int length;
    
    public void setLength(int len) {
        length = len;
    }
    
    public int getLength() {
        return length;
    }
    
    public void move() {
        System.out.print("drift ");
    }
}
