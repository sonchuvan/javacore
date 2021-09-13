package IO_Stream;

import java.io.*;  
public class DataOutputStreamClass {  
    public static void main(String[] args) throws IOException {  
        FileOutputStream file = new FileOutputStream("D:\\testout.txt");  
        DataOutputStream data = new DataOutputStream(file);  
        data.writeInt(65);
        data.flush();  
        data.close();  
        System.out.println("Succcess...");  
    }  
}  