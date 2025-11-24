public class Primes {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[N + 1];
        
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }
        int p = 2;
        while (p * p <= N) {
            
            if (isPrime[p] == true) {
                
                for (int i = p * p; i <= N; i = i + p) {
                    isPrime[i] = false;
                }
            }
            p++;
        }
        System.out.println("Prime numbers up to " + N + ":");
        int primeCount = 0;
        for (int i = 2; i <= N; i++) {
            if (isPrime[i] == true) {
                System.out.println(i);
                primeCount++;
            }
        }
        double percentage = ((double) primeCount / N) * 100;

        System.out.println("There are " + primeCount + " primes between 2 and " + N + 
                           " (" + Math.round(percentage) + "% are primes)");
    }
}