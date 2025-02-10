
public class FIndFactorials {
    
        public static long factorial(long n){
             if (n == 1)
                    return 1;
                else
                    
                    return n*factorial(n-1);
        }
    public static void main(String[] args){
        long result = factorial(10);
        System.out.println("Factorial is " + result);
    }
}
