/* ThreadB 클래스 */
package Chapter12.create_run_thread.thread_name;

public class ThreadB extends Thread {
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println(getName() + "가 출력한 내용");
        }
    }
}
