TBL = [20, 60, 50, 10, 70, 30, 90, 100, 85, 65]
def find_max_min(TBL):
    max = TBL[0]
    min = TBL[0]
    for i in range(len(TBL)):
        if TBL[i] > max:
            max = TBL[i]
        elif TBL[i] < min:
            min = TBL[i]
    return max, min

print("TBL[]の最大値と最小値は", find_max_min(TBL))