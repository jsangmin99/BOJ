N = int(input())

ans = 1
for _ in range(N):
    A, B = map(int, input().split())
    if A > 0:
        A -= 1
    if B > 0:
        B -= 1
    ans += B - A
if ans <= 0:
    ans -= 1
print(ans)