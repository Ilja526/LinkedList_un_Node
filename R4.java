import java.io.FileWriter;
import java.io.IOException;
public class R4 extends Thread{
    @Override
    public void run() {
        super.run();
        try(FileWriter writer = new FileWriter("ti.txt", false))
        {
            String k="utyuytt";
            writer.write(k);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
