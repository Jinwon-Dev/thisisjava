/* 자식 인터페이스 */
package Chapter8.default_methods_extends;

public interface ChildInterface3 extends ParentInterface {
    @Override
    public void method2(); // 추상 메소드로 재선언

    public void method3();
}
