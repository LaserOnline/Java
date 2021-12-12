 import java.io.*;

 public class Ep_StudentCredits
 {
 public static void main(String args[]) throws IOException
 {
 String studentID = "", studentName = "";
 String scoresStr = "", creditsStr = "";

 double scores = 0.0;
 int credits = 0, creditsTotal = 0;

 FileReader readFile = new FileReader("studentScoresCredits.txt");
 BufferedReader dataBuffer = new BufferedReader(readFile);
 System.out.println("ID "+"\t"+ " Name "+"\t"+ " Score "+"\t"+ " Credit");

 while((studentID = dataBuffer.readLine()) != null)
{
 studentName = dataBuffer.readLine();
scoresStr = dataBuffer.readLine();
 scores = Double.parseDouble(scoresStr);
 creditsStr = dataBuffer.readLine();
 credits = Integer.parseInt(creditsStr);
 if(credits >= 80)
 creditsTotal++;
 System.out.println(studentID+"\t"+studentName+"\t"+scores+"\t"+credits);
 }
 System.out.println("Students who have credits more than 80 are: "+creditsTotal+ " persons");
 System.out.println();
 dataBuffer.close();
 System.exit(0);
 }
}