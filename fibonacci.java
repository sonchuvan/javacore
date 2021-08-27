class fibonacci{
    public static void fibonacci_unrecursion(){
        int n1 = 0;
        int n2 = 1;
        int n3;
        int count = 10;
        System.out.print(n1+ " " +n2);
        do {
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            count--;
        } while (count > 0);
        
    }
    public static void fibonacci_recursion(int n1,int n2,int count){
        int n3 = n1 + n2;
        if(count ==0){
            return;
        }else{
            System.out.print(" " + n3);
            fibonacci_recursion(n2,n3,count-1);
        }
    }
    public static void main(String args[]){
        fibonacci_unrecursion();
        System.out.println();
        System.out.print("0" + " " + "1");
        fibonacci_recursion(0,1,10);
    }
}