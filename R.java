import java.io.File;
public class R extends Thread{
    @Override
    public void run(){
        super.run();
        File directory=new File("GIVI");
        if(directory.mkdir()){
            System.out.println("Directory created successfully");
        }
    }
}
