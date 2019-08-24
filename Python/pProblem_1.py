from datetime import datetime

startTime = datetime.now()

total = 0

for i in range(3, 1000) :
    if (i % 3 == 0) or (i % 5 == 0) :
        total = total + i

print(total)

print("Runtime is ", datetime.now() - startTime)
    