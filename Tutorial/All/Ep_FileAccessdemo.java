
import java.io.File;
import java.io.IOException;

public class Ep_FileAccessdemo 
{

    public static void main(String[] args) throws IOException 
    {

        String formatStr = "%s exists in %s? %b\n\n";

        File file1 = new File("studentScores.txt"); // create a File object
        System.out.printf(formatStr, file1.getName(), file1.getAbsolutePath(), file1.exists());
        File folder1 = new File("c:/personnel/"); // create a File object
        folder1.mkdir(); // make a directory
        File file2 = new File("/personnel/faculty.txt");
        file2.createNewFile(); // create a new file
        System.out.printf(formatStr, file2.getName(), file2.getAbsolutePath(), file2.exists());
        file2.delete(); // delete a file, but not the directory
        System.out.printf(formatStr, file2.getName(), file2.getAbsolutePath(), file2.exists());
    }

} 
  
