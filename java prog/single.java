  class A extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            if(i==1) 
            yield();
            System.out.println("Therad"+i);

        }
        System.out.println("exit from A");
    }
}
class B extends Thread
{
    public void run()
    {
        for(int j=0;j<5;j++);
        {
            System.out.println("Thread B"+j);
            if(j==3)
            stop();
        }
        System.out.println("exit from B");
    }
}
class C extends Thread
{
    public void run()
    {
        for(int k=0;k<5;k++);
        {
            System.out.println("Thread C"+k); 
            if(k==j) 
            Sleep();
        } 
        System.out.println("exit from C");  
    }
}