import java.util.Scanner;
class Demo extends Thread
{
    public void run()
    {
        System.out.println("Task1 started");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1:");
        int n=sc.nextInt();
        System.out.println("Enter num2:");
        int m=sc.nextInt();
        System.out.println("Addition:"+(n+m));
       
        System.out.println("Task1 completed");
    }
}
class Demo1 extends Thread{
   public void run()
    {
        System.out.println("Task2 started");
        for(char c='A';c<='E';c++)
        {
            System.out.println(c);
            try{
            Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("Task2 Completed");
    }
}
class Demo2 extends Thread{
    public void run()
    {
        System.out.println("Task3 started");
        for(int c=1;c<=5;c++)
        {
            System.out.println(c);
            try{
            Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("Task3 Completed");
    }
}
class Main{
    public static void main(String args[])
    {
        Demo d=new Demo();
        Demo1 d1=new Demo1();
        Demo2 d2=new Demo2();
        //d.run();
        //d1.run();
        //d2.run();
        d.start();
        d1.start();
        d2.start();
    }
}