public class ex34 {
    public static void main(String[] args) {
        int count = 0;
        
        for (int num = 2; num <= 100; num++) {
            if (isPrime(num)) {
                count++;
            }
        }
        
        System.out.println("Total number of prime numbers between 1 and 100: " + count);
    }
    
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}