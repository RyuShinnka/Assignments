from func.super_file import Student

class Sub_student(Student):
    # クラス変数定義 本年度総入学者数
    total_enrollment = 0

    # クラスメソッド定義
    @classmethod
    def sum_ninzu(cls, lst):
        total = 0
        for student in lst:
            total += student.enrollment
        cls.total_enrollment = total

    # サブクラスの初期化			
    def __init__(self, department, enrollment, offer_count):
        super().__init__(department, enrollment)
        self.offer_count = offer_count
        self.offer_count_rate = 0
        self.subject_rate = 0 

    def print_method(self):
        super().print_method()
        print("内定者数：", self.offer_count)
        print("内定者数の割合：", round(self.offer_count_rate, 2), '%')
        print("学科人数の割合：", round(self.subject_rate, 2), '%')
    
    def naitwari_fun(self):
        # 各学科の内定者数の割合を計算数(％表示出来るように計算する)
        self.offer_count_rate = self.offer_count / self.enrollment * 100
    
    def gakwari_fun(self):
        # 各学科の入学者数の割合を計算する(％表示出来るように計算する)
        self.subject_rate = self.enrollment / Sub_student.total_enrollment * 100

    


