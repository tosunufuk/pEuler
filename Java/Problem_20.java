import java.math.BigInteger;

public class Problem_20{

     public static void main(String []args){
        
        BigInteger bigInteger = BigInteger.valueOf(1);
        
        int factorialN = 100;
        
        int factorialSum = 0;
        
        int holder = 0;
        
        for (int i = factorialN; i > 0; i--)
        {
            
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
            
        }
        
        while (bigInteger.compareTo(BigInteger.valueOf(0)) > 0)
        {
            
            holder = bigInteger.mod(BigInteger.valueOf(10)).intValue();
            
            factorialSum += holder;
            
            bigInteger = bigInteger.divide(BigInteger.valueOf(10));
            
        }
        
        System.out.println("Factorial Sum " + factorialSum);
        
     }
}
