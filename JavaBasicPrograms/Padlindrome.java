package JavaBasicPrograms;
class Padlindrome{
    public static void checkPalindrome(int n){
        int n1 = n;
        int temp = 0;
        int last;
        do{
            last = n%10;
            n = n/10;
            if( temp == 0 ){
                temp+=last;
            }
            else{
                temp = temp*10 +last;
            }
        }while(n>0);
        if( temp == n1 ) System.out.print(temp + " is palindrome");
        else System.out.print(temp+ " is not palindrome");
        
    }
    public static void main(String args[]){
        checkPalindrome(123421);
    }
}