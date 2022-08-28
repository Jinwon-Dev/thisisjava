/* final 필드 선언과 초기화 */
package Chapter6.final_constant.final_field;

public class Person {
    final String nation = "Korea";
    final String ssn;
    String name;

    public Person(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
