def check3(TBL):
    print('TBL中に３の倍数は：', end=" ")
    for i in range(len(TBL)):
        if TBL[i] % 3 == 0:
            print(TBL[i], end=" ")

TBL = [20, 60, 50, 10, 70, 30, 90, 100, 85, 65]
check3(TBL)