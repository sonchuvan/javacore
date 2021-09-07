package JavaOOP;

class TryCatch{
    public static void a() throws Exception{
        try {
            throw new Exception();
        } finally{
            System.out.print("finally");
        }
    }
    public static void main(String[] args) {
        try {
            a();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            System.out.print("finally1");
        }
        System.out.print("finish");
    }
}