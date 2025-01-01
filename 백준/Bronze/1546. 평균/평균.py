# 1. 과목의 개수 N 을 입력받는다.
N = int(input())

# 2. 각 과목의 성적을 N 크기의 1차원 배열에 입력받는다.
arr = list(map(int, input().split()))

# 3. 배열을 탐색하여 최고 점수와 점수의 총합을 구한다.
sum = sum(arr)
max = max(arr)

# 4. 총합 * 100 / 최고 점수 / 과목의 수를 계산해 다시 계산한 점수의 평균 값을 출력한다.
print(sum * 100.0 / max / N)