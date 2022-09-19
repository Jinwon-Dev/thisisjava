/* 객체 타입 확인 */
package Chapter8.promotion_polymorphism.type_check;

import Chapter8.promotion_polymorphism.casting.*;

public class Driver {
    public void drive(Vehicle vehicle) {
        if (vehicle instanceof Bus) {
            Bus bus = (Bus) vehicle;
            bus.checkFare();
        }
        vehicle.run();
    }
}
