package java_exercise.Chapter10;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {

    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
