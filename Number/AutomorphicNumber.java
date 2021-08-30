package Number;

public class AutomorphicNumber {
    public static void main(String[] args) {
        int num = 5;

        double square = num*num;
        if(num < 10){
            if(num%10 == (int)square%10) 
            System.out.print(num +" is Automorphic Number");
            else
            System.out.print(num +" is not Automorphic Number");
        }
        else{
            if(num%100 == (int)square%100) 
            System.out.print(num +" is Automorphic Number");
            else
            System.out.print(num +" is not Automorphic Number");
        }
    }
}
