public class Ep_While_Loop6 {
    public static void main(String[] args) {
        int num = 1;
        while (true) {
            System.out.println("รอบที่ = " + num);
            num++;
            if (num > 100)
                break;
        }
    }
}
