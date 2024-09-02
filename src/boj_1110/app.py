a = int(input())
b = a
count = 0

while True:
   ten = b // 10
   units = b % 10

   b = (units * 10) + ((ten + units) % 10)
   count += 1

   if a == b:
      break

print(count)
