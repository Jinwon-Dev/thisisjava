/* InterruptedException이 발생할 때 스레드가 종료되도록 함 */
package Chapter12.thread_group;

public class WorkThread extends Thread {
    public WorkThread(ThreadGroup threadGroup, String threadName) {
        super(threadGroup, threadName);
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted");
                break;
            }
        }

        System.out.printf(getName() + " 종료됨");
    }
}
