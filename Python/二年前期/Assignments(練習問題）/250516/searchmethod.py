from studentclass import Student

def search_student(name):
    students = [Student('佐藤', 100, 40, 65), Student('丸山', 64, 98, 79),
            Student('三村', 48, 87, 92), Student('古川', 83, 81, 74)]
    for x in students:
        if x.name == name:
            return x
        return None