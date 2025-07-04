class Shop:
    #　コンストラクタ
    def __init__(self, id, name, goal):
        self.id = id #売り場別のID
        self.name = name #売り場の名称
        self.goal = goal #目標顧

    def print_info(self):
        print()
        print("売り場のID:", self.id)
        print("売り場の名称:", self.name)
        print("目標顧:", self.goal)