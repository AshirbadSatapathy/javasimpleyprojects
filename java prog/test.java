public class test 
{
    int a,b,c;
    void input()
    {
        a=10;
        b=20;
    }
    void add()
    {
        c=a+b;
        System.out.println(c);
    }
 public static void main(String[] args) 
 {
    test obj=new test();        //declare a mew object for the acceble of the member function 
    obj.input();                //this is a calling part if the objecttive function
    obj.add();

 }
    
}
