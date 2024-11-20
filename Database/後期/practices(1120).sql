
-- 肉マスタテーブル
CREATE TABLE s24161012_meats_mst (
  meats_no INT NOT NULL,
  menu_name VARCHAR(255) NOT NULL,
  weight_meats INT NOT NULL,
  delete_ku CHAR(1) NOT NULL,
  insert_at DATETIME NOT NULL,
  update_at DATETIME NOT NULL,
  PRIMARY KEY (meats_no)
);

-- 顧客マスタテーブル
CREATE TABLE s24161012_consumer_mst (
  consumer_no INT NOT NULL,
  consumer_name VARCHAR(255) NOT NULL,
  delete_ku CHAR(1) NOT NULL,
  insert_at DATETIME NOT NULL,
  update_at DATETIME NOT NULL,
  PRIMARY KEY (consumer_no)
);

-- 明細テーブル
CREATE TABLE s24161012_details_tbl (
  detail_no INT NOT NULL,
  date_nb DATETIME NOT NULL,
  consumer_no INT NOT NULL,
  delete_ku CHAR(1) NOT NULL,
  insert_at DATETIME NOT NULL,
  update_at DATETIME NOT NULL,
  PRIMARY KEY (detail_no),
  FOREIGN KEY (consumer_no) REFERENCES s24161012_consumer_mst (consumer_no)
);

-- 明細サブテーブル
CREATE TABLE s24161012_details_sub_tbl (
  detail_no INT NOT NULL,
  meats_no INT NOT NULL,
  delete_ku CHAR(1) NOT NULL,
  insert_at DATETIME NOT NULL,
  update_at DATETIME NOT NULL,
  PRIMARY KEY (detail_no, meats_no),
  FOREIGN KEY (detail_no) REFERENCES s24161012_details_tbl (detail_no),
  FOREIGN KEY (meats_no) REFERENCES s24161012_meats_mst (meats_no)
);


-- 肉マスタテーブルへのデータ挿入
DELETE FROM s24161012_meats_mst;
INSERT INTO s24161012_meats_mst (
  meats_no,
  menu_name,
  weight_meats,
  delete_ku,
  insert_at,
  update_at
  ) VALUES
    (1, 'ワイルドステーキ', 200, '0', now(), now()),
    (2, '赤身！肩ロースステーキ', 450, '0', now(), now()),
    (3, 'ワイルドハンバーグ', 300, '0', now(), now()),
    (4, 'ワイルドコンボ', 150, '0', now(), now()),
    (5, 'グリル チキンステーキ', 440, '0', now(), now()),
    (6, 'リブロースステーキ', 300, '0', now(), now()),
    (7, '特選ヒレステーキ', 200, '0', now(), now());

-- 顧客マスタテーブルへのデータ挿入
DELETE FROM s24161012_consumer_mst;
INSERT INTO s24161012_consumer_mst (
  consumer_no,
  consumer_name,
  delete_ku,
  insert_at,
  update_at) VALUES
  (1, '村野 幸子', '0', now(), now()),
  (2, '齋藤 綾子', '0', now(), now()),
  (3, '山田 太郎', '0', now(), now()),
  (4, '高橋 秀樹', '0', now(), now());

-- 明細テーブルへのデータ挿入（日付形式修正）
DELETE FROM s24161012_details_tbl;
INSERT INTO s24161012_details_tbl (
  detail_no,
  date_nb,
  consumer_no,
  delete_ku,
  insert_at,
  update_at) VALUES
(1, '2022-05-01', 1, '0', now(), now()),
(2, '2022-05-02', 2, '0', now(), now()),
(3, '2022-05-10', 3, '0', now(), now()),
(4, '2022-05-10', 4, '0', now(), now()),
(5, '2022-05-11', 1, '0', now(), now());

-- 明細サブテーブルへのデータ挿入
DELETE FROM s24161012_details_sub_tbl;
INSERT INTO s24161012_details_sub_tbl (
  detail_no,
  meats_no,
  delete_ku,
  insert_at,
  update_at) VALUES
(1, 1, '0', now(), now()),
(1, 2, '0', now(), now()),
(1, 3, '0', now(), now()),
(2, 4, '0', now(), now()),
(3, 5, '0', now(), now()),
(4, 6, '0', now(), now()),
(5, 7, '0', now(), now()),
(5, 2, '0', now(), now());
