class InfiniteUserThread implements Runnable
{
    public void run()
    {
        System.out.println("User Thread start Executing....");
        while(true)
        {
            System.out.println("Thread Executing...");
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        //This below statement will never execute due to the infinite loop occurs in above..
        //System.out.println("User Thread Completed its execution...");
    }
}
class Main
{
    public static void main(String args[])
    {
        InfiniteUserThread ut=new InfiniteUserThread();
        
        Thread t=new Thread(ut);
        
        t.start();
    }
}