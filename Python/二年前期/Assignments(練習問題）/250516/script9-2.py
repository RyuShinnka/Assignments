from studentclass import Student
from searchmethod import search_student

# 検索する生徒名を入力
stu1 = input('生徒名を入力してください-> ')
result = search_student(stu1)

if result is not None:
    result.show_detail()
else:
    print('存在しません')