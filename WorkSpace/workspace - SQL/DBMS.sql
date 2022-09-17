--������1�� TB_EMP ���̺� CHAR 1����Ʈ ũ���� ����ٹ�����(HEAD_WORK_YN) �÷���
-- �߰��ϰ��� �Ѵ�. �ùٸ� DDL���� �����ΰ�? (����Ŭ ����) (10��)
ALTER TABLE TB_EMP ADD HEAD_WORK_YN CHAR(1);


--������2�� 2019���� ��ձ޿��׼��� 450���� �̻��� ������ ����ϴ� SQL���� �ۼ��Ͻÿ�. (10��)
SELECT
	(SELECT EMP_NAME FROM TB_EMP B WHERE B.EMP_NO = A.EMP_NO) AS EMP_NAME
FROM TB_SAL_HIS A 
WHERE A.PAY_DE BETWEEN '20190101' AND '20191231'
GROUP BY A.EMP_NO
HAVING AVG(A.PAY_AMT) >= 4500000
;


--������3�� �ּҰ� ������ ������ �����ȣ, �����, �ּ�, �μ��ڵ�, �μ���, �ڰ����ڵ带 ����Ͻÿ�. (10��)
SELECT A.EMP_NO 
	,A.EMP_NAME 
	,A.ADDR 
	,A.DEPT_CD 
	,B.DEPT_NM 
	,C.CERTI_CD 
FROM TB_EMP A
	,TB_DEPT B
	,TB_CERTI C
WHERE A.DEPT_CD = B.DEPT_CD
AND A.ADDR LIKE '%����%'
;


--������4�� �μ����� �������� ������ �����ȣ, �����, �μ��ڵ�, �μ���, �����ڰ��� �ڵ� �� �ڰ������� 
--		  ����Ͻÿ�. (10��)
SELECT A.EMP_NO 
	,A.EMP_NAME 
	,A.DEPT_CD 
	,B.DEPT_NM 
	,C.CERTI_CD
	,C.CERTI_NM
FROM TB_EMP A
	,TB_DEPT B
	,TB_CERTI C
WHERE A.DEPT_CD = B.DEPT_CD
AND B.DEPT_NM = '������'
;


--������5�� �Ʒ��� SQL���� ORDER BY���� �̿��� ��� ������ ������ SQL���̴�.
--��� ������ ���� ������ ������ ORDER BY���� ������ �ۼ��Ͻÿ�.  (10��)

--SELECT
--A.CERTI_CD
--, A.CERTI_NM
--, A.ISSUE_INSTI_NM
--FROM TB_CERTI A
--ORDER BY A.ISSUE_INSTI_NM DESC, A.CERTI_CD ASC;
SELECT
A.CERTI_CD
, A.CERTI_NM
, A.ISSUE_INSTI_NM
FROM TB_CERTI A
ORDER BY 3 DESC, 1 ASC;


--������6�� 4���� ���̺��� �����Ͽ� �ʿ��� ���� �� �÷����� ��ȸ�ϰ��� �Ѵ�.
-- �ּ� ��� ���� ������ �ʿ��Ѱ�? (10��)

-- 3���� ���� ����


--������7�� �����ڻ����ȣ�� ���� ���� ���ڵ带 ã�Ƴ��� �������� �ۼ��Ͻÿ�. (10��)
SELECT *
FROM TB_DEPT A
WHERE A.UPPER_DEPT_CD IS NULL
;


--������8�� �޿�������ȣ, ��������, ���ޱݾ�, �����ȣ�� ����� �� ���ޱݾ��� 3000���� �������� ���� ���� 
--		  5�̻��� ������� ����Ͻÿ�. (10��)
SELECT A.SAL_HIS_NO
	,A.PAY_DE 
	,A.PAY_AMT
	,A.EMP_NO 
FROM TB_SAL_HIS A
WHERE (A.PAY_AMT/3000) >= 5
;


--������9�� ���μ��� �޿��� ����� ���ϴ� ��հ��� ���� �ͺ��� ����Ͻÿ� (�Ҽ��� ���� ��°�ڸ��������) (10��) 
SELECT 
	B.DEPT_CD 
	,ROUND(AVG(A.PAY_AMT), 2)
FROM TB_SAL_HIS A
	,TB_EMP B
WHERE B.EMP_NO = A.EMP_NO 
GROUP BY B.DEPT_CD 
ORDER BY ROUND(AVG(A.PAY_AMT), 2) ASC
;


--������10�� �� �μ��� �������� 3�� �̻��� �μ��� ����Ͻÿ�. (10��)
SELECT A.DEPT_CD 
	, (SELECT B.DEPT_NM  FROM TB_DEPT B WHERE B.DEPT_CD = A.DEPT_CD) AS DEPT_NM 
	, COUNT(*) AS "������"
FROM TB_EMP A
GROUP BY A.DEPT_CD
HAVING (COUNT(*)) >= 3
ORDER BY A.DEPT_CD  
;






