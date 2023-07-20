package baitap1;

public class NumberGenerator implements Runnable{
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        Thread number = new Thread(numberGenerator);
        Thread number1 = new Thread(numberGenerator);
        number.start();
        number1.start();
        System.out.println("hashCode" + numberGenerator.hashCode());
    }
}
