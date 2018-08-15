CREATE TABLE IF NOT EXISTS cars (
  id          INTEGER PRIMARY KEY,
  name        VARCHAR2(20),
  description VARCHAR2(50)
);

DELETE FROM cars;

INSERT INTO cars (id, name, description) VALUES (1, '哈弗h7', '哈弗品牌车型');
INSERT INTO cars (id, name, description) VALUES (2, '东风汗马', '第三代高机动性越野车');
INSERT INTO cars (id, name, description) VALUES (3, '玛莎拉蒂', '意大利豪华汽车制造商');