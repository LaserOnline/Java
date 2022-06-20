public class Example03 
{ 
    public static void main(String args[]) {

        try {
            for (int j = -1; j > -7; j--) {
                Thread.sleep(1000);
                System.out.println(j);
            }
        } catch (Exception e) {
           
            System.out.println(e);
        }
    }
}