def solution(array):
    count_array = [0] * (max(array) + 1)

    for num in array:
        count_array[num] += 1

    mode_num = 0

    for num in count_array:
        if num == max(count_array):
            mode_num += 1

    if mode_num > 1:
        return -1
    else:
        return count_array.index(max(count_array))