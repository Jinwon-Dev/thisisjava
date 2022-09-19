/* 기존, 수정 인터페이스 */
package Chapter8.default_methods_extends;

public interface MyInterface {
    public void method1();

    public default void method2() {
        System.out.println("MyInterface-method2 실행");
    }
}
