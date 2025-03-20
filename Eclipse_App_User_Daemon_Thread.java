class Eclipse implements Runnable
{
    public void run()
    {
        Thread t=Thread.currentThread();
        String name=t.getName();
        if(name.equals("TYPE"))
        {
            codeType();
        }
        else if(name.equals("SAVE"))
        {
            autoSave();
        }
        else
        {
            autoCompile();
        }
    }
        void codeType()
        {
            System.out.println("Typing started");
            for(int i=0;i<10;i++)
            {
            System.out.println("Typing the code.....");
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            }
            System.out.println("Typing Finished");
        }
        void autoSave()
        {
            System.out.println("AutoSave Started");
            while(true)
            {
                System.out.println("AutoSaving....");
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            }
            //System.out.println("Autosave Finished");
            
        }
    
        void autoCompile()
        {
            System.out.println("AutoCompile Started");
            while(true)
            {
                System.out.println("AutoCompiling....");
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            
            }
            //System.out.println("AutoCompile Finished");
            
        }
    
}
class Main
{
    public static void main(String args[])
    {
        Eclipse e=new Eclipse();

        Thread t1=new Thread(e);
        Thread t2=new Thread(e);
        Thread t3=new Thread(e);

        t2.setDaemon(true);//auto-save
        t3.setDaemon(true);//auto-compile

        t1.setName("TYPE");//user Thread
        t2.setName("SAVE");//Daemon Thread
        t3.setName("COMPILE");//Daemon Thread

        t1.start();
        t2.start();
        t3.start();
    }
}