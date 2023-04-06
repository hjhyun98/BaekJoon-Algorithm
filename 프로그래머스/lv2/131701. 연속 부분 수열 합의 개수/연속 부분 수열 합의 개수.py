def solution(elements):
    answer = set([i for i in elements])
    answer.add(sum(elements))
    for i in range(2, len(elements)):
        temp = elements + elements[:(i-1)]
        k = []  
        for j in range(len(temp)-i+1):
            s = sum(temp[j:j+i])
            k.append(s)
        answer.update(k)
    return (len(answer))