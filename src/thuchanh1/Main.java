package thuchanh1;

public class Main {
    public static void main(String[] args) {

        Car carA = new Car("A");
        Car carB = new Car("B");
        Car carC = new Car("C");

        Thread threadA = new Thread(carA);
        Thread threadB = new Thread(carB);
        Thread threadC = new Thread(carC);

        //System.out.printf("");

        threadA.start();
        threadB.start();
        threadC.start();
    }
}
