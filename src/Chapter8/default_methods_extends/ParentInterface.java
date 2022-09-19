/* 부모 인터페이스 */
package Chapter8.default_methods_extends;

public interface ParentInterface {
    public void method1();

    public default void method2() {
        /* 실행문 */
    }
}
