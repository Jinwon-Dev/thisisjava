/* 정적 초기화 블록 */
package Chapter6.static_member.static_block;

public class Television {
    static String company = "Samsung";
    static String model = "LCD";
    static String info;

    static {
        info = company + "-" + model;
    }
}
