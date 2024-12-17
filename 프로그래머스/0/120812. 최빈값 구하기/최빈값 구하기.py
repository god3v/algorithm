def solution(array):
    # 배열의 정수가 몇 번 등장했는지 세는 배열을 만든다.
    count_array = [0] * (max(array) + 1) # 인덱스는 0부터 시작하기 때문에 배열의 가장 큰 값까지 등장 횟수를 셀 수 있도록 (max(array) + 1)로 설정한다.

    # 주어진 배열을 순회하여 각 정수의 등장 횟수를 센다.
    for num in array:
        count_array[num] += 1

    # 최빈값 개수
    mode_num = 0

    # 최빈값의 개수를 세는 반복문
    for num in count_array:
        # 정수 개수만큼 순회하여 등장 횟수 배열의 최댓값과 같은 값이 몇 개인지 센다.
        if num == max(count_array):
            mode_num += 1

    # 최빈값이 2개 이상이라면 -1 반환
    if mode_num > 1:
        return -1
    # 최빈값이 하나라면 해당 정수를 반환한다. (count_array의 인덱스 번호와 같다.)
    else:
        return count_array.index(max(count_array))
