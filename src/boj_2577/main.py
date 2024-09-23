a = int(input())
b = int(input())
c = int(input())

mul = str(a * b * c)
mul = list(map(int, mul))

for i in range(0, 10):
   print(mul.count(i))