def solution(babbling):
    answer = 0
    word = ["aya","ye","woo","ma"]
    for i in word:
        for idx,b in enumerate(babbling):
            if i in b:
                # print(i, b.index(i), len(i))
                # print("add ",b[:b.index(i)],", and ",b[b.index(i)+len(i):])
                front = b[:b.index(i)] 
                back = b[b.index(i)+len(i):]
                babbling[idx] =  front if len(front) > 1 else front.upper()
                babbling[idx] += back if len(back) > 1 else back.upper()
        print(babbling)
                
        
    return sum([1 for i in babbling if i == ""])