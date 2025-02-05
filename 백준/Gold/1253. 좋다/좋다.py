import sys
input = sys.stdin.readline

N = int(input())
A = list(map(int, input().split()))

A.sort()

result = 0

for idx in range(len(A)):
    find = A[idx]
    i = 0
    j = N - 1

    while i < j:
        if A[i] + A[j] == find:
            if i != idx and j != idx:
                result += 1
                break
            elif i == idx:
                i += 1
            else:
                j -= 1
        elif A[i] + A[j] < find:
            i += 1
        else:
            j -= 1

print(result)