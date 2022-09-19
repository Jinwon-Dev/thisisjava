/* 인터페이스 사용 */
package Chapter8.use_interface.use_abstract;

import Chapter8.interface_implements.implements_class.*;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc = null;

        rc = new Television();
        rc.turnOn();
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.turnOff();
    }
}
