/* 추상 메소드 오버라이딩 */
package Chapter7.abstract_class;

public class Dog extends Animal {
    public Dog() {
        this.kind = "포유류";
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
