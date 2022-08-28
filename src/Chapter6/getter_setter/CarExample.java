/* Getter와 Setter 메소드 사용 */
package Chapter6.getter_setter;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        // 잘못된 속도 변경
        myCar.setSpeed(-50);

        System.out.println("현재 속도 : " + myCar.getSpeed());

        // 올바른 속도 변경
        myCar.setSpeed(60);

        // 멈춤
        if (!myCar.isStop()) {
            myCar.setStop(true);
        }

        System.out.println("현재 속도 : " + myCar.getSpeed());
    }
}
