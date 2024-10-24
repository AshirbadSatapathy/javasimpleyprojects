

public class college
{
 String cname;
 int ccode;
 college(String p,int q)
 {
    cname=p;
    ccode=q;
 }    
}
class dept extends college
{
 String dname;
 int dcode;
 dept(String p,int q,String r,int s)
 {
   super(p,q);
   dname=r;
   dcode=s;

 } 
 void show1()
 {
    System.out.println("the information are" +cname  +ccode +dname +dcode);

 }   
}
class faculty extends college
{
    String fname;
    int fid;
    faculty(String p,int q,String x,int y)
    {
        super(p,q);
        fname=x;
        fid=y;
    }
    void show2()
    {
        System.out.println("the information are"+cname +ccode +fname +fid);
    }
}
class student extends college
{
    int sroll; 
    String sname;
    int smark;
    int sgrade;
    student(String p,int q,int a,String b,int c,int d)
    {
        super(p,q);
        sroll=a;
        sname=b;
        smark=c;
        sgrade=d;
    }
    void show3()
    {
        System.out.println("the information are" +cname  +ccode +sroll  +sname  +smark  +sgrade);
    }
    public static void main(String args[])
    {
        dept d=new dept("ABIT",101,"Ashirbad", 25);
        faculty f=new faculty("ABIT",101,"Ashirbad",13);
        student s=new student("ABIT",101,15,"Ashirbad",25,10);
        d.show1();
        f.show2();
        s.show3();
    }
}