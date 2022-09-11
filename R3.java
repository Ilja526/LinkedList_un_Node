import java.io.File;
public class R3 extends Thread{
    @Override
    public void run() {
        super.run();
        File directory = new File("GOGI");
        if (directory.mkdir()) {
            System.out.println("Directory created successfully2");
        }
    }
}
