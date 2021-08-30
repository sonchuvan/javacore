package JavaBasicPrograms;
import java.lang.Math;
class ArmstrongNumber{
    static void checkArmstrongNumber(int n){
        int count = 0;
        int temp = n; 
        int temp2 = n;
        do{
            temp = temp/10;
            count++;
        }while(temp>0);
        
        int last;
        double sum = 0;
        do{
            last = n%10;
            sum = sum + Math.pow(last,count);
            n = n/10;
        }while(n > 0);
        if(sum == temp2) System.out.print("is Armstrong number");
        else System.out.print("is not Armstrong number");
    }
    public static void main(String args[]){
        checkArmstrongNumber(3);
    }
}