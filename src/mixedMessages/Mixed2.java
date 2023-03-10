/*
 * Created by Axel_ST on 10.03.2023
 *
 *  Head First Java, 2nd Edition (RU) p. 222
 */

package mixedMessages;

public class Mixed2 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();
        
        b.m1();
        c.m2();
        a.m3(); // like 2 answer
        System.out.println();
        c.m1();
        c.m2();
        c.m3(); // like 4 answer
        System.out.println();
        a.m1();
        b.m2();
        c.m3(); // like 7 answer
        System.out.println();
        a2.m1();
        a2.m2();
        a2.m3(); // like 4 answer
    }
}
