/* 실행 클래스 */
package Chapter14.member_local_variable.class_member;

public class UsingThisExample {
    public static void main(String... args) {
        UsingThis usingThis = new UsingThis();
        UsingThis.Inner inner = usingThis.new Inner();
        inner.method();
    }
}
