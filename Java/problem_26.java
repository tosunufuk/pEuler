import java.util.concurrent.TimeUnit;
import java.util.ArrayList;

public class Problem_26 {
    
    public static void main(String args[]) {
        
        long startTime = System.nanoTime();
        
        int dividend = 1;
        
        int index = 0;
        
        int maxDivisor = 1000;
        
        int theDivisor = 0;
        
        int theLength = 0;
        
        for(int divisor = 1; divisor < maxDivisor; divisor++)
        {
            
            ArrayList<Integer> list = new ArrayList<Integer>();
            
            dividend = 1;
            
            index = 0;
            
            while(!list.contains(dividend))
            {
                
                list.add(dividend);
                
                dividend = dividend * 10 % divisor;
                
                index++;
                
            }
            
            if (index  > theLength)
            {
                
                theDivisor = divisor;
                
                theLength = index;
                
            }
            
        }
        
        System.out.println("Divisor is " + theDivisor + " and length is " + theLength);
        
        System.out.println("Total time " + TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTime));
        
    }

}
