/* 추상 메소드 선언 */
package Chapter7.abstract_class;

public abstract class Animal {
    public String kind;

    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }

    public abstract void sound();
}
