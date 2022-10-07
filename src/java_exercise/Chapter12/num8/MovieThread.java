package java_exercise.Chapter12.num8;

public class MovieThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("동영상을 재생합니다.");
            if (Thread.interrupted()) {
                break;
            }
        }

        System.out.printf("시스템을 종료합니다.");
    }
}
