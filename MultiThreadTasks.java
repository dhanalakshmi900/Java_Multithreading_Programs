import java.util.Scanner;
class SingleRun implements Runnable
{
    public void run()
    {
        Thread t=Thread.currentThread();
        String name=t.getName();
        //System.out.println(name);
        if(name.equals("Task1"))
        {
            add();
        }
        else if(name.equals("Task2"))
        {
            printChar();
        }
        else if(name.equals("Task3"))
        {
            printNum();
        }
        //System.out.println("Not Working");
    }
    void add()
    {
        System.out.println("task1 Started");
        System.out.println("task1 Completed");
    }
    void printChar()
    {
        System.out.println("task2 Started");
        System.out.println("Printing characters");
        for(int i=65;i<=70;i++)
        {
            System.out.println((char)i);
        } 
        System.out.println("task2 completed");
    }
    void printNum()
    {
        System.out.println("task3 Started");
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }
        System.out.println("task3 Completed");
    }
}
class Main
{
    public static void main(String args[])
    {
        SingleRun sr=new SingleRun();
        
        Thread t1=new Thread(sr);
        Thread t2=new Thread(sr);
        Thread t3=new Thread(sr);

        t1.setName("Task1");
        t2.setName("Task2");
        t3.setName("Task3");
        //System.out.println(t2.getName());

        t1.start();
        t2.start();
        t3.start();
    }
}
