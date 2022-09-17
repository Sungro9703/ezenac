-- ȸ�� ���̺� ����
DROP TABLE t_member CASCADE CONSTRAINT
;

CREATE TABLE t_member
(
	id			varchar2(10)		PRIMARY KEY
	,pwd		varchar2(10)
	,name		varchar2(50)
	,email		varchar2(50)
	,joinDate	DATE DEFAULT SYSDATE
)
;


-- ȸ�� ���� �߰�
INSERT INTO T_MEMBER VALUES ('lee', '0824', '�̼���', 'lee@gmail.com', sysdate)
;
INSERT INTO T_MEMBER VALUES ('hong', '0824', 'ȫ�浿', 'hong@gmail.com', sysdate)
;
INSERT INTO T_MEMBER VALUES ('shin', '0824', '�Ż��Ӵ�', 'shin@gmail.com', sysdate)
;

INSERT INTO T_MEMBER VALUES ('lee', '0824', '�̼���', 'lee@gmail.com', sysdate)


INSERT INTO T_MEMBER(ID, PWD, NAME, EMAIL) VALUES ('test', '0824', ' �׽�Ʈ', 'test@gmail.com');




COMMIT;


SELECT * FROM T_MEMBER;

SELECT * FROM T_MEMBER ORDER BY JOINDATE DESC
;

SELECT NAME FROM T_MEMBER WHERE ID = 'lee'
;

UPDATE T_MEMBER 
SET PWD = '0826', NAME = '����05', EMAIL = 'ezen05@gamil.com'
WHERE ID = 'ezen5'
;

DELETE 


DELETE FROM T_MEMBER WHERE ID = 'ezen'
;



SELECT DECODE(COUNT(*), 1, 'TRUE', 'FALSE') AS RESULT
FROM T_MEMBER
WHERE ID = 'lee' AND PWD = '0824'
;




-- ���̺� �� ������ ����
DROP TABLE MEMBER CASCADE CONSTRAINT;
CREATE TABLE MEMBER (
	id varchar2(10) NOT NULL
	,pass varchar2(10) NOT NULL
	,name varchar2(30) NOT NULL
	,regidate DATE DEFAULT SYSDATE NOT NULL
	,PRIMARY KEY (id)	
)
;


INSERT INTO "MEMBER" (id, pass, name)
VALUES ('ezen', '0824', '����')
;

INSERT INTO "MEMBER" (id, pass, name)
VALUES ('lee', '0824', '�̼���')
;




SELECT * FROM "MEMBER" WHERE ID = 'ezen' AND PASS = '0824'
;



---------------------------------------------------------------------

DROP TABLE BOARD CASCADE CONSTRAINTS;
CREATE TABLE BOARD (
	NUM		NUMBER		PRIMARY KEY
	,TITLE	VARCHAR2(200) NOT NULL
	,CONTENT VARCHAR2(2000) NOT NULL
	,ID		VARCHAR2(10) NOT NULL
	,POSTDATE DATE DEFAULT SYSDATE NOT NULL
	,VISITCOUNT NUMBER(6)
);


-- �ܷ�Ű�� ���̺� ������ ���� ����
-- BOARD ���̺��� ID �÷��� MEMBER ���̺��� ID �÷��� ����
ALTER TABLE BOARD
	ADD CONSTRAINT BOARD_MEMBER_FK FOREIGN KEY (ID)
	REFERENCES MEMBER (ID)
	;


-- �Ϸù�ȣ�� ������(Sequence) ��ü ����
-- 	: ���������� �����ϴ� ������ ��ȯ�ϴ� �����ͺ��̽� ��ü
DROP SEQUENCE seq_board_num;
CREATE SEQUENCE seq_board_num
	INCREMENT BY 1					-- 1�� ����
	START WITH 1					-- ���۰� 1
	MINVALUE 1						-- �ּҰ� 1
	NOMAXVALUE						-- �ִ밪 ���Ѵ�
	NOCYCLE							-- ��ȯ���� ����
	NOCACHE							-- ĳ�� ����
; 


INSERT INTO BOARD VALUES (seq_board_num.nextval, '������ 6�� ��°��', '�����ϰ��� ȭ�����Դϴ�. �߷�...',
		'ezen', sysdate, 0)
;

INSERT INTO BOARD VALUES (seq_board_num.nextval, '2022�� ������ ��', '����� ���ص� ������ �������׿�...',
		'ezen', sysdate, 0)
;

INSERT INTO BOARD VALUES (seq_board_num.nextval, '�ų����� �д缱 ����', '���簡 ������ �Ǿ� �ε��� �о������� �ǹ����簡 ���ʿ���...',
		'ezen', sysdate, 0)
;

INSERT INTO BOARD VALUES (seq_board_num.nextval, '�������� ������ �ǹ�', '�� �ǹ� 1�� ����轺 Ŀ������ �������� � ���԰� ���ñ��?',
		'ezen', sysdate, 0)
;
COMMIT;

SELECT * FROM BOARD
ORDER BY NUM DESC 
;

SELECT *
FROM BOARD
WHERE TITLE LIKE '%����%'
;

SELECT *
FROM BOARD
WHERE CONTENT LIKE '%��%'
;

SELECT COUNT(*) FROM BOARD WHERE TITLE LIKE '%����%'
;

SELECT COUNT(*) FROM BOARD WHERE CONTENT LIKE '%��%'
;

SELECT b.*
		, m.NAME
FROM "MEMBER" m
INNER JOIN BOARD b ON m.ID = b.ID
WHERE NUM = 3
;


UPDATE BOARD SET VISITCOUNT = VISITCOUNT + 1
WHERE NUM = 1
;


UPDATE BOARD SET TITLE = '���׸��� ����' , CONTENT = '� �������� �Ǿ�ߵ��ٵ���.'
WHERE NUM = 9
;


DELETE FROM BOARD b WHERE NUM = 8;






DROP TABLE mvcboard CASCADE CONSTRAINTS;
CREATE TABLE mvcboard (
	idx			NUMBER		 PRIMARY KEY
	,name		varchar2(50) NOT NULL
	,title		varchar2(200) NOT NULL
	,content	varchar2(2000) NOT NULL
	,postdate	DATE DEFAULT sysdate NOT NULL
	,ofile		varchar2(200)
	,sfile		varchar2(30)
	,download	NUMBER DEFAULT 0 NOT NULL
	,pass		varchar2(50) NOT NULL
	,visitcount	NUMBER DEFAULT 0 NOT NULL
);


INSERT INTO EZEN.MVCBOARD 
(IDX, NAME, TITLE, CONTENT , PASS)
VALUES(seq_board_num.nextval, '�̼���', '�ѻ꿵ȭ', '������ �ֿ����� 7���� �󿵿����Դϴ�', '0824');
INSERT INTO EZEN.MVCBOARD 
(IDX, NAME, TITLE, CONTENT, PASS)
VALUES(seq_board_num.nextval, '�̼���', '�ѻ꿵ȭ2', '������ �ֿ����� 7���� �󿵿����Դϴ�2', '0824');
INSERT INTO EZEN.MVCBOARD 
(IDX, NAME, TITLE, CONTENT, PASS)
VALUES(seq_board_num.nextval, '�̼���', '�ѻ꿵ȭ3', '������ �ֿ����� 7���� �󿵿����Դϴ�3', '0824');
INSERT INTO EZEN.MVCBOARD 
(IDX, NAME, TITLE, CONTENT, PASS)
VALUES(seq_board_num.nextval, '�̼���', '�ѻ꿵ȭ4', '������ �ֿ����� 7���� �󿵿����Դϴ�4', '0824');
INSERT INTO EZEN.MVCBOARD 
(IDX, NAME, TITLE, CONTENT, PASS)
VALUES(seq_board_num.nextval, '�̼���', '�ѻ꿵ȭ5', '������ �ֿ����� 7���� �󿵿����Դϴ�5', '0824');

INSERT INTO EZEN.MVCBOARD 
(IDX, NAME, TITLE, CONTENT , PASS)
VALUES(seq_board_num.nextval, '�̼���', '�ѻ꿵ȭ6', '������ �ֿ����� 7���� �󿵿����Դϴ�6', '0824');
INSERT INTO EZEN.MVCBOARD 
(IDX, NAME, TITLE, CONTENT, PASS)
VALUES(seq_board_num.nextval, '�̼���', '�ѻ꿵ȭ7', '������ �ֿ����� 7���� �󿵿����Դϴ�7', '0824');
INSERT INTO EZEN.MVCBOARD 
(IDX, NAME, TITLE, CONTENT, PASS)
VALUES(seq_board_num.nextval, '�̼���', '�ѻ꿵ȭ8', '������ �ֿ����� 7���� �󿵿����Դϴ�8', '0824');
INSERT INTO EZEN.MVCBOARD 
(IDX, NAME, TITLE, CONTENT, PASS)
VALUES(seq_board_num.nextval, '�̼���', '�ѻ꿵ȭ9', '������ �ֿ����� 7���� �󿵿����Դϴ�9', '0824');
INSERT INTO EZEN.MVCBOARD 
(IDX, NAME, TITLE, CONTENT, PASS)
VALUES(seq_board_num.nextval, '�̼���', '�ѻ꿵ȭ10', '������ �ֿ����� 7���� �󿵿����Դϴ�10', '0824');
INSERT INTO EZEN.MVCBOARD 
(IDX, NAME, TITLE, CONTENT, PASS)
VALUES(seq_board_num.nextval, '�̼���', '�ѻ꿵ȭ11', '������ �ֿ����� 7���� �󿵿����Դϴ�11', '0824');
INSERT INTO EZEN.MVCBOARD 
(IDX, NAME, TITLE, CONTENT, PASS)
VALUES(seq_board_num.nextval, '�̼���', '�ѻ꿵ȭ12', '������ �ֿ����� 7���� �󿵿����Դϴ�12', '0824');
INSERT INTO EZEN.MVCBOARD 
(IDX, NAME, TITLE, CONTENT, PASS)
VALUES(seq_board_num.nextval, '�̼���', '�ѻ꿵ȭ13', '������ �ֿ����� 7���� �󿵿����Դϴ�13', '0824');
INSERT INTO EZEN.MVCBOARD 
(IDX, NAME, TITLE, CONTENT, PASS)
VALUES(seq_board_num.nextval, '�̼���', '�ѻ꿵ȭ14', '������ �ֿ����� 7���� �󿵿����Դϴ�14', '0824');
INSERT INTO EZEN.MVCBOARD 
(IDX, NAME, TITLE, CONTENT, PASS)
VALUES(seq_board_num.nextval, '�̼���', '�ѻ꿵ȭ15', '������ �ֿ����� 7���� �󿵿����Դϴ�15', '0824');


SELECT ID, PASS, rownum
FROM "MEMBER"
;

SELECT ID, Pwd, rownum
FROM T_MEMBER
;


-- ����¡ ó�� ������
SELECT * FROM MVCBOARD ORDER BY idx DESC
;

SELECT tb.*, rownum rNum FROM (
	SELECT * FROM MVCBOARD ORDER BY idx DESC
) tb
;

SELECT * FROM (
	SELECT tb.*, rownum rNum FROM (
		SELECT * FROM MVCBOARD ORDER BY idx DESC
	) tb
)
WHERE rNum BETWEEN 1 AND 10
;




-- ���� ���ε�, �ٿ�ε� ���̺� ����
DROP TABLE myfile CASCADE CONSTRAINTS;
CREATE TABLE myfile (
	idx			NUMBER		 PRIMARY KEY
	,name		varchar2(50) NOT NULL
	,title		varchar2(200) NOT NULL
	,cate		varchar2(30)
	,ofile		varchar2(100) NOT NULL
	,sfile		varchar2(30) NOT NULL
	,postdate	DATE DEFAULT sysdate NOT NULL
);


INSERT INTO EZEN.MYFILE
(IDX, NAME, TITLE, CATE, OFILE, SFILE)
VALUES(seq_board_num.nextval, '����IT', '����', '����', 'test.jpg', '20220621');


SELECT * FROM MYFILE ORDER BY IDX DESC
;


SELECT * FROM MVCBOARD WHERE IDX = '20';


UPDATE MVCBOARD SET VISITCOUNT = VISITCOUNT + 1
WHERE IDX = '20';


UPDATE MVCBOARD SET DOWNLOAD = DOWNLOAD + 1
WHERE IDX = '20';



SELECT COUNT(*) FROM MVCBOARD WHERE PASS = 0824 AND IDX = '20'
;


DELETE FROM MVCBOARD WHERE IDX = '20'
;



UPDATE MVCBOARD
SET TITLE ='', NAME ='', CONTENT ='', OFILE='',SFILE =''
WHERE IDX ='' AND PASS = ''
;


UPDATE MVCBOARD
SET NAME='�̹��2', TITLE='������2', CONTENT='�� ���� �ֽ��ϴ�.2',
OFILE='icon22.png', SFILE='' 
WHERE IDX= '' AND PASS = '20220623_123069862222.png'
;










