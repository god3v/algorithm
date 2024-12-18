string = list(input())
alphabet_array = 'abcdefghijklmnopqrstuvwxyz'

for i in alphabet_array:
    if i in string:
        print(string.index(i), end = ' ')
    else:
        print(-1, end = ' ')
