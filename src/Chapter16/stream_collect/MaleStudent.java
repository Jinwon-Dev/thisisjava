/* 남학생이 저장되는 컨테이너 */
package Chapter16.stream_collect;

import java.util.ArrayList;
import java.util.List;

public class MaleStudent {
    private List<Student> list;

    public MaleStudent() {
        list = new ArrayList<Student>();
        System.out.println("[" + Thread.currentThread().getName() + "] MaleStudent()");
    }

    public void accumulate(Student student) {
        list.add(student);
        System.out.println("[" + Thread.currentThread().getName() + "] accumulate()");
    }

    public void combine(MaleStudent other) {
        list.addAll(other.getList());
        System.out.println("[" + Thread.currentThread().getName() + "] combine()");
    }

    public List<Student> getList() {
        return list;
    }
}
