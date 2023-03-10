/*
 * Created by Axel_ST on 10.03.2023
 *
 * Head First Java, 2nd Edition (RU) p. 223
 */

package monsters;

public class MonsterTestDrive {
    public static void main(String[] args) {
        Monster[] ma = new Monster[3];
        ma[0] = new Vampire();
        ma[1] = new Dragon();
        ma[2] = new Monster();
        for (int x = 0; x < 3; x++) {
            ma[x].frighten(x);
        }
    }
}
