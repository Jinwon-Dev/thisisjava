/* 동기화 메소드로 수정된 공유 객체 */
package Chapter12.synchronized_unsynchronized.synchronized_block;

public class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    public synchronized void setMemory(int memory) {
        this.memory = memory;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        System.out.println(Thread.currentThread().getName() + ": " + this.memory);
    }
}
