//Creating a thread By extending Thread class
class MyThread extends Thread{
    public void run()
    {
        System.out.println("Thread is Running.....");
    }
}
class Main{
    public static void main(String args[])
    {
        MyThread t=new MyThread();
        t.start();
    }
}