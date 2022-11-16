/* 텍스트 파일 읽기 */
package Chapter18.file_input_output.file_reader;

import java.io.FileReader;

public class FileReaderExample {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("C:/JavaProgramming/source/chap18/src/sec04/exam04_file_reader/FileReaderExample.java");

        int readCharNo;
        char[] cbuf = new char[100];
        while ((readCharNo = fr.read(cbuf)) != -1) {
            String data = new String(cbuf, 0, readCharNo);
            System.out.print(data);
        }
        fr.close();
    }
}


