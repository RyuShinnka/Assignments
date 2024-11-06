-- gakki_mst					楽器マスタ
-- No.	フィールド名	属性	桁数	NULL	備考
-- 1	gakki_no	int		PRI	楽器No
-- 2	gakki_name	varchar	255		楽器名
-- 3	delete_ku	char	1		削除区分（0：正常データ、1：削除済み）
-- 4	insert_at	datetime			登録日時
-- 5	update_at	datetime			更新日時




create table gakki_mst (
  gakki_no int not null,
  gakki_name varchar(255) not null,
  delete_ku char(1) not null,
  insert_at datetime not null,
  update_at datetime not null,
  primary key (gakki_no)
);

-- kokyaku_mst					顧客マスタ
-- No.	フィールド名	属性	桁数	NULL	備考
-- 1	kokyaku_no	int		PRI	顧客Nｏ
-- 2	kokyaku_kj	varchar	255		顧客名
-- 3	kokyaku_kn	varchar	255		顧客名（カナ）
-- 4	gakki_no	int			楽器No
-- 5	delete_ku	char	1		削除区分（0：正常データ、1：削除済み）
-- 6	insert_at	datetime			登録日時
-- 7	update_at	datetime			更新日時

create table kokyaku_mst (
  kokyaku_no int not null,
  kokyaku_kj varchar(255) not null,
  kokyaku_kn varchar(255) not null,
  gakki_no int not null,
  delete_ku char(1) not null,
  insert_at datetime not null,
  update_at datetime not null,
  primary key (kokyaku_no)
);

-- Description_tbl					レシート明細テーブル
-- No.	フィールド名	属性	桁数	NULL	備考
-- 1	kokyaku_no	int		KEY	顧客Nｏ
-- 2	recipt_no	int		KEY	レシートNo
-- 3	delete_ku	char	1		削除区分（0：正常データ、1：削除済み）
-- 4	insert_at	datetime			登録日時
-- 5	update_at	datetime			更新日時

create table Description_tbl (
  kokyaku_no int not null,
  recipt_no int not null,
  delete_ku char(1) not null,
  insert_at datetime not null,
  update_at datetime not null,
  primary key (kokyaku_no, recipt_no)
);

-- recipt_mst					レシートマスタ
-- No.	フィールド名	属性	桁数	NULL	備考
-- 1	recipt_no	int		PRI	レシートNo
-- 2	recipt_date	datetime			日付
-- 3	delete_ku	char	1		削除区分（0：正常データ、1：削除済み）
-- 4	insert_at	datetime			登録日時
-- 5	update_at	datetime			更新日時

create table recipt_mst (
  recipt_no int not null,
  recipt_date datetime not null,
  delete_ku char(1) not null,
  insert_at datetime not null,
  update_at datetime not null,
  primary key (recipt_no)
);
