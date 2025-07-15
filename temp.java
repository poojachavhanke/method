package abc;
   class Temperature{
	   static void cel(int celsius) 
	   {
		   int Fahrenheit;
		   Fahrenheit=(celsius * 9/5) + 32;
		   System.out.println(" the temp in fahrenheits is :" + Fahrenheit);
	   }
   }
public class temp {
      public static void main(String[]args)
      {
    	 Temperature.cel(18);  
      }
 
      }
