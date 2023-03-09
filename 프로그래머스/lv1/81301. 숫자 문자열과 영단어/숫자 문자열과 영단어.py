def solution(s):
    dic = {"zero" : 0, "one" : 1, "two" : 2, "three" : 3, "four" : 4, "five": 5, "six" : 6, "seven" : 7, "eight" : 8, "nine" : 9}
    word = ''
    answer = 0
    for i in s:
        if not i.isdigit():
            if word in dic:
                answer = answer * 10 + dic[word]
                word = ''
            word += i
        else:
            if word != '':
                answer = answer*10 + dic[word]
                word = ''
            answer = answer * 10 + int(i)
    if word != '':
        answer = answer * 10 + dic[word]
    return answer