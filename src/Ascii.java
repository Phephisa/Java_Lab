import java.util.Scanner;
/*Phephisa Methula 18000797
* A program to change text to ASCII then encrypt it*/
public class Ascii {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Press 1 for decryption ");
        System.out.println(" Press 2 for encryption");
        int x = input.nextInt();

        if(x==1){
        backToString(82);  //calling method to decrpt ASCC code
        backToString(106);
        backToString(103);
        backToString(114);
        backToString(106);
        backToString(107);
        backToString(117);
        backToString(99);
        System.out.println();}

        else if(x==2){
            Scanner inpu = new Scanner(System.in);
                System.out.println("Enter the message: ");
                String a = inpu.nextLine();   //the string to be converted
                System.out.println("Enter encryption key: ");
                int key = inpu.nextInt();  //encryption key tha is goign to be used
                int len = a.length();       //get leenght of encrypted string
                System.out.println("message is ");
                for (int i = 0; i <= len; i++)   //condition to navigate through each charracter of string
                {
                    char ch = a.charAt(i);    //gets the character at string index i
                    int asc = (int) ch;  //typecasting character into an ASCII integer value
                    int encr = asc + key; //ASCII value plus the encryption key
                    System.out.println(encr);    //printing out of encrypted value
                }
            }
        else
            {System.out.println("Invalid");}

    }
    public static void backToString(int value) //decrption method
    {
        int fin = value-2;  //subtract decrpyt key
        char str = (char)fin; //type cast back to string
        System.out.print(str);

    }
}