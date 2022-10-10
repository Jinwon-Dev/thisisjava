/* 현재 실행 중인 스레드 정보 */
package Chapter12.thread_group;

import Chapter12.daemon_thread.AutoSaveThread;

import java.util.Map;
import java.util.Set;

public class ThreadInfoExample {
    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setName("AutoSaveThread");
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
        Set<Thread> threads = map.keySet();
        for (Thread thread : threads) {
            System.out.println("Name: " + thread.getName() + ((thread.isDaemon()) ? "(데몬)" : "(주)"));
            System.out.println("\t" + "소속그룹: " + thread.getThreadGroup().getName());
            System.out.println();
        }
    }
}
