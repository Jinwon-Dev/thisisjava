/* 제네릭 메소드 */
package Chapter13.generic_method.example1;

public class Util {
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<T>();
        box.set(t);
        return box;
    }
}
