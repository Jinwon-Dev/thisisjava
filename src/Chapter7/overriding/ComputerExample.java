/* 메소드 오버라이딩 테스트 */
package Chapter7.overriding;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;

        Calculator calculator = new Calculator();
        System.out.println("원면적: " + calculator.areaCircle(r));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("원면적: " + computer.areaCircle(r));
    }
}
