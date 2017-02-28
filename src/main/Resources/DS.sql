# mysql -u root -p --default-character-set=utf8
# 登陆并source，请使用上面的参数，否者source的数据库会乱码
SET NAMES 'utf8';

CREATE DATABASE IF NOT EXISTS HibernateLearn CHARACTER SET utf8;

# 禁止外键约束检查 不建议
# SET FOREIGN_KEY_CHECKS=0;

USE HibernateLearn;

# 学生表
CREATE TABLE IF NOT EXISTS Student(
  Sno CHAR(9) PRIMARY KEY,Sname CHAR(20) UNIQUE,Ssex CHAR(2),Sage SMALLINT,Sdept CHAR(20)
);
# 课程表
CREATE TABLE IF NOT EXISTS Course(
  Cno CHAR(4) PRIMARY KEY,Cname CHAR(40) NOT NULL ,Cpno CHAR(4),Ccredit SMALLINT,
  FOREIGN KEY (Cpno) REFERENCES Course(Cno)
);
# 选修关系表
CREATE TABLE IF NOT EXISTS SC(
  Sno CHAR(9),Cno CHAR(4),Grade SMALLINT,
  PRIMARY KEY (Sno,Cno),
  FOREIGN KEY (Sno) REFERENCES Student(Sno),
  FOREIGN KEY (Cno) REFERENCES Course(Cno)
);

# 插入数据
INSERT INTO Student VALUES ('201215121','李勇','男',20,'CS');
INSERT INTO Student VALUES ('201215122','刘晨','女',19,'CS');
INSERT INTO Student VALUES ('201215123','王敏','女',18,'MA');
INSERT INTO Student VALUES ('201215125','张立','男',19,'IS');

INSERT INTO Course VALUES ('2','数学',  '','2');
INSERT INTO Course VALUES ('6','数据处理','','2');
INSERT INTO Course VALUES ('4','操作系统','6','3');
INSERT INTO Course VALUES ('7','PASCAL语言','6','4');
INSERT INTO Course VALUES ('5','数据结构','7','4');
INSERT INTO Course VALUES ('1','数据库','5','4');
INSERT INTO Course VALUES ('3','信息系统','1','4');


INSERT INTO SC VALUES ('201215121','1',92);
INSERT INTO SC VALUES ('201215121','2',85);
INSERT INTO SC VALUES ('201215121','3',88);
INSERT INTO SC VALUES ('201215122','2',90);
INSERT INTO SC VALUES ('201215122','3',80);