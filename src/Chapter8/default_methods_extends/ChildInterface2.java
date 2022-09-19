/* 자식 인터페이스 */
package Chapter8.default_methods_extends;

public interface ChildInterface2 extends ParentInterface {
    @Override
    public default void method2() { // 재정의
        /* 실행문 */
    }

    public void method3();
}
