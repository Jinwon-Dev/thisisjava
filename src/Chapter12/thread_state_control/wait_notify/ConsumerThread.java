/* 데이터를 소비하는(읽는) 스레드 */
package Chapter12.thread_state_control.wait_notify;

public class ConsumerThread extends Thread {
    private DataBox dataBox;

    public ConsumerThread(DataBox dataBox) {
        this.dataBox = dataBox;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 3; i++) {
            String data = dataBox.getData();
        }
    }
}
