/* 익명 구현 클래스 */
package Chapter8.interface_implements.anonymous_implements;

import Chapter8.interface_implements.implements_class.RemoteControl;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc = new RemoteControl() {
            public void turnOn() {
                // 실행문
            }

            public void turnOff() {
                // 실행문
            }

            public void setVolume(int volume) {
                // 실행문
            }
        };
    }
}
