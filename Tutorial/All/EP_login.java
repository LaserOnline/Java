

import java.util.Scanner;

public class EP_login 
{
    public static void main(String args[]) 
    {
        // ! declare variables
        String userPassword, acceptableMessage, errorMessage;
        char aCharacter;
        int numOfChars;
        String openingMessage = " Enter a Password that meets all all the following conditions:\n\n "
                + "1 It contains a total of 8 to 15 characters, no spaces\n"
                + "2 It contains at least one uppercase non-numeric character\n"
                + "   and one lowercase non-numeric character\n" + "3 It contains at least one numeric digit\n\n";
        boolean hasCorrectNumOfChars = true;
        boolean haswhitespace = false;
        boolean hasADigit = false;
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;

        Scanner input = new Scanner(System.in);

        // ! get input
        System.out.println(openingMessage);
        userPassword = input.nextLine();
        System.out.println();

        // ! declare output variables
        acceptableMessage = " Your Password '" + userPassword + "is acceptable. Thank you. \n\n";
        errorMessage = "Your Password" + userPassword + "' is not valib for the following reason(s):\n\n";

        numOfChars = userPassword.length(); // ! get length of password

        // ! processing -- check for correct number of characters
        if (numOfChars < 8 || numOfChars > 15) {
            hasCorrectNumOfChars = false;
            errorMessage += "It does not have the correct number of characters (8-15).\n";
        }

        // ! processing -- check for specific kinds of characters
        for (int i = 0; i < numOfChars; i++) 
        {
            aCharacter = userPassword.charAt(i);

            // ! test for whitespace
            if (Character.isWhitespace(aCharacter) && !haswhitespace) 
            {
                haswhitespace = true;
                errorMessage += "It contains a space.\n";
            }

            // ! test for a digit
            if (Character.isDigit(aCharacter) && !hasADigit)
                hasADigit = true;

            // ! test for lower case letter
            aCharacter = userPassword.charAt(i);
            if (Character.isLowerCase(aCharacter) && !hasLowerCase)
                hasLowerCase = true;

            // ! test for upper case letter
            aCharacter = userPassword.charAt(i);
            if (Character.isUpperCase(aCharacter) && !hasUpperCase)
                hasUpperCase = true;

            // ! end loop
        }

        if (!hasADigit)
            errorMessage += "It does not contain a digit .\n";
        if (!hasLowerCase)
            errorMessage += "It does not contain a lower case character.\n";
        if (!hasUpperCase)
            errorMessage += "It does not contain an upper case character.\n";

        // ! output
        if (hasCorrectNumOfChars && !haswhitespace && hasADigit && hasLowerCase && hasUpperCase)
            System.out.println(acceptableMessage);
        else
            System.out.println(errorMessage);
        System.exit(0); // ! terminate GUI thread

    } // ! end main method
} // ! end class
