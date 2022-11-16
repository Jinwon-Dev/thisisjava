/* 텍스트 파일을 읽고 출력 */
package Chapter18.file_input_output.file_input_stream;

import java.io.FileInputStream;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:/JavaProgramming/source/chap18/src/sec04/exam02_fileinputstream/FileInputStreamExample.java");
            int data;
            while ((data = fis.read()) != -1) {
                System.out.write(data);
            }
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


