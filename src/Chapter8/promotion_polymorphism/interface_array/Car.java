/* 필드 다형성 */
package Chapter8.promotion_polymorphism.interface_array;

import Chapter8.promotion_polymorphism.field_polymorphism.*;

public class Car {
    Tire[] tires = {new HanKookTire(), new HanKookTire(), new HanKookTire(), new HanKookTire()};

    void run() {
        for (Tire tire : tires) {
            tire.roll();
        }
    }
}
