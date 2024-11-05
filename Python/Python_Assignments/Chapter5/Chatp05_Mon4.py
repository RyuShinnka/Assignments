TBL2 =[2.5, 20, 50, 'XTZ', 'Python', 2.3, 'JAVA', 90]

if 'Python' in TBL2:
    TBL2.remove('Python') #'Python'を削除
if 'JAVA' in TBL2:
    TBL2.remove('JAVA') #'JAVA'を削除
TBL2.insert(1, 'XXX') #1番目に'XXX'を挿入
TBL2.insert(4, 'abc') #4番目に'abc'を挿入
print("TBL2", TBL2)