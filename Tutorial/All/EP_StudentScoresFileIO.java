import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Formatter;

public class EP_StudentScoresFileIO {
    public static void main(String[] args) {
        int totalScore, scoreCount;
        int studentId1, studentId2;
        double score, avgScore;
        String studentLastName, studentFirstName;
        String outputStr = "";
        String formatStr = "%-8s%-15s%-15s%6.2f\r\n";
        Scanner namesInput = null, scoresInput = null;
        File inStudentsFile = new File("Name.txt"); // File objects
        File inScoresFile = new File("Scores.txt");
        File outFile = new File("averages.txt");

        FileWriter aFileWriter = null;
        PrintWriter aPrintWriter = null;
        try {
            namesInput = new Scanner(inStudentsFile); // Scanner objects
            scoresInput = new Scanner(inScoresFile);
            aFileWriter = new FileWriter(outFile); // create pipeline
            aPrintWriter = new PrintWriter(aFileWriter); // create valve
            while (namesInput.hasNext()) {
                totalScore = 0; // initialize for new student
                scoreCount = 0;
                avgScore = 0;
                studentId1 = namesInput.nextInt();
                studentLastName = namesInput.next();
                studentFirstName = namesInput.next();
                while (scoresInput.hasNext()) {
                    studentId2 = scoresInput.nextInt(); // get ID
                    score = scoresInput.nextDouble(); // get score
                    if (studentId2 == studentId1) // match student ID's

                    {
                        totalScore += score;
                        scoreCount++;
                    } // end if
                } // end inner loop
                avgScore = (double) totalScore / scoreCount;
                outputStr += String.format(formatStr, studentId1, studentLastName, studentFirstName, avgScore);
                scoresInput = new Scanner(inScoresFile);
            } // end outer loop
              // output
            System.out.println(outputStr); // print data to window
            aPrintWriter.print(outputStr); // print data to file
        } // end try
        catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        } catch (IOException e)

        {
            System.err.println(e.getMessage());
            System.exit(1);
        } finally {
            namesInput.close();
            scoresInput.close();
            aPrintWriter.close();
        }
    } // end main
} // end class