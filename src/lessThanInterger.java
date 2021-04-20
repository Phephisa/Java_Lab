import java.util.Scanner;
/*Phephisa Methula 18000797
Prog to print numbers lss than it
* */

public class lessThanInterger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //taking input
        System.out.println("Enter integer: ");
        int a = input.nextInt();                //input of integer
        Integer(a);           //calling the method
    }

    public static void Integer(int a)   //new method
    {
        for (int i = 0; i<a; i++)    //loop to decrease the integer
        {
            if (i % 2 ==1) {
                System.out.println(i);  //printing f new value of integer i
            }
        }

    }
}

