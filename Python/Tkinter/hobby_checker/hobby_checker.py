import tkinter as tk


"""メソッドの処理"""

# 診断のメソッド
def diagnose():
    p = personality_var.get()
    a = activity_var.get()

    # 条件分岐で趣味を診断
    if p == "活発" and a == "動く":
        hobby = "テニス"
        comment = "健康的で社交的なあなたにぴったり！"
    elif p == "おだやか" and a == "ゆっくり":
        hobby = "読書"
        comment = "静かな時間が好きなあなたに最適です。"
    elif p == "まじめ":
        hobby = "書道"
        comment = "集中力と忍耐力のあるあなたにおすすめ。"
    else:
        hobby = "ジョギング"
        comment = "気分転換に最適なアクティブ習慣です。"

    # 結果を表示
    result_label.config(text=f"あなたにぴったりなのは… {hobby}！")
    comment_label.config(text=comment)
    result_label.pack(pady=10)
    comment_label.pack()

# リセット処理（もう一度診断）
def reset():
    personality_var.set("活発")
    activity_var.set("動く")
    result_label.config(text="")
    comment_label.config(text="")

"""メインの処理"""

# ウィンドウを作成
root = tk.Tk()
root.title("あなたにぴったりの趣味は？")
root.geometry("400x600")

# 性格の選択肢（ラジオボタン用の変数）
personality_var = tk.StringVar(value="活発")
activity_var = tk.StringVar(value="動く")

# タイトル
title_label = tk.Label(root, text="あなたにぴったりの趣味は？", font=("游ゴシック", 18))
title_label.pack(pady=20)

# 質問1
q1_label = tk.Label(root, text="【質問1】どんな性格ですか？", font=("游ゴシック", 14))
q1_label.pack()
tk.Radiobutton(root, text="活発", variable=personality_var, value="活発", font=("游ゴシック", 12)).pack()
tk.Radiobutton(root, text="おだやか", variable=personality_var, value="おだやか", font=("游ゴシック", 12)).pack()
tk.Radiobutton(root, text="まじめ", variable=personality_var, value="まじめ", font=("游ゴシック", 12)).pack()

# 空行
tk.Label(root, text="").pack()

# 質問2
q2_label = tk.Label(root, text="【質問2】休日はなにをしたい？", font=("游ゴシック", 14))
q2_label.pack()
tk.Radiobutton(root, text="体を動かしたい", variable=activity_var, value="動く", font=("游ゴシック", 12)).pack()
tk.Radiobutton(root, text="ゆっくりしたい", variable=activity_var, value="ゆっくり", font=("游ゴシック", 12)).pack()

# 空行
tk.Label(root, text="").pack()

# 診断結果を表示するラベル（初期は空白）
result_label = tk.Label(root, text="", font=("游ゴシック", 16, "bold"))
comment_label = tk.Label(root, text="", font=("游ゴシック", 12))


# 診断ボタン
check_button = tk.Button(root, text="診断する", command=diagnose, font=("游ゴシック", 12), bg="#4caf50", fg="white", padx=20, pady=5)
check_button.pack(pady=15)

# リセットボタン
reset_button = tk.Button(root, text="もう一度診断", command=reset, font=("游ゴシック", 12), bg="#2196f3", fg="white", padx=20, pady=5)
reset_button.pack(pady=5)

# アプリを開始
root.mainloop()
