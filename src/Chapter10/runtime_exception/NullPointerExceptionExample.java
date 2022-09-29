/* NullPointerException이 발생하는 경우 */
package Chapter10.runtime_exception;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String data = null;
        System.out.println(data.toString());
    }
}
