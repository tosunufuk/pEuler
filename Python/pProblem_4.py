from datetime import datetime

startTime = datetime.now()

largestPalindrome = 0

for i in range(100, 1000):
    
    for j in range(100, 1000):
        
        palindrome = i * j
        
        if str(palindrome) == str(palindrome)[::-1] :
            
            if palindrome > largestPalindrome :
                
                largestPalindrome = palindrome
            
print(largestPalindrome)
        
print("Runtime is ", datetime.now() - startTime)
