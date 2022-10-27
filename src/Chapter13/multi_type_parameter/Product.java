/* 제네릭 클래스 */
package Chapter13.multi_type_parameter;

public class Product<T, M> {
    private T kind;
    private M model;

    public T getKind() {
        return this.kind;
    }

    public M getModel() {
        return this.model;
    }

    public void setKind(T kind) {
        this.kind = kind;
    }

    public void setModel(M model) {
        this.model = model;
    }
}
