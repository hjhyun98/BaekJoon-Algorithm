def solution(s, n):
    answer = ''
    for i in s:
        asc = ord(i)
        if 65 <= asc <= 90:
            if asc + n > 90:
                asc -= 26
            answer += chr(asc+n)
        elif 97 <= ord(i) <= 122:
            if asc + n > 122:
                asc -= 26
            answer += chr(asc+n)
        else:
            answer += i
    return answer