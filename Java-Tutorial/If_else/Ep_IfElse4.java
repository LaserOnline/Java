
import java.util.Scanner;

public class Ep_IfElse4 
{
    public static void main(String args[])
    {
        int a = 0;
        while ( a == 0)
        {
            Scanner kb=new Scanner(System.in);
            System.out.print("กรุณากดเลือก  1 หรือ 2 ");
            int i = kb.nextInt();
            
            if (i <= 0 || i >= 3)
            {
                System.out.println("กรุณา เลือก 1 หรือ 2 เท่านั้น "); 
            }
            else if (i == 1)
            {
                System.out.println("⠄⠄⠄⠄⠄⠄⠄⢎⢗⣾⠫⡫⢖⢄⠄⠄⠄⠄⠄⠄⠄⠄⠄ ");
                System.out.println("⠄⠄⠄⠄⠄⢀⡎⠒⠐⠾⠛⠙⣆⡢⠑⢣⠄⠄⠄⠄⠄⠄⠄⠄ ");
                System.out.println("⠄⠄⠄⠄⢠⢾⡦⢒⡁⣰⣿⣿⣦⡐⣳⣩⢇⠄⠄⠄⠄⠄⠄⠄ ");
                System.out.println("⠄⠄⠄⠄⡾⣢⢭⠔⣴⠒⢺⣿⣯⠥⠑⠑⡾⡄⠄⠄⠄⠄⠄⠄ ");
                System.out.println("⠄⠄⠄⠄⣷⡡⠁⠣⣿⣿⣿⣿⢿⣶⣠⢪⠒⡟⠄⠄⠄⠄⠄⠄ ");
                System.out.println("⠄⠄⠄⢠⡼⠾⡀⡄⣿⣿⢿⡏⢾⡇⣘⡽⠱⢧⡀⠄⠄⠄⠄⠄ ");
                System.out.println("⠄⠄⠄⠄⠉⠉⠱⢦⣘⢿⣾⣶⢟⣠⡀⡄⢔⠏⠁⠄⠄⠄⠄⠄ ");
                System.out.println("⠄⠄⠄⠄⠄⠄⣠⢼⣿⣷⣶⣾⡷⢸⣗⣯⣿⣶⣿⣶⡄⠄⠄⠄ ");
                System.out.println("⠄⠄⣀⣤⣴⣾⣿⣷⣭⣭⣭⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⡀⠄⠄ ");
                System.out.println("⠄⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣸⣿⣿⣧⠄⠄ ");
                System.out.println("⠄⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⢻⣿⣿⡄⠄ ");
                System.out.println("⠄⢸⣿⣮⣿⣿⣿⣿⣿⣿⣿⡟⢹⣿⣿⣿⡟⢛⢻⣷⢻⣿⣧⠄ ");
                System.out.println("⠄⠄⣿⡏⣿⡟⡛⢻⣿⣿⣿⣿⠸⣿⣿⣿⣷⣬⣼⣿⢸⣿⣿⠄ ");
                System.out.println("⠄⠄⣿⣧⢿⣧⣥⣾⣿⣿⣿⡟⣴⣝⠿⣿⣿⣿⠿⣫⣾⣿⣿⡆ ");
                System.out.println("⠄⠄⢸⣿⣮⡻⠿⣿⠿⣟⣫⣾⣿⣿⣿⣷⣶⣾⣿⡏⣿⣿⣿⡇ ");
                System.out.println("⠄⠄⢸⣿⣿⣿⡇⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⣿⣿⣿⡇ ");
                System.out.println("⠄⠄⢸⣿⣿⣿⡇⠄⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢸⣿⣿⣿⠄ ");
                System.out.println("⠄⠄⣼⣿⣿⣿⢃⣾⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⣿⣿⣿⡇⠄ ");
                System.out.println("⠄⠄⣿⣿⡟⣵⣿⣿⣿⣿⣿⣿⣿⣿⡟⢻⣿⣿⢇⣿⣿⡿⠄⠄ ");
            }
            else if (i == 2)
            {
                System.out.println("⠄⠄⠄⠄⠄⠄⢴⡶⣶⣶⣶⡒⣶⣶⣖⠢⡄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄");
                System.out.println("⠄⠄⠄⠄⠄⠄⢠⣿⣋⣿⣿⣉⣿⣿⣯⣧⡰⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄");
                System.out.println("⠄⠄⠄⠄⠄⠄⣿⣿⣹⣿⣿⣏⣿⣿⡗⣿⣿⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄");
                System.out.println("⠄⠄⠄⠄⠄⠄⠟⡛⣉⣭⣭⣭⠌⠛⡻⢿⣿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄");
                System.out.println("⠄⠄⠄⠄⠄⠄⠄⠄⣤⡌⣿⣷⣯⣭⣿⡆⣈⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄");
                System.out.println("⠄⠄⠄⠄⠄⠄⠄⢻⣿⣿⣿⣿⣿⣿⣿⣷⢛⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄");
                System.out.println("⠄⠄⠄⠄⠄⠄⠄⠄⢻⣷⣽⣿⣿⣿⢿⠃⣼⣧⣀⠄⠄⠄⠄⠄⠄⠄⠄⠄");
                System.out.println("⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣛⣻⣿⠟⣀⡜⣻⢿⣿⣿⣶⣤⡀⠄⠄⠄⠄⠄");
                System.out.println("⠄⠄⠄⠄⠄⠄⠄⠄⢠⣤⣀⣨⣥⣾⢟⣧⣿⠸⣿⣿⣿⣿⣿⣤⡀⠄⠄⠄");
                System.out.println("⠄⠄⠄⠄⠄⠄⠄⠄⢟⣫⣯⡻⣋⣵⣟⡼⣛⠴⣫⣭⣽⣿⣷⣭⡻⣦⡀⠄");
                System.out.println("⠄⠄⠄⠄⠄⠄⠄⢰⣿⣿⣿⢏⣽⣿⢋⣾⡟⢺⣿⣿⣿⣿⣿⣿⣷⢹⣷⠄");
                System.out.println("⠄⠄⠄⠄⠄⠄⠄⣿⣿⣿⢣⣿⣿⣿⢸⣿⡇⣾⣿⠏⠉⣿⣿⣿⡇⣿⣿⡆");
                System.out.println("⠄⠄⠄⠄⠄⠄⠄⣿⣿⣿⢸⣿⣿⣿⠸⣿⡇⣿⣿⡆⣼⣿⣿⣿⡇⣿⣿⡇");
                System.out.println("⠇⢀⠄⠄⠄⠄⠄⠘⣿⣿⡘⣿⣿⣷⢀⣿⣷⣿⣿⡿⠿⢿⣿⣿⡇⣩⣿⡇");
                System.out.println("⣿⣿⠃⠄⠄⠄⠄⠄⠄⢻⣷⠙⠛⠋⣿⣿⣿⣿⣿⣷⣶⣿⣿⣿⡇⣿⣿⡇");
            }          
        }
    }
}
