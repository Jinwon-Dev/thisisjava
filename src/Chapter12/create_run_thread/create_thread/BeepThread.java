/* 비프음을 들려주는 스레드 */
package Chapter12.create_run_thread.create_thread;

import java.awt.*;

public class BeepThread extends Thread {
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}
