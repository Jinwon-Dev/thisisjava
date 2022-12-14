/* 제네릭 타입 사용 클래스 */
package Chapter13.extends_implements;

public class ChildProductAndStorageExample {
    public static void main(String[] args) {
        ChildProduct<Tv, String, String> product = new ChildProduct<>();
        product.setKind(new Tv());
        product.setModel("SmartTV");
        product.setCompany("Samsung");

        Storage<Tv> storage = new StorageImpl<Tv>(100);
        storage.add(new Tv(), 0);
        Tv tv = storage.get(0);
    }
}
