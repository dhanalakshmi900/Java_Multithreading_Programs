class Demo
{
    public static void main(String args[])
    {
        Thread t=Thread.currentThread();
        System.out.println(t);
        //To Display only Name of the thread
        //By default the name of the thread is main
        System.out.println("Default thread name:"+t.getName());
        //To change the name of the Thread
        t.setName("Dhana");
        System.out.println("Changed Thread name to:"+t.getName());
        //to get the priority of the thread 
        System.out.println("Default priority of main thread is:"+t.getPriority());
        //To change the priority of the thread
        t.setPriority(10);
        System.out.println("Changed thread priority:"+t.getPriority());
    }
}