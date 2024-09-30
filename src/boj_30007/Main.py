import sys

count = int(input())

for i in range(count):
    A, B, X = map(int,sys.stdin.readline().split())
    print(A*X - A + B)