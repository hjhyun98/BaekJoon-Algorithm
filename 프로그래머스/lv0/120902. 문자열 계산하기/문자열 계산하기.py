def solution(my_string):
    l = my_string.split()
    answer = int(l[0])
    i = 1
    while i < len(l):
        if l[i] == "+":
            answer += int(l[i+1])
            i += 2
        elif l[i] == "-":
            answer -= int(l[i+1])
            i += 2
    return answer