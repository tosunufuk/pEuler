import java.util.concurrent.TimeUnit;

public class problem_21
{

     public static void main(String []args)
     {
         
        long startTime = System.nanoTime();
        
        int sum = 0;
        
        int tmpSum = 0;
        
        for (int i = 1; i <= 10000; i++)
        {
            
            tmpSum = amicableNumber(i);
            
            if ((tmpSum != 0) && (tmpSum != i) && (amicableNumber(tmpSum) == i))
            {
                
                sum = sum + i;
                
            }
            
        }
        
        System.out.println("Sum is " + sum);
        
        long totalTime = TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTime);
		
		System.out.println(totalTime/1000);
        
     }
     
     private static int amicableNumber(int val)
     {
         
         int sumLocal = 0;
         
         for (int j = 1; j < val; j++)
         {
             
             if (val % j == 0)
             {
                 
                 sumLocal += j;
                 
             }
             
         }
         
         return sumLocal;
         
     }
}
