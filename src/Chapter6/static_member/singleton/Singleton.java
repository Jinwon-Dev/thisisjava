/* 싱글톤 */
package Chapter6.static_member.singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    static Singleton getInstance() {
        return singleton;
    }
}
