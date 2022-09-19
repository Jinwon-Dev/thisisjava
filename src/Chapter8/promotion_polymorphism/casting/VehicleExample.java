/* 강제 타입 변환 */
package Chapter8.promotion_polymorphism.casting;

public class VehicleExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
        // vehicle.checkFare(); (x)

        Bus bus = (Bus) vehicle;

        bus.run();
        bus.checkFare();
    }
}
