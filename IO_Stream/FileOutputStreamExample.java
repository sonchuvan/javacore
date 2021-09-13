package IO_Stream;

import java.io.FileOutputStream;  
public class FileOutputStreamExample {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
             byte [] A = {(byte)'S',(byte)'O',(byte)'N'};
             fout.write(A);    
             String S = "\nHello World";
             byte b[] = S.getBytes();
             fout.write(b);
             fout.close();
             
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  