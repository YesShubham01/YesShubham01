import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter=0;
        int i =2;
        System.out.print(n +"th prime whole number is: ");
        System.out.println(nth_prime_number(n, counter, i));

    }

    static int nth_prime_number(int n , int counter, int i) {
        if(isPrime(i)) {
            if(counter==n-1) {
                return i;
            }
            counter++;
        }
        int result = nth_prime_number(n, counter, i+1);
        return result;
    }

    static boolean isPrime(int n) {
        for (int i =2; i <n; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}