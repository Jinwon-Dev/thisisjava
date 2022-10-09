/* 스레드 실행 양보 예제 */
package Chapter12.thread_state_control.yield;

public class YieldExample {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();

        threadA.start();
        threadB.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }

        threadA.stop = true;
        threadB.stop = true;
    }
}
