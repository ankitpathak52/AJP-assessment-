import java.io.*;
public class fileexist {
    public static void main(String[] args) {
        File f = new File("D:\\demo.txt");
        // System.out.println(f.exists());
         try{
            if(f.createNewFile())
                System.out.println("created successfully");
                else
                System.out.println("alrady exists");
        } catch(IOException e) {
            System.out.println(e);
        }
        System.out.println(f.exists());
        // System.out.println(f.length());
        // System.out.println(f.delete());
    }
}
