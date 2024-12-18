string = list(input())
char = 'abcdefghijklmnopqrstuvwxyz'

for i in char:
    if i in string:
        print(string.index(i), end = ' ')
    else:
        print(-1, end = ' ')