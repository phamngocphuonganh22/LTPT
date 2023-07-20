package baitap3;

public class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        System.out.println("OptimizedPrimeFactorization");
        int num = 2;
        while (true) {
            if (isPrime(num)) {
                System.out.println("OptimizedPrimeFactorization" + num + "isPrime.");
            }
            num++;
        }
    }

    public boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % 1 == 0) {
                return false;
            }
        }
        return true;
    }
}
