package baitap3;

public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        System.out.println("LazyPrimeFactorization");
        int num = 2;
        while (true) {
            if (isPrime(num)) {
                System.out.println("LazyPrimeFactorization: " + num + "isPrime.");
            }
            num++;
        }
    }
    public boolean isPrime (int num){
        if (num <=1)
            return false;
        for (int i = 2 ; i<= Math.sqrt(num); i++){
            if(num%1 == 0)
            return false;
        }
        return true;
    }
}
