class student
{
   
    String name;
    int roll;
    int mark;
    student(String n,int x,int y)
{
name=n;
roll=x;
mark=y;
}
void show1()
{
    System.out.println("Name:"+name);
}
    void show2()
    {
    System.out.println("Roll:"+roll);
}
    void show3()
    {
    System.out.println("mark:"+mark);
    }


public static void main (String[] args)
{
    student s=new student("Ashirbad",25,50);
s.show1();
s.show2();
s.show3();
}
}