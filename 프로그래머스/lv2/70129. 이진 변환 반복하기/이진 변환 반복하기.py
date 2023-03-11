def solution(s):
    cnt_round = 0
    cnt_zero = 0
    while s != "1":
        cnt_round += 1
        k = s.count("1")
        cnt_zero += len(s) - k
        s = format(k,'b')
    return [cnt_round, cnt_zero]