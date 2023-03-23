def solution(cacheSize, cities):
    if cacheSize == 0:
        return len(cities)*5
    else:
        cache = [0 for i in range(cacheSize)]
        answer = 0
        for i in cities:
            city = i.lower()
            if city in cache:
                cache.pop(cache.index(city))
                answer += 1
            else:
                answer += 5
                cache.pop(0)
            # print(i, cache, answer)
            cache.append(city)
        return answer