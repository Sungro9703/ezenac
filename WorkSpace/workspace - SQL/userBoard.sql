DROP TABLE userboard CASCADE CONSTRAINTS;
CREATE TABLE userboard (
	idx			NUMBER PRIMARY KEY
	,nickname	varchar2(30)	NOT NULL
	,title		varchar2(50)	NOT NULL
	,content	varchar2(3000)	NOT NULL
	,postdate	DATE DEFAULT sysdate
	,visitcount	NUMBER DEFAULT 0 NOT NULL
	,category	varchar2(20)	NOT NULL
)
;

INSERT INTO EZEN.USERBOARD
(IDX, NICKNAME, TITLE, CONTENT, POSTDATE, VISITCOUNT, CATEGORY)
VALUES(1, 'lee', '�����̴�', 'ù ���Դϴ�.', sysdate , 0, '����');

INSERT INTO EZEN.USERBOARD
(IDX, NICKNAME, TITLE, CONTENT, POSTDATE, VISITCOUNT, CATEGORY)
VALUES(2, 'kim', '�����̴�2', '�� ��° ���Դϴ�.', sysdate , 0, '����');

CREATE SEQUENCE userboard_SEQ
START WITH 1
INCREMENT BY 1;