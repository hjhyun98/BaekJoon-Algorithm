def solution(chicken):
    coupon = 0
    cnt = 0
    for i in range(1,chicken+1):
        coupon += 1
        if coupon == 10:
            coupon = 1
            cnt +=1
    return cnt