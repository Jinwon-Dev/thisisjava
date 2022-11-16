/* 아이디와 패스워드를 콘솔로부터 얻음 */
package Chapter18.console_input_output.console_class;

import java.io.Console;

public class ConsoleExample {
    public static void main(String[] args) {
        Console console = System.console();

        System.out.print("아이디: ");
        String id = console.readLine();

        System.out.print("패스워드: ");
        char[] charPass = console.readPassword();
        String strPassword = new String(charPass);

        System.out.println("---------------------");
        System.out.println(id);
        System.out.println(strPassword);
    }
}
