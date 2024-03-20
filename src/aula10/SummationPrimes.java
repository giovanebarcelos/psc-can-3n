package aula10;

/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below thirty.
*/

public class SummationPrimes {
    public static void main(String[] args){
        int somaPrimos = 0;
        for ( int num = 2; num < 10; num++){
            if (ehPrimo(num)){
                somaPrimos += num;
            }
        }
        System.out.println("Soma Primos = " + somaPrimos);
    }

    private static boolean ehPrimo(int num) {
        for (int divisor = 2; divisor < num-1; divisor++){
            if (num % divisor == 0){
                return false;
            }
        }
        return true;
    }
}

