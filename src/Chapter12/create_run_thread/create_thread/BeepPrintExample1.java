/* 메인 스레드만 이용한 경우 */
package Chapter12.create_run_thread.create_thread;

import java.awt.*;

public class BeepPrintExample1 {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }

        }

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}
