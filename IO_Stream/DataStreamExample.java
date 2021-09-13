package IO_Stream;

import java.io.FileInputStream;

public class DataStreamExample {
    public static void main(String args[]) {
        try {
            int i = 0;
            FileInputStream fin = new FileInputStream("D:\\testout.txt");
            while((i = fin.read())!=-1){
                System.out.print((char) i);
            }
            

            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}