import java.io.*;
public class R4 extends Thread{
    @Override
    public void run() {
        super.run();
        try(FileWriter writer = new FileWriter("ti.txt", false))
        {
            String j="Hello World20";
            writer.write(j);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
