# 1. N값 입력 받기
N = int(input())

# 2. 길이 N의 숫자를  sNum에 저장하기
sNum = input()

# 3. int형 변수 sum 선언하기
result = 0

# 4. sNum 의 길이만큼 반복문을 돌아 각 자릿값을 숫자로 변환하여 sum에 누적하기
for i in sNum:
    result += int(i)

# 5. sum 출력하기
print(result)

#==========
# N = int(input())

# sNum = list(map(int, input()))
# print(sum(sNum))
