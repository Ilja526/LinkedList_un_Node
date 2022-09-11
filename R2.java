import java.io.*;
public class R2 extends Thread{
    @Override
    public void run() {
        super.run();
        try(FileWriter writer = new FileWriter("GOGI//ty.txt", false))
        {
            Main h=new Main();
            h.text="Hello World";
            writer.write(h.text);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
