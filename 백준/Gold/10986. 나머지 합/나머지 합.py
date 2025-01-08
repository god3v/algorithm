import sys
input = sys.stdin.readline

# N: 수열의 개수, M: 나눌 수
N, M = map(int, input().split())
A = list(map(int, input().split()))

C = [0] * M
prefixSum = 0

# M 으로 나눈 나머지 배열에 저장
for i in range(N):
    prefixSum += A[i]
    C[prefixSum % M] += 1

# 나머지가 0이 되는 수
answer = C[0]
for i in range(M):
    answer += C[i] * (C[i] - 1) // 2

print(answer)