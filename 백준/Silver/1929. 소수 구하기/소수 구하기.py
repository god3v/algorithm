M, N = map(int, input().split())

for i in range(M, N + 1):
    if i == 1: # 1은 소수가 아니므로 제외
        continue
		
		# 특정 수의 제곱근을 구하여 그 제곱근까지의 약수를 구하면 해당 약수를 포함하는 수를 제거할 수 있음
    for j in range(2, int(i ** 0.5) + 1):
		    # 제곱근의 약수로 나누어 떨어진다면 종료
        if i % j == 0:
            break

    else:
        print(i)
