import java.util.*;

public class array 
{   
    int i;
    int a[]=new int[5];   //Declaration of an integer array named 'a' with 5 elements
    public void input()                      //Method to take the inputs from user
    {    
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the values for the array : ");
         
         for (i=0 ; i<5 ; i++)               //Loop to get the values from user and store them in the array
         {
             System.out.print((i+1) + " element: ");               
             a[i] = sc.nextInt();                      
         }
    }

    public void display()                           //Method to display the contents of the array
    {
        System.out.println("\nThe entered values are :");
        for (i=0 ; i<5 ; i++)                       //Print each element of the array
            System.out.println(a[i]);
    }

   
    public static  void main(String args[])
    {
        array obj = new array();              //Object of the class 'array' is created
        obj.input();                          //Calling the method 'input'
        obj.display();                        //Calling the method 'display'
    }
}
    

