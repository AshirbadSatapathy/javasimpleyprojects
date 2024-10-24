public class cube 
{
 int a,b,c;
 cube(int x,int y,int z)
 {
    a=x;
    b=y;
    c=z;
 }    
 void get1()
    {
     int p;
     p=6*a*a;
     System.out.println("area of cube is "+p);
    
    }
 void get2()
   {
    int q;
    q=4*a*b*c;
    System.out.println("peremeter of cube is "+q);
   }
 void in()
   {
     int r;
     r=a*a*a;
     get1();
     get2();
     System.out.println("volume of cube is "+r);
   }
   public static void main(String args[])
   {
    cube c = new cube(4,5,6);
    c.in(); 
   }
}
