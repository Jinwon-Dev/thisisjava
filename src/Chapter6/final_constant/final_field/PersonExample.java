/* final 필드 테스트 */
package Chapter6.final_constant.final_field;

public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("123456-1234567", "계백");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        p1.name = "을지문덕";
    }
}
