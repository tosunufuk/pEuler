import java.util.concurrent.TimeUnit;

public class Problem_23{

     public static void main(String []args){
      
        long startTime = System.nanoTime();
        
        int limit = 28123;
        
        boolean[] numbers = new boolean[limit + 1];
        
        int total = 0;
        
        for (int i = 0; i <= limit; i++)
        {
            
            int sum = getSum(i);
            
            if (sum > i)
            {
                
                numbers[i] = false;
                
            } else
            {
                
                numbers[i] = true;
                
            }
            
        }
        
        for (int i = 0; i <= limit; i++)
        {
            total += i;
            
            for (int j = 1; j <= i; j++)
            {
                
                if (!numbers[j] && !numbers[i-j])
                {
                    
                    total -= i;
                    
                    break;
                    
                }
                
            }
            
        }
        
        System.out.println("Total " + total);
        
        System.out.println("Total time " + TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTime));
      
     }
     
     private static int getSum(int digit)
     {
         
         int sum = 0;
         
         for (int i = 1; i <= Math.sqrt(digit); i++)
         {
             
            if (digit % i == 0)    
             {
                 
                 if (digit / i == i)
                 {
                     
                     sum += i;
                     
                 } else
                 {
                     
                     sum += i;
                     
                     sum += (digit / i);
                     
                 }
                 
             }
             
         }
         
         sum -= digit;
         
         return sum;
         
     }
     
}
