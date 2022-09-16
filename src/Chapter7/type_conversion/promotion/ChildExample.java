/* 자동 타입 변환 후의 멤버 접근 */
package Chapter7.type_conversion.promotion;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child;
        parent.method1();
        parent.method2();
        // parent.method3(); 호출 불가능
    }
}
