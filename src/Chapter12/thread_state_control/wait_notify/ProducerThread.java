/* 데이터를 생산(저장)하는 스레드 */
package Chapter12.thread_state_control.wait_notify;

public class ProducerThread extends Thread {
    private DataBox dataBox;

    public ProducerThread(DataBox dataBox) {
        this.dataBox = dataBox;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            String data = "Data" + i;
            dataBox.setData(data);
        }
    }
}
