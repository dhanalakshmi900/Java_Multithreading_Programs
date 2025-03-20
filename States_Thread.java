class Demo implements Runnable
{
    public void run()//running state
    {
        System.out.println("User Thread is Executing...");
        try
        {
            System.out.println("User Thread is going sleep....");//before sleep
            Thread.sleep(2000);//Sleep state
            System.out.println("User Thread is Waking up....");//after sleep
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("User Thread Finishes Execution");//Dead state
    }
}
class Main
{
    public static void main(String args[])
    {
        Demo d=new Demo();
        Thread t=new Thread(d);//thread enters into new state
        t.start();//thread moves from new state to runnable state
    }
}