/* 필드와 메소드의 접근 제한 */
package Chapter6.access_modifier.field_method_access.package2;

import Chapter6.access_modifier.field_method_access.package1.A;

public class B {
    public void C() {
        A a = new A();
        a.field1 = 1; // (o)
        // a.field2 = 1; // (x)
        // a.field3 = 1; // (x)

        a.method1(); // (o)
        // a.method2(); // (x)
        // a.method3(); // (x)
    }
}
