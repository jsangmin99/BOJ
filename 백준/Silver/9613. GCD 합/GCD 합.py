import sys
from math import gcd

input = sys.stdin.readline

t = int(input().strip())
for _ in range(t):
    data = list(map(int, input().split()))
    n, arr = data[0], data[1:]
    total = 0
    for i in range(n):
        for j in range(i + 1, n):
            total += gcd(arr[i], arr[j])
    print(total)
