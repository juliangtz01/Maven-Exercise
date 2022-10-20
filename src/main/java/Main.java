import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter something: ");
        String input = scanner.nextLine();
        System.out.printf("You Entered: \"%s\"%n", input);
        if(!StringUtils.isNumeric(input))
        {
            System.out.printf("\"%s\" is not a number%n", input);
        }
        else
        {
            System.out.printf("\"%s\" is a number%n", input);
        }

        //without using the dependency

//        String[] arr = input.split(" ");
//
//        StringBuilder newSentence = new StringBuilder("");
//
//        for(String word : arr)
//        {
//            if(Character.isUpperCase(word.charAt(0)))
//            {
//                word = StringUtils.upperCase(word);
//                word = word.substring(0,1).toLowerCase() + word.substring(1);
//                newSentence.append(word).append(" ");
//
//            }
//            else
//            {
//                newSentence.append(word).append(" ");
//            }
//        }
//        System.out.println(newSentence);
        //using the dependency
        System.out.println(StringUtils.swapCase(input));
        System.out.println(StringUtils.reverse(input));
    }
}
