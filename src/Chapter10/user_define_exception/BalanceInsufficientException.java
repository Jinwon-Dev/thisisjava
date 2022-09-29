/* 사용자 정의 예외 클래스 */
package Chapter10.user_define_exception;

public class BalanceInsufficientException extends Exception {
    public BalanceInsufficientException() {

    }

    public BalanceInsufficientException(String message) {
        super(message);
    }
}
