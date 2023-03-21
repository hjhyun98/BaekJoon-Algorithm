def solution(k, tangerine):
    dic = {}
    for i in tangerine:
        if not i in dic:
            dic[i] = 1
        else:
            dic[i] += 1
    s = 0
    # cnt = 0
    vals = sorted(dic.values(), reverse=True)
    for i, v in enumerate(vals):
        s += v
        if s >= k:
            return i+1
    # while s < k :
    #     max_key = max(dic, key=dic.get)
    #     print(max_key, dic[max_key])
    #     s += dic[max_key]
    #     dic[max_key] = 0
    #     cnt += 1
        
    # return cnt