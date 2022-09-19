/* 필드 다형성 테스트 */
package Chapter8.promotion_polymorphism.interface_array;

import Chapter8.promotion_polymorphism.field_polymorphism.*;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.run();

        myCar.tires[0] = new KumhoTire();
        myCar.tires[1] = new KumhoTire();

        myCar.run();
    }
}
