//WAP to find out the largest between 3 number using java program;//
//import javax.lang.model.util.ElementScanner14;

public class large
{
    public static void main (String args[])
    {
      int a=1,b=2,c=3,large;
      if(a>b)
       {
        if(a>c)
         {
            large=a;
         }
        else
         {
            large=c;
         }
       }
      else if(b>c)
      {
        large=b;
      }
      else       
      {
        large=c;
      }
      System.out.println("largest number is "+large);
    }
    
}
