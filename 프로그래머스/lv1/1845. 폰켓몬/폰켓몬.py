def solution(nums):
    # answer = 0
    dic = {}
    for i in nums:
        if not i in dic:
            dic[i] = 1
        else:
            dic[i] += 1
    # print(dic)
    if len(nums)//2 <= len(dic.keys()):
        return len(nums)//2
    else:
        return len(dic.keys())
    # return answer