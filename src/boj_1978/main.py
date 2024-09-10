n = int(input)
arr = list(map(int, input().split()))

for a in arr:
   if a == 1:
      n -= 1
   else:
      for i in range(2, a):
         if a%i == 0:
            n -= 1
            break
print(n)