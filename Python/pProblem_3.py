from datetime import datetime

startTime = datetime.now()

num = 600851475143;

div = 2;

primes = 0;

while num >= div : 
    
    if num % div == 0 :
        
        primes = div
        
        num /= div
        
    else :
        
        div = div + 1

print(primes)

print("Runtime is ", datetime.now() - startTime)