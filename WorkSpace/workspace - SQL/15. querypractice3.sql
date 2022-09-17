-- 집합의 일부만 출력
-- PAY_DE(지급일자) 조건을 만족하는 집합에서 10건 먼저 출력,
-- 그 10건의 출력결과를 PAY_AMT로 내림차순 정렬
SELECT A.SAL_HIS_NO 
	,A.PAY_DE 
	,A.PAY_AMT 
	,A.EMP_NO 
FROM EZEN.TB_SAL_HIS A
WHERE A.PAY_DE >= '20200501'
	AND A.PAY_DE <='20200531'
	AND ROWNUM <= 10
ORDER BY A.PAY_AMT DESC
;



-- PAY_DE(지급일자) 조건을 만족하는 집합에서
-- PAY_DE 기준으로 내림차순 정렬한 집합 중 상위 10건만 출력
SELECT A.SAL_HIS_NO 
	,A.PAY_DE 
	,A.PAY_AMT 
	,A.EMP_NO
FROM 
	(
	SELECT A.SAL_HIS_NO 
		,A.PAY_DE 
		,A.PAY_AMT 
		,A.EMP_NO
	FROM EZEN.TB_SAL_HIS A
	WHERE A.PAY_DE >= '20200501'
	AND A.PAY_DE <='20200531'
	ORDER BY A.PAY_AMT DESC
	) A
WHERE ROWNUM <=10
;


-- 단일행 문자형 함수

SELECT LOWER('Oracle Server, SQL Developer') AS "LOWER('소문자로 변환')"
	   ,UPPER('Oracle Server, SQL Developer') AS "UPPER('대문자로 변환')"
	   ,ASCII('A') AS "ASCII('아스키 코드값 출력')"
	   ,CONCAT('SQL', 'Developer') AS "CONCAT('문자열 결합')"
	   ,SUBSTR('SQL Developer', 1,3) AS "SUBSTR('문자열 잘라내기')" 
	   ,LENGTH('SQL') AS "LENGTH('문자열의 길이출력')"
	   ,LTRIM(' SQL') AS "LTRIM(왼쪽 공백 제거)"
	   ,RTRIM('SQL ') AS "RTRIM(오른쪽 공백 제거)"
FROM DUAL
;


-- 단일행 숫자형 함수
SELECT ABS(-15) AS "ABS('절대값을 반환)"
		,SIGN(10) AS "SIGN('양수일 경우 1, 음수일 경우 -1, 0일 경우 0 반환')"
		,MOD(8,3) AS "MOD('나머지 반환)"
		,CEIL(38.678) AS "CEIL('무조건 올림')"
		,FLOOR(38.678) AS "FLOOR('무조건 버림')"
		,ROUND(38.687, 2) AS "ROUND('소수점 2번째 자리까지 반올림')"
		,TRUNC(38.678) AS "TRUNC('0의 자리에서 무조건 자름')"
		,TRUNC(38.678, 1) AS "TRUNC('1의 자리에서 무조건 자름')"
		,TRUNC(38.678, 2) AS "TRUNC('2의 자리에서 무조건 자름')"
		,TRUNC(38.678, 3) AS "TRUNC('3의 자리에서 무조건 자름')"
FROM DUAL
;

-- 날짜형 데이터 변환 함수
SELECT SYSDATE AS "SYSDATE"												-- 현재 년월일시분초 출력
		,EXTRACT(YEAR FROM SYSDATE) AS "EXTRACT(YEAR FROM SYSDATE)"		-- 년 출력
		,EXTRACT(MONTH FROM SYSDATE) AS "EXTRACT(MONTH FROM SYSDATE)"	-- 월 출력
		,EXTRACT(DAY FROM SYSDATE) AS "EXTRACT(DAY FROM SYSDATE)"		-- 일 출력
		,TO_CHAR(SYSDATE, 'YYYY') AS "TO_CHAR(SYSDATE, 'YYYY')"			-- 년 출력 (문자열)
		,TO_CHAR(SYSDATE, 'MM') AS "TO_CHAR(SYSDATE, 'MM')"				-- 월 출력 (문자열)
		,TO_CHAR(SYSDATE, 'DD') AS "TO_CHAR(SYSDATE, 'DD')"				-- 일 출력 (문자열)
		,TO_CHAR(SYSDATE, 'HH24') AS "TO_CHAR(SYSDATE, 'HH24')"			-- 시 출력 (문자열)
		,TO_CHAR(SYSDATE, 'MI') AS "TO_CHAR(SYSDATE, 'MI')"				-- 분 출력 (문자열)
		,TO_CHAR(SYSDATE, 'SS') AS "TO_CHAR(SYSDATE, 'SS')"				-- 초 출력 (문자열)
		,TO_NUMBER(TO_CHAR(SYSDATE,'YYYY')) AS "TO_NUMBER(TO_CHAR(SYSDATE,'YYYY'))"		-- 년 출력 (숫자)
		,TO_NUMBER(TO_CHAR(SYSDATE, 'MM')) AS "TO_NUMBER(TO_CHAR(SYSDATE, 'MM'))"		-- 월 출력 (숫자)
		,TO_NUMBER(TO_CHAR(SYSDATE, 'DD')) AS "TO_NUMBER(TO_CHAR(SYSDATE, 'DD'))"		-- 일 출력 (숫자)
		,TO_NUMBER(TO_CHAR(SYSDATE, 'HH24')) AS "TO_NUMBER(TO_CHAR(SYSDATE, 'HH24'))"	-- 시 출력 (숫자)
		,TO_NUMBER(TO_CHAR(SYSDATE, 'MI')) AS "TO_NUMBER(TO_CHAR(SYSDATE, 'MI'))"		-- 분 출력 (숫자)
		,TO_NUMBER(TO_CHAR(SYSDATE, 'SS')) AS "TO_NUMBER(TO_CHAR(SYSDATE, 'SS'))"		-- 초 출력 (숫자)
FROM DUAL
;


-- 날짜형 데이터 연산
SELECT 
	SYSDATE AS "SYSDATE"										-- 현재 년월일시분초
	,SYSDATE -1 AS "SYSDATE -1"									-- 1일 뺀 년월일시분초
	,SYSDATE -(1/24) AS "SYSDATE -(1/24)"						-- 1시간 뺀 년월일시분초
	,SYSDATE -(1/24/60) AS "SYSDATE -(1/24/60)"					-- 1분 뺀 년월일시분초
	,SYSDATE -(1/24/60/60) AS "SYSDATE -(1/24/60/60)"			-- 1초 뺀 년월일시분초
	,SYSDATE -(1/24/60/60) * 10 AS "SYSDATE -(1/24/60/60)* 10"	-- 10초 뺀 년월일시분초
	,SYSDATE -(1/24/60/60) * 30 AS "SYSDATE -(1/24/60/60)* 30"	-- 30초 뺀 년월일시분초
FROM DUAL 
;


-- 데이터 변환의 종류
/*
 * 	1) 암시적 형변환: DBMS가 자동으로 데이터 유형을 변환
 *  2) 명시적 형변환: 데이터 변환 함수로 데이터 유형을 변환
 * */
SELECT TO_CHAR(SYSDATE, 'YYYY/MM/DD') "TO_CHAR(SYSDATE, 'YYYY/MM/DD')"
	,TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS') "TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS')"
	,TO_CHAR(10.25, '$999,999,999.99') "TO_CHAR(10.25, '$999,999,999.99')"
	,TO_CHAR(12500,'L999,999,999') "TO_CHAR(12500,'L999,999,999')" 
	,TO_NUMBER('100') + TO_NUMBER('100') AS "TO_NUMBER('100') + TO_NUMBER('100')"
FROM DUAL
;


/*
 *  CASE WHEN 조건
 * 		THEN 값 혹은 SQL문
 * 		ELSE 값 혹은 SQL문
 *  END
 * 
 *  : 조건이 맞으면 THEN절을 수행하고 그렇지 않으면 ELSE절 수행
 * */
SELECT CASE WHEN SAL_CD = '100001' THEN '기본급'
			WHEN SAL_CD = '100002' THEN '상여금'
			WHEN SAL_CD = '100003' THEN '특별상여금'
			WHEN SAL_CD = '100004' THEN '야근수당'
			WHEN SAL_CD = '100005' THEN '주말수당'
			WHEN SAL_CD = '100006' THEN '점심식대'
			WHEN SAL_CD = '100007' THEN '복지포인트'
			ELSE '유효하지 않음'
END SAL_NM 
FROM EZEN.TB_SAL
;

/*
 *  DECODE(표현식 혹은 기준컬럼, 비교값1, 결과값1, 비교값2, 결과값2, 디폴트 값)
 *  
 * : 표현식 혹은 기준컬럼과 비교하여 비교값1과 같으면 결과값1,
 *   				 		비교값2와 같으면 결과값2를 출력, 모두 다르면 디폴트 출력
 * */

SELECT DECODE(EZEN.TB_SAL.SAL_CD,'100001', '기본급2','100002','상여금','기타') AS SAL_NM
FROM EZEN.TB_SAL
;



-- NULL 관련 함수
-- DIRECT_MANAGER_EMP_NO가 NULL인 경우 '최상위자'를 출력
SELECT NVL(DIRECT_MANAGER_EMP_NO,'최상위자') 
FROM EZEN.TB_EMP
WHERE DIRECT_MANAGER_EMP_NO IS NULL
;

-- 최상위 부서
SELECT NVL(UPPER_DEPT_CD,'최상위부서') 
FROM EZEN.TB_DEPT
WHERE UPPER_DEPT_CD IS NULL
;



SELECT NVL(MAX(EMP_NAME) ,'존재하지 않음') AS EMP_NAME 
FROM EZEN.TB_EMP
WHERE EMP_NAME = '김회장'
;

-- MAX 함수를 사용하면 공집합인 경우에도 한개의 ROW가 나옴
SELECT NVL(MAX(EMP_NAME) ,'존재하지 않음') AS EMP_NAME 
FROM EZEN.TB_EMP
WHERE EMP_NAME = '손흥민'
;

-- 같지 않으면 박찬호 리턴
SELECT NULLIF ('박찬호', '박지성') FROM DUAL
;

-- 같으면 NULL 리턴
SELECT NULLIF ('박찬호', '박찬호') FROM DUAL
;

SELECT NVL(NULLIF('신사임당', '신사임당'), '같으면 NULL') FROM DUAL 
;


-- COALESCE() : 널이 아닌 첫번째 수식/값을 리턴
SELECT COALESCE (NULL, NULL, 0) AS COALESCE_ FROM DUAL
;
SELECT COALESCE (5000, NULL, 0) AS COALESCE_ FROM DUAL
;
SELECT COALESCE (NULL, 6000, 0) AS COALESCE_ FROM DUAL
;






















