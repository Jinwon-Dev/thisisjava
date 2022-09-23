/* UI 클래스 */
package Chapter9.anonymous.anonymous_implements;

public class Window {
    Button button1 = new Button();
    Button button2 = new Button();

    // 필드 초기값으로 대입
    Button.OnClickListener listener = new Button.OnClickListener() {
        @Override
        public void onClick() {
            System.out.println("전화를 겁니다.");
        }
    };

    Window() {
        button1.setOnClickListener(listener);
        button2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("메시지를 보냅니다.");
            }
        });
    }
}
