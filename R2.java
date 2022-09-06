import java.io.IOException;
import java.io.*;
public class R2 extends Thread{
    @Override
    public void run(){
        super.run();
        try(FileWriter writer = new FileWriter("ty.txt", false))
        {
            Main h=new Main();
            h.text="Hello world";
            writer.write(h.text);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

