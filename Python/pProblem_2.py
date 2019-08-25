from datetime import datetime

startTime = datetime.now()

maxVal = 4000000;

val = 1;

pastVal1 = 0;

temp = 0;

total = 0;

while val < maxVal :
    
    temp = val;
            
    val += pastVal1;
            
    pastVal1 = temp;
    
    if ((val & 1) == 0) :
        
        total += val;
        
print(total)

print("Runtime is ", datetime.now() - startTime)