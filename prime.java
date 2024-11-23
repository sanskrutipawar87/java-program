public class prime {
    public static void main(String arg[])
    {
boolean isprime=true;
int num=2;
if (num<=1) {
    isprime=false;   
}

    for(int i=2;i<=num;i++)
    {

        if(num%i==0)
        {
            isprime=false;
        }

        if(isprime==false)
        {
            System.out.println(num+" is prime number");
        }
        else{
            System.out.println(num+" is not prime number");
    }

}
    }
    
    
}
