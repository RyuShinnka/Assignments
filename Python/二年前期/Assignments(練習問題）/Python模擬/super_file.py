class Student:
    def __init__ (self, department, enrollment ): 
        self.year = 2025
        self.department = department
        self.enrollment = enrollment
    
    def print_method(self):
        print("年度：", self.year)
        print("学科名：", self.department)
        print("入学者数：", self.enrollment)