def solution(id_pw, db):
    ids = [i[0] for i in db]
    print(ids)
    if id_pw[0] in ids:
        idx = ids.index(id_pw[0])
        if db[idx][1] == id_pw[1]:
            return "login"
        else:
            return "wrong pw"
    else:
        return "fail"
