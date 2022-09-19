/* 구현 클래스 */
package Chapter8.promotion_polymorphism.parameter_polymorphism;

public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}
