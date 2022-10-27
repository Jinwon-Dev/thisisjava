/* 제네릭 타입 이용 */
package Chapter13.generic_type;

public class BoxExample {
//    public static void main(String[] args) {
//        Box box = new Box();
//        box.set("홍길동"); // 강제 타입 변환
//        String name = (String) box.get(); // 강제 타입 변환
//
//        box.set(new Apple()); // 강제 타입 변환
//        Apple apple = (Apple) box.get(); // 강제 타입 변환
//    }

    public static void main(String[] args) {
        Box<String> box1 = new Box<String>();
        box1.set("hello");
        String str = box1.get();

        Box<Integer> box2 = new Box<Integer>();
        box2.set(6);
        int value = box2.get();
    }
}
