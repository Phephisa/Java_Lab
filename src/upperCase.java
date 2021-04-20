import java.util.Scanner;
/*Phephisa Methula 18000797
* method to count uppercase characters*/
public class upperCase {
    public static void main(String[] args)
    {
      UpperCase(); //calling the method
    }
    public static void UpperCase()
    {   String a;
        System.out.println("Enter the word: ");
        int upper = 0;
        Scanner input = new Scanner(System.in);
        a = input.nextLine();    //input of string
        int n = a.length(); //check for lenth of string and assigns it to n
        for( int i=0; i<n;i++)
        {
            if (Character.isUpperCase(a.charAt(i))) //check for upper case values
                upper++; //increase of number of uppercase value
        }
        System.out.println(upper);  //print the number of uppercase letters
    }
}
