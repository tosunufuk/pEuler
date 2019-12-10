import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Problem_5 {
    public static void main(String args[]) {
       int toNumber = 20;
        
        int divider = 2;
        
        Set<List<Integer>> set = new HashSet<List<Integer>>();
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        int value = 0;
        
        for (int i = toNumber; i > 1; i--) {
            
            List<Integer> list = new ArrayList<Integer>();
            
            value = i;
            
            divider = 2;
            
            while (value >= divider){
                
                if (value % divider == 0) {
                    
                    list.add(divider);
                    
                    value /= divider;
                    
                } else {
                    
                    divider++;
                    
                }
                
            }
            
            set.add(list);
            
        }
        
        for (List<Integer> list : set) {
            
            if(map.containsKey(list.get(0))) {
                
                if (map.get(list.get(0)) < list.size()) {
                    
                    map.put(list.get(0), list.size());
                    
                }
                
            } else {
                
                map.put(list.get(0), list.size());
                
            }
            
        }
        
        Set<Integer> keySet = map.keySet();
        
        int tempSum = 0;
        
        int sum = 1;
        
        for (Integer integer : keySet) {
            
            tempSum = (int) Math.pow(integer, map.get(integer));
            
            sum *= tempSum;
            
        }
        
        System.out.println("Sum " + sum);
    }
}
