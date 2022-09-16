/* Tire의 자식 클래스 */
package Chapter7.type_conversion.field_polymorphism;

public class HanKookTire extends Tire {
    // 필드

    // 생성자
    public HanKookTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    // 메소드
    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if (accumulatedRotation < maxRotation) {
            System.out.println(location + " HanKookTire 수명: " + (maxRotation - accumulatedRotation) + "회");
            return true;
        } else {
            System.out.println("*** " + location + " HanKookTire 펑크 ***");
            return false;
        }
    }
}
