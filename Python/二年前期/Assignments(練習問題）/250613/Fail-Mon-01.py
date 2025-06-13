try:
    f= open('students.txt', encoding='utf-8')
    line = f.readline()
    while line !='':
        print(line)
        line = f.readline()
    f.close()
except:
    print('ファイル読み込みエラー')