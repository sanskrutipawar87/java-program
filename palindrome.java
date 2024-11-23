import java.util.*;
public class palindrome
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int number = sc.nextInt();

int OriginalNumber=number;
int ReversedNumber=0;

while (number != 0) {
            int digit = number % 10; // Extract the last digit
            ReversedNumber = ReversedNumber * 10 + digit; // Append the digit
            number = number / 10; // Remove the last digit
        }

if(OriginalNumber==ReversedNumber)
{
System.out.println(OriginalNumber +" is palindrome number");
}
else
{
System.out.println(OriginalNumber  + " is not  palindrome number");
}


}



}