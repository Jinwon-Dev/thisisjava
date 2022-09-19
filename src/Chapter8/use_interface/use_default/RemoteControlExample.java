/* 디폴트 메소드 사용 */
package Chapter8.use_interface.use_default;

import Chapter8.interface_implements.implements_class.*;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc = null;

        rc = new Television();
        rc.turnOn();
        rc.setMute(true);

        rc = new Audio();
        rc.turnOn();
        rc.setMute(true);
    }
}
