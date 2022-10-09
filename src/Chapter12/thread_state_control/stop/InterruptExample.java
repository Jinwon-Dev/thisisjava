/* 1초 후 출력 스레드를 중지시킴 */
package Chapter12.thread_state_control.stop;

public class InterruptExample {
    public static void main(String[] args) {
        Thread thread = new PrintThread2();
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }

        thread.interrupt();
    }
}
