/* 필드 다형성 */
package Chapter8.promotion_polymorphism.field_polymorphism;

public class Car {
    Tire frontLeftTire = new HanKookTire();
    Tire frontRightTire = new HanKookTire();
    Tire backLeftTire = new HanKookTire();
    Tire backRightTire = new HanKookTire();

    void run() {
        frontLeftTire.roll();
        frontRightTire.roll();
        backLeftTire.roll();
        backRightTire.roll();
    }
}
