/* protected 접근 제한자 테스트 */
package Chapter7.protected_access_modifier.package1;

public class B {
    public void method() {
        A a = new A(); // (o)
        a.field = "value"; // (o)
        a.method(); // (o)
    }
}
