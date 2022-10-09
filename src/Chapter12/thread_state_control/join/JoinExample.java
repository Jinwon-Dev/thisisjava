/* 다른 스레드가 종료될 때까지 일시 정지 상태 유지 */
package Chapter12.thread_state_control.join;

public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();

        try {
            sumThread.join();
        } catch (InterruptedException e) {

        }

        System.out.println("1~100 합: " + sumThread.getSum());
    }
}
