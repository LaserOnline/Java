import java.io.IOException;

public class Ep_For3 {
    public static void main(String args[]) throws IOException

    {
        double balance = 100;
        for (int i = 0; i < 95; i++) {
            balance *= 1.05;
        }
        System.out.println(balance);
    }
}
