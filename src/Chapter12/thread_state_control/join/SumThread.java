/* 1부터 100까지 합을 계산하는 스레드 */
package Chapter12.thread_state_control.join;

public class SumThread extends Thread {
    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    public void run() {
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
    }
}
