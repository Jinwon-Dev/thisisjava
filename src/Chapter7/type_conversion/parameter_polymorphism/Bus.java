/* 자식 클래스 */
package Chapter7.type_conversion.parameter_polymorphism;

public class Bus extends Vehicle {
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}
