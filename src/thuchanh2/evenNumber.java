package thuchanh2;

public class evenNumber {
        public static void main(String[] args) {
            EvenNumbersThread evenNumbersThread = new EvenNumbersThread();
            evenNumbersThread.start();
        }
    public static class EvenNumbersThread extends Thread {
        public void run() {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println(i);
            }
        }
    }
}

