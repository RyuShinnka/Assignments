# 辞書問題１　ファイル名：jisho-Mon1			
# 	syouhinという辞書名で定義		
# 	｛’no01’:2500,’no03’:5500,’no10’:1200｝		
			
# 	追加データは’no02’:3600		
# 	削除データ’no01’のキー		
# 	変更データは’no03’の値を6000		
# 	以上の変更をして表示しなさい。		

syohin = {'no01':2500,'no03':5500,'no10':1200}
syohin['no02'] = 3600
print('syohinを追加データした後：',syohin)

syohin.pop('no01')
print('syohinを削除データした後：',syohin)

syohin['no03'] = 6000
print('syohinを変更データした後：',syohin)