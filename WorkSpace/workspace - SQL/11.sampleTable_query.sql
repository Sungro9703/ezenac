-- ���� ����
SELECT
    MAX(LIST_PRICE)
FROM PRODUCTS
;

-- LIST_PRICE�� 8867.99�� ���� ����Ͻÿ�
SELECT
    product_id
    ,product_name
    ,list_price
FROM PRODUCTS
WHERE list_price = 8867.99
;


-- ���������� �̿��ؼ� LIST_PRICE�� �ִ밪�� ���� ���
SELECT
    product_id
    ,product_name
    ,list_price
FROM PRODUCTS
WHERE list_price = (
                    SELECT
                        MAX(LIST_PRICE)
                    FROM PRODUCTS
                    )
;


-- ��Į�� ��������
/*
    �� ��ǰ�� ������ ���ϰ�
    �ش� ��ǰ�� ��ġ�ϰ� �ִ� ��ǰ ī�װ��� ��� ������ ���Ͻÿ�
    
    PRODUCT_NAME          LIST_PRICE        AVG_LIST_PRICE
*/

SELECT
         a.product_name
        ,a.list_price
        ,ROUND((
                SELECT AVG(K.LIST_PRICE)
                FROM PRODUCTS K
                WHERE K.CATEGORY_ID = A.CATEGORY_ID
        ), 2) AVG_LIST_PRICE
FROM PRODUCTS A
ORDER BY a.product_name
;



-- �ζ��� �� ��������

SELECT ORDER_ID
	    ,SUM(QUANTITY * UNIT_PRICE) ORDER_VALUE
FROM ORDER_ITEMS oi 
GROUP BY ORDER_ID 
ORDER BY ORDER_VALUE DESC
;


SELECT ORDER_ID
		,ORDER_VALUE
FROM
(
	SELECT ORDER_ID
		    ,SUM(QUANTITY * UNIT_PRICE) ORDER_VALUE
	FROM ORDER_ITEMS oi 
	GROUP BY ORDER_ID 
	ORDER BY ORDER_VALUE DESC
)
WHERE ROWNUM <= 10
;
-- ����� �Ϻ� ��ȸ
--			- ROWNUM (���� �� ��ȣ):SQL ���� ��� �� ���� ��� �����ִ� ����

















