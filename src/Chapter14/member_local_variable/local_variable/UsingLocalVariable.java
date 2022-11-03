/* final 특성을 가지는 로컬 변수 */
package Chapter14.member_local_variable.local_variable;

public class UsingLocalVariable {
    void method(int arg) { // arg는 final 특성을 가짐
        int localVar = 40; // localVar는 final 특성을 가짐

        // arg = 31;
        // localVar = 41;

        // 람다식
        MyFunctionalInterface fi = () -> {
            // 로컬 변수 읽기
            System.out.println("arg: " + arg);
            System.out.println("localVar: " + localVar + "\n");
        };

        fi.method();
    }
}
