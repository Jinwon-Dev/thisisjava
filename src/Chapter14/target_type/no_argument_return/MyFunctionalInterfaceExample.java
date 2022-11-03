/* 람다식 */
package Chapter14.target_type.no_argument_return;

public class MyFunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface fi;

        fi = () -> {
            String str = "method call1";
            System.out.println(str);
        };
        fi.method();

        fi = () -> {
            System.out.println("method call2");
        };
        fi.method();

        fi = () -> System.out.println("method call3");
        fi.method();
    }
}
