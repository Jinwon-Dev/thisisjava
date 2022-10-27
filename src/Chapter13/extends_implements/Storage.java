/* 제네릭 인터페이스 */
package Chapter13.extends_implements;

public interface Storage<T> {
    public void add(T item, int index);

    public T get(int index);
}
