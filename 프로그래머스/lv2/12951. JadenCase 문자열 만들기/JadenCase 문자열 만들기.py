def solution(s):
    flag = False
    answer = ""
    for i,ch in enumerate(s):
        if ch == ' ':
            flag = True
            answer += ' '
        elif flag == True or i == 0:
            if not ch.isdigit():
                answer += ch.upper()
            else:
                answer += ch
            flag = False
        else:
            answer += s[i].lower()
    return answer