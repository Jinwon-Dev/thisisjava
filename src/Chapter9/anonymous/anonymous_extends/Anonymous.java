/* 익명 자식 객체 생성 */
package Chapter9.anonymous.anonymous_extends;

public class Anonymous {
    // 필드 초기값으로 대입
    Person field = new Person() {
        void work() {
            System.out.println("출근합니다.");
        }

        @Override
        void wake() {
            System.out.println("6시에 일어납니다.");
            work();
        }
    };

    void method1() {
        // 로컬 변수값으로 대입
        Person localVar = new Person() {
            void walk() {
                System.out.println("산책합니다.");
            }

            @Override
            void wake() {
                System.out.println("7시에 일어납니다.");
                walk();
            }
        };
        // 로컬 변수 사용
        localVar.wake();
    }

    void method2(Person person) {
        person.wake();
    }
}
