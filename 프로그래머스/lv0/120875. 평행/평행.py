def get_m(l1, l2):
    if l1[0] > l2[0]:
        return (l1[1]-l2[1])/(l1[0]-l2[0])
    else:
        return (l2[1]-l1[1])/(l2[0]-l1[0])
                                  
def solution(dots):
    if get_m(dots[0], dots[1]) == get_m(dots[2], dots[3]):
        return 1
    if get_m(dots[0], dots[2]) == get_m(dots[1], dots[3]):
        return 1
    if get_m(dots[0], dots[3]) == get_m(dots[1], dots[2]):
        return 1
    return 0