import java.io.*;
//used for reading data from the file
public class file3 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try{
            fis = new FileInputStream("D:\\demo.txt");
            int i;
            while((i=fis.read())!=-1){
                System.out.print((char)i);
            }
        }catch(Exception e){
            System.out.println(e);
        }finally{
            try{
                fis.close();
            }catch (IOException e){
                System.out.println(e);
            }
        }

    }
    
}
