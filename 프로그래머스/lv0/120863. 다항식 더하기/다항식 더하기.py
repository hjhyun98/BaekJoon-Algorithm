def solution(polynomial):
    l = polynomial.split(" + ")
    k = sum([int(j) if j != '' else 1 for j in [i[:-1] for i in l if i[-1] == "x"] ])
    if k == 1:
        answer = "x"
    else:
        answer = str(k)+"x"
    c = [i for i in l if i[-1] != "x"]
    if c and k != 0:
        return answer + " + "+str(sum(list(map(int, c))))
    elif c and k == 0:
        return str(sum(list(map(int, c))))
    else:
        return answer
    

    