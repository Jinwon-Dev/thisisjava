/* 스레드 실행 양보 예제 */
package Chapter12.thread_state_control.yield;

public class ThreadB extends Thread {
    public boolean stop = false;
    public boolean work = true;

    public void run() {
        while (!stop) {
            if (work) {
                System.out.println("ThreadB 작업 내용");
            } else {
                Thread.yield();
            }
        }

        System.out.printf("ThreadB 종료");
    }
}
