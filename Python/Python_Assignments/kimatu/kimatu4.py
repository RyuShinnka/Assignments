
#関数の処理
def inputfun():#入力処理
    listin =[]
    kazu = int(input("人数=>"))
    for i in range(kazu):
        print((i+1),"人目")
        ten = int(input("ゲームの点数=>"))
        listin+=[ten]
    return listin

def sumavrfun(listin):
    go = 0
    for val in listin:
        go += val
    avg = go/len(listin)
    return go,avg

def countfun(listin,in_avg):
    count = 0
    for val in listin:
        if in_avg < val:
            count += 1
    return count

#メインの処理
listin = []
listin = inputfun()
print(listin)
m_go, m_avr = sumavrfun(listin)
print("合計値:",m_go,"平均値：",m_avr)
m_cont = countfun(listin,m_avr)
print("平均値より大きい数:",m_cont)
