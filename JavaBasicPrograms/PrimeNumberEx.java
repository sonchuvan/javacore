package JavaBasicPrograms;
public class PrimeNumberEx{
    public static boolean primeNumber(int n){
        if (n<=1){
            return false;
        }
        else{
            for(int i=2;i<n;i++){
                if (n%i==0)
                return false;
            }
            return true;
        }
    }
    public static void main(String args[]){
        if(primeNumber(1)){
            System.out.print("number is a prime number.");
        }
        else{
            System.out.print("Number is not a prime number");
        }
    }
}