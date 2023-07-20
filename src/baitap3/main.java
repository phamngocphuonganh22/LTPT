package baitap3;

public class main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization();

        Thread lazyThread = new Thread(lazyPrimeFactorization);
        Thread optimiThread = new Thread(optimizedPrimeFactorization);

        lazyThread .start();
        optimiThread .start();
    }
}
