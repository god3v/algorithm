import sys
input = sys.stdin.readline

# N: 2차원 배열 크기, M: 질의 수
N, M = map(int, input().split())

A = []

# 2차원 배열 초기화
for i in range(N):
    tmp = list(map(int, input().split()))
    A.append(tmp)

D = [[0] * (N + 1) for _ in range(N + 1)]

# 합 배열 초기화
for i in range(1, N + 1):
    for j in range(1, N + 1):
        D[i][j] = D[i][j - 1] + D[i - 1][j] - D[i - 1][j - 1] + A[i - 1][j - 1]

# 질의 도출
for _ in range(M):
    x1, y1, x2, y2 = map(int, input().split())
    result = D[x2][y2] - D[x1 - 1][y2] - D[x2][y1 -1] + D[x1 - 1][y1 - 1]
    print(result)