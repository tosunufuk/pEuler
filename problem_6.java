public class problem_6 {
    
    public static void main(String args[]) {
        
        int max = 100;
        
        int tmpSquareSum = 0;
        
        int squareSum = 0;
        
        int total = 0;
        
        int totalSquare = 0;
        
        int diff = 0;
        
        for (int i = 1; i <= max ; i++){
            
            tmpSquareSum = (int) Math.pow(i, 2);
            
            squareSum += tmpSquareSum;
            
            total += i;
            
        }
        
        totalSquare = (int) Math.pow(total, 2);
        
        diff= totalSquare - squareSum;
        
        System.out.println("squareSum " + squareSum);
        
        System.out.println("totalSquare " + totalSquare);
        
        System.out.println("diff " + diff);
        
    }
    
}
