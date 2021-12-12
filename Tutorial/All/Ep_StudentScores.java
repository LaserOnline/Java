import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class Ep_StudentScores {
    public static void main(String[] args) {
        int totalScore, scoreCount;
        int studentId1, studentId2;
        double score, avgScore;
        String studentLastName, studentFirstName;
        String outputStr = "Average scores for students:\n\n";
        String formatStr = "%-8s%-15s%-15s%6.2f\n";
        Scanner namesInput = null, scoresInput = null;
        File inStudentsFile = new File("Name.txt"); // File objects
        File inScoresFile = new File("Scores.txt");
        try {
            namesInput = new Scanner(inStudentsFile); // Scanner objects
            scoresInput = new Scanner(inScoresFile);
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
                // add data to output string
                outputStr += String.format(formatStr, studentId1, studentLastName, studentFirstName, avgScore);

                // reset scores scanner for new student
                scoresInput = new Scanner(inScoresFile);
            } // end outer loop
            System.out.println(outputStr); // print data
        } // end try
        catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        } finally {
            namesInput.close();
            scoresInput.close();
        }
    }
}