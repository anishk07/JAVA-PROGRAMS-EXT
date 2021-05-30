//JAVA Program To Create 4 Threads And Then Execute Fibonacci, Factorial, Prime Numbers And Reverse Of A Number
import java.io.*;
import java.util.Scanner;

class Fibonacci extends Thread
{
     public void run()
     {
          try
          {
               int a=0, b=1, c=0;
               BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

               System.out.print("Enter the Limit for fabonacci: ");

               int n = Integer.parseInt(br.readLine());
               System.out.println("Fibonacci series:");
               while (n>0)
               {
                    System.out.print(c+" ");
                    a=b;
                    b=c;
                    c=a+b;
                    n=n-1;
               }
               System.out.println("\n=================================");
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}

class Factorial extends Thread
{
    public void run()
    {
        try
        {
            int i,fact=1; 
            int number=5;    
            for(i=1;i<=number;i++){    
                fact=fact*i;    
                
            }    
            System.out.println("\nFactorial of "+number+" is: "+fact);
            System.out.println("\n=================================");
            
        }
        catch (Exception ex)
          {
               ex.printStackTrace();
          }
    }
}


class Prime extends Thread
{
    public void run()
    {
        try
        {
            int temp;
            boolean isPrime=true;
            Scanner scan= new Scanner(System.in);
            System.out.println("\nEnter any number:");
            int num=scan.nextInt();
            scan.close();
            for(int i=2;i<=num/2;i++)
            {
                temp=num%i;
                if(temp==0)
                {
                    isPrime=false;
                    break;
                    
                }
                
            }
            if(isPrime){
                System.out.println(num + " is a Prime Number");
                System.out.println("\n=================================");
            }
            else{
                System.out.println(num + " is not a Prime Number");
                System.out.println("\n=================================");
            }
            
            
        }
        catch (Exception ex)
          {
               ex.printStackTrace();
          }
        
    }
    
}

class Reverse extends Thread
{
     public void run()
     {
          try
          {
              int num = 1234, reversed = 0;
              System.out.println("\nThe Number Is: " + num);
              while(num != 0) {
                  int digit = num % 10;
                  reversed = reversed * 10 + digit;
                  num /= 10;
                  
              }
              
              System.out.println("\nReversed Number: " + reversed);
              System.out.println("\n=================================\n\n");
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}

public class ThreadCreation
{
     public static void main(String[] args)
     {
          try
          {
               Fibonacci fib = new Fibonacci();
               fib.start();
               fib.sleep(5000);
               Factorial fac = new Factorial();
               fac.start();
               fac.sleep(5000);
               Prime pr = new Prime();
               pr.start();
               pr.sleep(5000);
               Reverse rev = new Reverse();
               rev.start();
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}