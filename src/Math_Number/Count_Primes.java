package Math_Number;

public class Count_Primes {


    public static void main(String[] args){

        System.out.println(countPrimes(3));
    }


    public static int countPrimes(int n) {


        int count=0;

        for(int i=2; i<=n; i++){   //if we count n=2 as prime then (<=) else (<);
            if(isPrime(i)) count++;
        }

        return count;


    }

    public static boolean isPrime(int n){
        if(n == 2) return true;
        if(n%2==0) return false;

        for(int i=3; i*i<=n; i+=2){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }
}
