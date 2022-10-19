import org.apache.commons.lang3.StringUtils;

import java.util.Locale;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter something: ");
        String input = scanner.nextLine();
        System.out.printf("You Entered: %s", input);
        if(!StringUtils.isNumeric(input))
        {
            System.out.printf("%s is not a number%n", input);
        }
        else
        {
            System.out.printf("%s is a number%n", input);
        }
        int length = input.length();
        String[] arr = input.split(" ");

        for(String word : arr)
        {
            if(Character.isUpperCase(word.charAt(0)))
            {

            }
        }
    }
}
