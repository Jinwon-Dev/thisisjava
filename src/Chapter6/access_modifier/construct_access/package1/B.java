/* 생성자의 접근 제한 */
package Chapter6.access_modifier.construct_access.package1;

public class B {
    A a1 = new A(true); // (o)
    A a2 = new A(1); // (o)
    // A a3 = new A("문자열"); // (x)
}
