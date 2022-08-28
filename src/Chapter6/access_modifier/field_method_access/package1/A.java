/* 필드와 메소드의 접근 제한 */
package Chapter6.access_modifier.field_method_access.package1;

public class A {
    // 필드
    public int field1;
    int field2;
    private int field3;

    // 생성자
    public A() {
        field1 = 1; // (o)
        field2 = 1; // (o)
        field3 = 1; // (o)

        method1(); // (o)
        method2(); // (o)
        method3(); // (o)
    }

    // 메소드
    public void method1() {

    }

    void method2() {

    }

    private void method3() {

    }
}
