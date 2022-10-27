/* 제네릭 타입 */
package Chapter13.generic_type;

public class Box<T> {
//    private Object object;
//
//    public void set(Object object) {
//        this.object = object;
//    }
//
//    public Object get() {
//        return object;
//    }

    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }
}
