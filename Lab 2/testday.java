//Program to test the various operations of the day class
//Christian Seyoum
//10/3/2018
//problem 3

import java.util.*;

public class testday
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        Day myDay = new Day(1);          
        Day yourDay = new Day();                

        int day;

        System.out.print("myDay: ");        
        myDay.print();                          
        System.out.println();                         

        System.out.print("yourDay: ");      
        yourDay.print();                        
        System.out.println();                         

        yourDay.setday(5);                 

        System.out.print("After setting : ");    
        yourDay.print();                        
        System.out.println();                         

        
        System.out.print("Add day: ");   

        day = console.nextInt();                    

        System.out.println("After adding: "+yourDay.addDays(day));
        System.out.println("Next day from my day: "+myDay.getNextDay());  
        System.out.println("Previous day from yourDay: "+yourDay.getPreviousDay());                 
        System.out.println();  
    }//end main
}

