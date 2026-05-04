public class TaskOne {
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void isTwinPrime() {
        int num = 0;
        System.out.println("Twin primes");

        for (int i = 2; i < 1200; i++){
            if(isPrime(i)){
                if ( num != 0 && (i - num) == 2 ){
                    System.out.println(num + " and " + i);
                }

                num = i;
            }
        }
    }

    public static void main(String[] args) {
            isTwinPrime();
    }
}
