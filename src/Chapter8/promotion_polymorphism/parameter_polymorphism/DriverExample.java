/* 매개 변수와 다형성 테스트 */
package Chapter8.promotion_polymorphism.parameter_polymorphism;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);
        driver.drive(taxi);
    }
}
