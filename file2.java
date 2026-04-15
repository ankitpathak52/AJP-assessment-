import java.io.*;
public class file2 {
    public static void main(String[] args) {
        FileReader fr=null;
        try{
            fr = new FileReader("D:\\test.txt");
            int i;
            while((i=fr.read())!=-1){
                System.out.print((char)i);
            }
        }catch(Exception e){
            System.out.println(e);
        }finally{
            try{
                fr.close();
            }catch (IOException e){
                System.out.println(e);
            }
        }//file reading code 

    }
    
}

