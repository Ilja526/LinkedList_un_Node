import java.io.File;
public class R1 extends Thread{
    @Override
    public void run() {
        super.run();
        File directory = new File("GIVI");
        if (directory.mkdir()) {
            System.out.println("Directory created successfully");
        }
    }
}
