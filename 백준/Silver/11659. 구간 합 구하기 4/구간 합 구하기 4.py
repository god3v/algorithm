import sys
input = sys.stdin.readline

N, M = map(int, input().split())

A = list(map(int, input().split()))

S = [0]
tmp = 0

# 누적 합 구하기
for i in A:
    tmp += i
    S.append(tmp)

# 구간 합 구하기
for _ in range(M):
    i, j = map(int, input().split())
    print(S[j] - S[i - 1])