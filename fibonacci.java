public class fibonacci
{
public static void main(String arg[])
{
int num1=0;
int num2=1;
int num3;

System.out.println( num1+ " " +num2);

for(int i=2;i<10;++i)
{

    num3=num1+num2;
    System.out.println(num3);
    num1=num2;
    num2=num3;

}

}


}