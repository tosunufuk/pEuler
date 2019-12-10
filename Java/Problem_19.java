public class Problem_19 {

     public static void main(String []args){
     
        int monthsDay = 1;
        
        int day = 1;
        
        int month = 1;
        
        int year = 1900;
        
        int sunday = 0;
        
        boolean isLeap = false;
        
        while (year < 2001) 
        {
            
            if (year >= 1901 && day % 7 == 0 && monthsDay == 1) 
            {
                
                sunday++;
                
            }
                
            if ((year % 100 == 0 && year % 400 == 0) || year % 4 == 0)
            {
                
                isLeap = true;
                
            } else
            {
                
                isLeap = false;
                
            }
            
            if (monthsDay == 28 && month == 2 && !isLeap)
            {
                
                month++;
                
                monthsDay = 1;
                
            } else if (monthsDay == 29 && month == 2 && isLeap)
            {
                
                month++;
                
                monthsDay = 1;
                
            } else if (monthsDay ==30 && (month == 4 || month == 6 || month == 9 || month == 11))
            {
                
                month++;
                
                monthsDay = 1;
                
            } else if (monthsDay ==31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12))
            {
                
                month++;
                
                monthsDay = 1;
                
            } else 
            {
                
                monthsDay++;
                
            }
            
            if (month == 13)
            {
                
                month = 1;
                
                year++;
                
            }
            
            day++;
                
        }
        
        System.out.println(sunday + " Sundays");
        
     }
}
