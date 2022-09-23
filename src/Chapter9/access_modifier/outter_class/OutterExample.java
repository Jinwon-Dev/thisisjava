/* 실행 클래스 */
package Chapter9.access_modifier.outter_class;

public class OutterExample {
    public static void main(String[] args) {
        Outter outter = new Outter();
        Outter.Nested nested = outter.new Nested();
        nested.print();
    }
}
