import java.io.*;
public class Main {
    public String text;
    public static void main(String[] args){
        System.out.println("Start");
        R1 t=new R1();
        R2 t2=new R2();
        R3 t3=new R3();
        R4 t4=new R4();
        t.start();
        t2.start();
        t3.start();
        t4.start();
        try{
            t.join();
            t2.join();
            t3.join();
            t4.join();
        }
        catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        String fileInput="GIVI"+File.separator+"ty.txt";
        String fileoutput="GOGI"+File.separator+"ti.txt";
        try {
            FileReader fr=new FileReader(fileInput);
            FileWriter fw=new FileWriter(fileoutput);
            int c;
            while((c=fr.read())!=-1) {
                fw.write(c);
            }
            fr.close();
            fw.close();
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }
}