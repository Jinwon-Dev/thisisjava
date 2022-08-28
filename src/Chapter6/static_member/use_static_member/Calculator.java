/* 정적 멤버 사용 */
package Chapter6.static_member.use_static_member;

public class Calculator {
    static double pi = 3.14159;

    static int plus(int x, int y) {
        return x + y;
    }

    static int minus(int x, int y) {
        return x - y;
    }
}
