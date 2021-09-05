package Number;


public class Reverse {
    private int a;
    /**
     * @param a the a to set
     */
    public void setA(int a) {
        if(a >= 0){
            this.a = a;
        }
        
    }
    /**
     * @return the a
     */
    public int getA() {
        return a;
    }
    static void reverse(int n) {
        int temp = n;
        int sum = 0;
        do {
            sum = sum * 10 + (temp % 10);
            temp = temp / 10;
        } while (temp > 0);
        System.out.println(n + " =>>> " + sum);

    }

    static int reverseRecursion(int n){
        int digit = (int)Math.log10(n);
        if(n == 0)
        return n;
        else
        return  ((n%10)*(int)Math.pow(10, digit)) + reverseRecursion(n/10);
    }

    public static void main(String args[]) {
        reverse(1234);
        System.out.println(reverseRecursion(123));
    }
}
