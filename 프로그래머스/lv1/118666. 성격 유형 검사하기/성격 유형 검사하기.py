def solution(survey, choices):
    answer = []
    dic = {'R':0, 'T':0, 'C':0, 'F':0, 'J':0, 'M':0, 'A':0, 'N':0}
    for i in range(len(survey)):
        if choices[i] == 4:
            continue
        elif choices[i] < 4:
            dic[survey[i][0]] += 4 - choices[i]
        else:
            dic[survey[i][1]] += (choices[i] % 4)
    answer.append('R') if dic['R'] >= dic['T'] else answer.append('T')
    answer.append('C') if dic['C'] >= dic['F'] else answer.append('F')
    answer.append('J') if dic['J'] >= dic['M'] else answer.append('M')
    answer.append('A') if dic['A'] >= dic['N'] else answer.append('N')
    return ''.join(answer)