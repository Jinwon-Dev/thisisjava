/* 생성자의 접근 제한 */
package Chapter6.access_modifier.construct_access.package2;

import Chapter6.access_modifier.construct_access.package1.A;

public class C {
    A a1 = new A(true); // (o)
    // A a2 = new A(1); // (x)
    // A a3 = new A("문자열"); // (x)
}
