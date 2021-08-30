package JavaBasicPrograms;
class Factorial{
    public static void factorial(int n){
        int fac = 1;
        for(int i=1;i<=n;i++){
            fac = fac*i;
        }
        System.out.println(n+"! = "+fac);
    }
    static int factorial_recursion(int n){    
        if (n == 0)    
          return 1;    
        else    
          return(n * factorial_recursion(n-1));    
       }    
    public static void main(String args[]){
        factorial(9);
        System.out.print(factorial_recursion(9));
    }
}