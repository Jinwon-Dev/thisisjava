/* 새로운 구현 클래스 */
package Chapter8.default_methods_extends;

public class MyClassB implements MyInterface {
    @Override
    public void method1() {
        System.out.println("MyClassB-method1() 실행");
    }

    @Override
    public void method2() {
        System.out.println("MyClassB-method2() 실행");
    }
}
