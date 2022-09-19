/* 인터페이스 변수에 구현 객체 대입 */
package Chapter8.interface_implements.implements_class;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();
        rc = new Audio();
    }
}
