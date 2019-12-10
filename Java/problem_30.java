import java.util.concurrent.TimeUnit;

public class Problem_30
{
	public static void main(String[] args) {
	    
	    long startTime = System.nanoTime();
	
	    int totalSum = 0;
	    
	    int upperLimit = 200000;
	    
	    for (int i = 2; i < upperLimit ; i++)
	    {
	        
	        int index = i;
	        
	        int number = 0;
	        
	        int sum = 0;
	        
	        while(index > 0)
	        {
	            
	            number = index % 10;
	            
	            index = index / 10;
	            
	            sum += power(number, 5);
	            
	        }
	        
	        if (i == sum)
	        {
	            
	            totalSum += sum;
	            
	        }
	        
	    }
	    
        System.out.println(totalSum);
        
        System.out.println("Total time " + TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTime));
    	
	}
	
	private static int power(int value, int powerOf)
	{
	    
	    int powered = 1;
	    
	    if (value == 0)
	    {
	        
	        return 0;
	        
	    }
	    
	    while (powerOf > 0)
	    {
	        
	        powered *= value;
	        
	        powerOf--;
	        
	    }
	    
	    return powered;
	    
	}
	
}
