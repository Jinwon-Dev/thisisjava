/* 1초 후 출력 스레드를 중지시킴 */
package Chapter12.thread_state_control.stop;

public class StopFlagExample {
    public static void main(String[] args) {
        PrintThread1 printThread = new PrintThread1();
        printThread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }

        printThread.setStop(true);
    }
}
