import sys
input = sys.stdin.readline

N = int(input())
M = int(input())
A = list(map(int, input().split()))

A.sort()

left, right = 0, N - 1
count = 0

while left < right:
    if A[left] + A[right] < M:
        left += 1
    elif A[left] + A[right] > M:
        right -= 1
    else:
        count += 1
        left += 1
        right -= 1

print(count)