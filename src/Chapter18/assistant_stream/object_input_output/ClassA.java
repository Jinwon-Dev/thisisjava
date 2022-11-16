/* 직렬화가 가능한 클래스 */
package Chapter18.assistant_stream.object_input_output;

import java.io.Serializable;

public class ClassA implements Serializable {
    int field1;
    ClassB field2 = new ClassB();
    static int field3;
    transient int field4;
}
