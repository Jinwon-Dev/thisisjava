/* 구현 클래스 */
package Chapter8.promotion_polymorphism.field_polymorphism;

public class HanKookTire implements Tire {
    @Override
    public void roll() {
        System.out.println("한국 타이어가 굴러갑니다.");
    }
}
