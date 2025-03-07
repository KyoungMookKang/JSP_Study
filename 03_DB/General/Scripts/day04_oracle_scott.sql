-- New script in localhost 4.
-- Connection Type: dev 
-- Url: jdbc:oracle:thin:@//localhost:1521/XE
-- workspace : C:\workspace\multi\03_DB
-- Date: 2024. 5. 9.
-- Time: 오전 9:45:42

-- 그룹함수와 단일행함수
--함수(FUNCTION) : 컬럼값을 읽어서 계산한 결과를 리턴함 
--단일행함수 : 컬럼에 기록된 N 개의 값을 읽어서 N 개의 결과를 리턴 
--그룹함수 : 컬럼에 기록된 N 개의 값을 읽어서 한개의 결과를 리턴


-- 단일행 함수
-- 문자관련함수 
-- LENGTH, CONCAT , SUBSTR,UPPER, LOWER, INSTR....


--CONCAT : 문자열 혹은 컬럼두개를 입력받아 하나로 합친후 리턴
SELECT CONCAT(CONCAT(EMPNO, ':'), ENAME) AS CONCAT_RESULT FROM EMP;

SELECT EMPNO || ':' || ENAME AS CONCAT_RESULT FROM EMP ;

SELECT * FROM EMP;


-- LENGTH : 길이 

SELECT LENGTH(ENAME) FROM EMP;


--TRIM : 주어진 컬럼이나 문자열의 앞/뒤에 지정한문자를 제거 

--LTRIM/ RTRIM : 주어진 컬럼이나 문자열 왼쪽/오른쪽에서 지정한 
--              문자 혹은 문자열을 제거한 나머지를 반환하는 함수 

SELECT LENGTH(TRIM(ENAME)) FROM EMP;

SELECT TRIM(BOTH 'A' FROM ENAME) FROM EMP; -- 양쪽끝에 A를 제거  

SELECT TRIM(LEADING 'A' FROM ENAME) FROM EMP; -- 앞쪽에 A를 제거
 
SELECT TRIM(TRAILING 'A' FROM ENAME) FROM EMP;  -- 뒷쪽에 A를 제거
-- REPLACE : 컬럼혹은 문자열을 입력받아 변경하고자 하는 문자열을 변경

SELECT REPLACE(ENAME, ' ', '') FROM EMP;
SELECT 
    REPLACE('서울시 강남구 역삼동 ', '역삼동', '삼성동') VAL
FROM DUAL;


--SUBSTR: 컬럼이나 문자열에서 지정한 위치로 부터 지정한 문자열을 잘라서 리턴하는 함수
--SUBSTR('문자열', 시작위치, 자를길이)
SELECT 
       ENAME, HIREDATE  사원명
     , SUBSTR(TO_CHAR(HIREDATE,'YYMMDD') , 1, 2) --입사년도 2자리
     , SUBSTR(TO_CHAR(HIREDATE,'YYMMDD'), 3, 2) --월
     , SUBSTR(TO_CHAR(HIREDATE,'YYMMDD'), 5, 2) --일
  FROM EMP;
  
 
 SELECT 
    RPAD(SUBSTR(EMP_NO, 1, 7), 14, '*') AS 주민번호
FROM (
    SELECT '리사' ENAME , '123456-2890123' AS EMP_NO FROM DUAL -- 첫 줄 기준으로 기능이 수행됨
    UNION ALL --UNION ALL은 모든 결과를 단순히 결합
    SELECT '주혁' ENAME , '234567-1901234' AS EMP_NO FROM DUAL
    UNION ALL
    SELECT '사나' ENAME , '345678-2012345' AS EMP_NO FROM DUAL
);



UPDATE EMP 
SET COMM = 0
WHERE COMM IS NULL;
ROLLBACK;


SELECT *
FROM EMP ;

SELECT SAL + COMM AS TOTAL -- NULL 이 있는경우 연산이 제대로 이루어지지 않음
FROM EMP;


UPDATE EMP 
SET COMM = 0
WHERE COMM IS NULL;

COMMIT; 

SELECT SAL + COMM AS TOTAL -- 제대로계산됨


--NULL처리함수
--NVL(컬럼명, 컬럼값이 NULL 일때 바꿀값)

SELECT 
   *
FROM EMP;

SELECT 
    ENAME
    , COMM
    , NVL(COMM , 0) COMM1
FROM EMP;


--NVL2(컬럼명, 바꿀값1, 바꿀값2)
-- 해당컬럼이 값이 있으면 바꿀값 1로 변경
-- 해당 컬럼이 값이 NULL 일결우 바꿀 값 2로 변경 

SELECT 
   ENAME
 , NVL2(COMM , 0.7,0.5) BONUS1
FROM EMP;
FROM EMP;

SELECT *
FROM EMP;


-- 숫자 처리 함수 : ABS, MOD, ROUND, FLOOR, TRUNC , CEIL
-- ABS(숫자 | 숫자 로 된 컬럼명 ) :절대값 구하는 함수

SELECT 
    ABS(-10) COL1
    , ABS(10) COL2
FROM DUAL;


-- MOD(숫자 | 숫자로된 컬럼명, 숫자 | 숫자로된컬럼명) : 두수를 나누어서 나머지를 구하는 함수 
-- 처음인자는 나우어지는 수, 두번째인자는 나눌수

SELECT 
    MOD(10, 5) COL1
    , MOD(10, 3) COL2
FROM DUAL;


-- ROUND( 숫자 | 숫자로된 컬럼명, [위치]) : 반올림해서 리턴하는 함수

SELECT ROUND(123.456) FROM DUAL;
SELECT ROUND(123.456, 0) FROM DUAL;
SELECT ROUND(123.456, 1) FROM DUAL;-- 소수점 첫째자리까지 출력(1번째에서 반올림된다)
SELECT ROUND(123.456, 2) FROM DUAL;
SELECT ROUND(123.456, -2) FROM DUAL;


-- FLOOR(숫자 | 숫자로된 컬럼명)
--: 내림처리 하는 함수 (인자로 전달받은 숫자 혹은 컬럼의 소수점 자리수를 버리는 함수)

SELECT FLOOR(123.456) FROM DUAL;
SELECT FLOOR(123.6789) FROM DUAL;


-- TRUNC(숫자 | 숫자로된 컬럼명 , [위치])
--: 내림처리 (절삭) 함수(인자로 전달받은 숫자 혹은 컬럼의 지정한 위치 이후의 소수점 자리수를 버리는 함수 )

SELECT TRUNC(123.456) FROM DUAL;
SELECT TRUNC(123.6789) FROM DUAL;
SELECT TRUNC(123.456, 1) FROM DUAL;
SELECT TRUNC(123.456, 2) FROM DUAL;
SELECT TRUNC(123.456, -1) FROM DUAL;

-- CEIL(숫자 | 숫자로된 컬럼명): 올림처리함수(소수점 기준으로 올림처리)
SELECT CEIL(123.456) FROM DUAL;
SELECT CEIL(123.6789) FROM DUAL;


-- 날짜 함수 : SYSDATE, MONTHS_BETWEEN, ADD_MONTH
--            , NEXT_DAY, LAST_DAY, EXTRACT


-- SYSDATE : 시스템에 저장되어있는 날짜를 반환하는함수
SELECT SYSDATE FROM DUAL;


-- MONTHS_BETWEEN(날짜, 날짜) : 두날짜의 개월수 차이를 숫자로 리턴하는 함수
SELECT 
    ENAME
    , HIREDATE
    ,CEIL(MONTHS_BETWEEN(SYSDATE, HIRE_DATE))COL1
FROM EMP;

-- ADD_MONTHS(날짜, 숫자): 날짜에 숫자만큼 개월수를 더해서 리턴

SELECT 
    ADD_MONTHS(SYSDATE,5) COL1
FROM DUAL;

SELECT 
    ADD_MONTHS(SYSDATE,-1) COL1
FROM DUAL;

--EMP 테이블에서 근무년수가 20년 이상인 직원 조회
SELECT *
FROM EMP
WHERE MONTHS_BETWEEN(SYSDATE, HIREDATE) >= 240;
-- 같은 내용
--WHERE ADD_MONTHS(HIRE_DATE, 240) <= SYSDATE;


--NEXT_DAY(기준날짜, 요일(문자|숫자)) : 기준날짜에서 구하려는 요일에 가장가까운 날짜리턴
SELECT SYSDATE, NEXT_DAY(SYSDATE,'목요일')NDAY FROM DUAL;
SELECT SYSDATE, NEXT_DAY(SYSDATE,5)NDAY FROM DUAL; -- 구하려는 요일이 숫자인경우 1 : 일요일~~~7 : 토요일
SELECT SYSDATE, NEXT_DAY(SYSDATE,'목')NDAY FROM DUAL;
SELECT SYSDATE, NEXT_DAY(SYSDATE, 'FRIDAY')NDAY FROM DUAL; -- 객체 세션이 한국어로 되어있을때 영어로 작성하면 오류 발생

-- NLS_LANGUAGE 수정 

-- NLS(NATIONAL LANGUAGE SUPPORT) : 언어지원과 관련된 파라미터
SELECT * 
FROM SYS.NLS_SESSION_PARAMETERS
WHERE PARAMETER IN('NLS_LANGUAGE','NLS_DATE_FORMAT','NLS_DATE_LANGUAGE');

ALTER SESSION SET NLS_LANGUAGE = AMERICAN; -- 객체 세션을 영어로 변경
ALTER SESSION SET NLS_LANGUAGE = KOREAN;



--LAST_DAY(날짜 ) : 해당월의 마지막 날짜를 구하여 리턴
SELECT SYSDATE, LAST_DAY(SYSDATE) LDAY FROM DUAL;

--EMP 테이블에서 사원의 이름,입사일, 입사후 6개월되는 날짜 를 조회
SELECT ENAME, HIREDATE,  ADD_MONTHS(HIREDATE ,6) COL1
FROM EMP;

--EMP 테이블에서 사원의 이름 , 입사일, 입사월의 마지막날 , 입사한 월의 근무일수 조회 
--입사일 - 오늘, 오늘-입사일 : 근무일수
SELECT ENAME
	, CEIL(ABS(HIREDATE - SYSDATE)) COL1
	, CEIL(SYSDATE-HEREDATE) COL2
FROM EMP;

--입사일 - 오늘, 오늘-입사일 : 근무일수
SELECT
    LAST_DAY(HIREDATE)
    , HIREDATE
    , LAST_DAY(HIREDATE)-HIREDATE +1 COL -- 만약에 31일에 입사해도 입사한 월의 근무일수는 1일이됨
FROM EMP;


-- EXTRACT : 년, 월,일 정보를 추출하여 리턴 하는 함수 
-- EXTRACT(YEAR FROM 날짜) : 년도만 추출
-- EXTRACT(MONTH FROM 날짜) : 월만추출
-- EXTRACT(DAY FROM 날짜) : 날짜만 추출

SELECT 
    EXTRACT(YEAR FROM SYSDATE)년도
    , EXTRACT(MONTH FROM SYSDATE)월
    , EXTRACT(DAY FROM SYSDATE) 일
FROM DUAL;

--EMP테이블에서 사원이름, 입사년,입사월, 입사일 을 조회
SELECT 
    ENAME 사원이름
    , EXTRACT(YEAR FROM HIREDATE) 입사년
    , EXTRACT(MONTH FROM HIREDATE) 입사월
    , EXTRACT(DAY FROM HIREDATE) 입사일
FROM EMP
--ORDER BY ENAME;
--ORDER BY ENAME DESC;
--ORDER BY 사원이름;
--ORDER BY 1;
ORDER BY 2,3 DESC;



--TO_CHAR(날짜, [포멧]) : 날짜형데이터를 문자형 데이터로 변환
--TO_CHAR(숫자, [포멧]) : 숫자형데이터를 문자형 데이터로 변환 

--Format		 예시			설명
--,(comma)	9,999		콤마 형식으로 변환
--.(period)	99.99		소수점 형식으로 변환
--0		09999		왼쪽에 0을 삽입
--$		$9999		$ 통화로 표시
--L		L9999		Local 통화로 표시(한국의 경우 \)
--9:자릿수를 나타내며 ,자릿수가 많지않아도 0으로채우지않는다
--0:자릿수를나타내며, 자릿수가 많지 않을 경우 0으로 채워준다.
--EEEE 과학 지수 표기법 

SELECT TO_CHAR(1234) FROM DUAL;
SELECT TO_CHAR(1234, '99999') FROM DUAL;
SELECT TO_CHAR(1234, '00000') FROM DUAL;
SELECT TO_CHAR(1234, 'L99999') FROM DUAL;
SELECT TO_CHAR(1234, '$99,999') FROM DUAL;
SELECT TO_CHAR(1234, '00,000') FROM DUAL;
SELECT TO_CHAR(1234, '9.9EEEE') FROM DUAL;
SELECT TO_CHAR(1234, '999') FROM DUAL;


--EMP 테이블에서 사원명 급여를 조회 
-- 급여를 ￦9,000,000 형식으로 표현 하시오

SELECT 
    ENAME
    , TO_CHAR(SAL, 'L99,999,999')
FROM EMP;


--날짜 데이터 포맷 적용
SELECT TO_CHAR(SYSDATE,'PM HH24:MI:SS') FROM DUAL;
SELECT TO_CHAR(SYSDATE,'AM HH:MI:SS') FROM DUAL;
SELECT TO_CHAR(SYSDATE,'MON DY,YYYY') FROM DUAL;
SELECT TO_CHAR(SYSDATE,'YYYY-fmMM-DD DAY') FROM DUAL;
SELECT TO_CHAR(TO_DATE('980630','RRMMDD'),'YYYY-fmMM-DD') FROM DUAL; -- 월앞에 0제거하고 싶을때 fm사용
SELECT TO_CHAR(SYSDATE,'YYYY-MM-DD DAY') FROM DUAL;
SELECT TO_CHAR(SYSDATE,'YEAR,Q')||'분기' FROM DUAL;

-- 상세입사일 YYYY-MM-DD + 시분초
SELECT TO_CHAR(HIREDATE,'YYYY-MM-DD HH24:MI:SS') 상세입사일
FROM EMP;


SELECT CURRENT_TIMESTAMP
FROM DUAL;

-- 오늘 날짜에 대해 년도 4자리, 년도 2자리, 
-- 년도 이름으로 출력
SELECT 
    TO_CHAR(SYSDATE, 'YYYY')
    , TO_CHAR(SYSDATE,'RRRR')
    , TO_CHAR(SYSDATE,'YY')
    , TO_CHAR(SYSDATE,'RR')
    , TO_CHAR(SYSDATE, 'YEAR')
FROM DUAL;

-- RR과 YY의 차이
-- RR은 두자리 년도를 네자리로 바꿀 때
-- 바꿀 년도가 50년 미만 2000년을 적용, 
-- 50년 이상이면 1900년 적용

-- 년도 바꿀 때(TO_DATE 사용시) Y를 적용하면
-- 현재 세기(2000년)가 적용된다.
-- R은 50년 이상이면 이전 세기(1900년),
-- 50년 미만이면 현재 세기(2000년) 적용

SELECT 
    TO_CHAR(TO_DATE('980630','YYMMDD'),'YYYY-MM-DD') COL1
FROM DUAL;    
SELECT 
    TO_CHAR(TO_DATE('980630','RRMMDD'),'RRRR-MM-DD') COL1
FROM DUAL;


-- 오늘날짜에서 월만 출력
SELECT 
       TO_CHAR(SYSDATE, 'MM')
     , TO_CHAR(SYSDATE, 'MONTH')
     , TO_CHAR(SYSDATE, 'MON')
     , TO_CHAR(SYSDATE, 'RM')--로마문자표기
  FROM DUAL;


-- 오늘날짜에서 일만 출력
SELECT 
       TO_CHAR(SYSDATE, '"1년 기준 " DDD "일 째"')
     , TO_CHAR(SYSDATE, '"달 기준 " DD "일 째"')
     , TO_CHAR(SYSDATE, '"주 기준 " D "일 째"')
  FROM DUAL;
-- 오늘 날짜에서 분기와 요일 출력 처리

SELECT 
       TO_CHAR(SYSDATE, 'Q"분기"')
     , TO_CHAR(SYSDATE, 'DAY')
     , TO_CHAR(SYSDATE, 'DY')
  FROM DUAL;
 
 --EMP 테이블에서 이름,입사일 조회 (입사일포맷 : '2018년 6월 15일 (수)'형식으로 출력처리하시오
 SELECT 
       ENAME
     , TO_CHAR(HIREDATE, 'RRRR"년" fmMM"월" DD"일" "("DY")"')
  FROM EMP;
  
 
 
--TO_DATE:숫자OR문자형 데이터를 날짜형 데이터로 변환하여 리턴
--TO_DATE(숫자OR문자,[포맷])

SELECT 
    TO_DATE('20100101','YYYYMMDD')
FROM DUAL;


SELECT 
    TO_CHAR(TO_DATE('20100101','YYYYMMDD'),'YYYY , MON')
FROM DUAL;


SELECT 
     ENAME
    , HIREDATE
    ,TO_CHAR(HIREDATE,'RRRRMMDD')
FROM EMP
--WHERE HIREDATE >= '20000101';--( 묵시적형변환)문자열은 날짜로 자동형변환된다.
--WHERE HIREDATE >= TO_DATE('20000101','YYYYMMDD');
--WHERE HIREDATE > 20000101;-- 자동형변환 안됨 (숫자는 날짜로 자동 형변환 안됨)
  WHERE HIREDATE > TO_DATE(20000101, 'YYYYMMDD');   -- 강제로 형변환 해야 함
  
  
  --TO_NUMBER(문자데이터, [포맷]) : 문자데이터를 숫자로 리턴
SELECT TO_NUMBER('123456789') COL1 FROM DUAL;
  --자동형변환
SELECT '123'+'456' FROM DUAL;
SELECT '123'+'456A' FROM DUAL;-- 숫자로 된 문자열만 자동 변환가능


-- 선택함수 
-- DECODE(계산식 | 컬럼명, 조건값1, 선택값1, 조건값2, 선택값2...,[DEFAULT])
--마지막 인자에 조건값없이 선택값을 작성하면,
--아무것도 해당되지않는 경우 마지막에 작성한 선택값(디폴트) 값이 무조건 선택된다.

 SELECT 
    ENAME,
    SUBSTR(EMP_NO, 8, 1)COL,
    DECODE(SUBSTR(EMP_NO, 8, 1), '1', '남' ,'2', '여') COL2
    DECODE(SUBSTR(EMP_NO, 8, 1), '1', '남' , '여') COL3 -- 조건값을 지정하지않고 DEFAULT를 '여'로 설정
FROM (
    SELECT '리사' ENAME , '123456-2890123' AS EMP_NO FROM DUAL -- 첫 줄 기준으로 기능이 수행됨
    UNION ALL --UNION ALL은 모든 결과를 단순히 결합
    SELECT '주혁' ENAME , '234567-1901234' AS EMP_NO FROM DUAL
    UNION ALL
    SELECT '사나' ENAME , '345678-2012345' AS EMP_NO FROM DUAL
);

-- 직원의 급여를 인상하고자 한다
-- 직급코드가 SALESMAN인 직원은 급여의 10%를 인상하고
-- 직급코드가 MANAGER인 직원은 급여의 15%를 인상하고
-- 직급코드가 ANALYST인 직원은 급여의 20%를 인상한다.
SELECT ENAME, JOB, SAL, 

DECODE('JOB','SALESMAN',SAL*1.1, 'MANAGER',SAL*1.15, 'ANALYST',SAL*1.2, SAL*1.05) AS UPSAL

FROM EMP;
-- 그 외 직급의 직원은 5%만 인상한다.
-- 직원 테이블에서 직원명, 직급코드, 급여, 인상급여(위 조건)을
-- 조회하세요



 -- CASE문
/* CASE
        WHEN 조건식 THEN 결과값
        WHEN 조건식 THEN 결과값
    ELSE 결과값
    END
*/
 
SELECT * FROM EMP;
SELECT * FROM JOB;
SELECT 
       ENAME
     , JOB
     , SAL
     , CASE 
         WHEN JOB = 'SALESMAN' THEN SAL * 1.1
         WHEN JOB = 'MANAGER' THEN SAL * 1.15
         WHEN JOB= 'ANALYST' THEN SAL * 1.2
         ELSE SAL * 1.05
       END AS 인상급여
  FROM EMP;
  
 SELECT * FROM EMP;
 
  -- 사번, 사원명, 급여를 EMP 테이블에서 조회하고 
-- 급여가 2500만원 초과이면 '고급'
-- 급여가 1500~2500만원이면 '중급'
-- 그이하는 초급으로 출력하고 별칭은 '구분' 이라고한다.
SELECT EMPNO , ENAME , SAL, 
 	CASE 
 		WHEN SAL > 2500 THEN '고급'
 		WHEN (SAL >= 1500 AND SAL <=2500) THEN '중급' -- WHEN SAL >= 1500 THEN '중급' < '고급'의 값이 남았기때문에 중급의 값만 정의
 		-- WHEN SAL BETWEEN 1500 AND 2500 THEN '중급' < BETWEEN을 사용해서 중급의 값을 정의 
		ELSE '초급'
 	END AS 구분 
 FROM EMP ;
 


-- 집계함수 --그룹함수 : SUM, AVG, MAX, MIN, COUNT
--COUNT(* |컬럼명 ): 행의 갯수를 리턴
--COUNT([DISTINCT] 컬러명):중복을 제거한 행 갯수 리턴 
--COUNT(*) :NULL 을 포함한 전체 갯수 리턴 
--COUNT(컬럼명): NULL 을 제외한 실제값이 기록된 행의 갯수 리턴

SELECT * FROM EMP; 

SELECT COUNT(*) 
FROM EMP;

SELECT COUNT(DISTINCT COMM) 
FROM EMP;

SELECT COUNT(SAL), SUM(SAL), AVG(SAL), MIN(SAL), MAX(SAL) 
FROM EMP
WHERE JOB = 'SALESMAN';

SELECT JOB, COUNT(SAL), SUM(SAL), AVG(SAL), MIN(SAL), MAX(SAL) 
FROM EMP
GROUP BY JOB;

SELECT JOB, COUNT(SAL), SUM(SAL) TOT_SAL, ROUND(AVG(SAL)), MIN(SAL), MAX(SAL) 
FROM EMP
GROUP BY JOB
HAVING COUNT(SAL) >= 4
ORDER BY TOT_SAL DESC;



SELECT * FROM "MEMBER";

DROP TABLE BBS ;

CREATE TABLE BBS (
    NO NUMBER PRIMARY KEY,
    TITLE VARCHAR2(100),
    CONTENT VARCHAR2(500),
    WRITER NUMBER REFERENCES MEMBER(ID)
);

SELECT * FROM BBS ;

-- 시퀀스(SEQUENCE)
-- 자동 번호 발생기 역할을 하는 객체
-- 순차적으로 정수값을 자동으로 생성해줌
/*
  CRAETE SEQUENCE 시퀀스이름
  [START WITH 숫자] -- 처음 발생시킬 값 지정, 생략하면 자동 1 기본
  [INCREMENT BY 숫자] -- 다음 값에 대한 증가치, 생략하면 자동 1 기본
  [MAXVALUE 숫자 | NOMAXVALUE] -- 발생시킬 최대값 지정(10의 27승)
  [MINVALUE 숫자 | NOMINVALUE] -- 최소값 지정 (-10의 26승)
  [CYCLE | NOCYCLE]  -- 값순환 여부
  [CACHE 바이트크기 | NOCACHE] -- 캐시사용여부 (기본값은 20바이트, 최소는 2바이트)
  
  /*
  1 2 3 4 5   --> 시퀀스 
  12345 678910 --> 캐쉬는 미리 생성되어있음 
  1 2 3  11 -->껏다키고 다시 시작하면 캐쉬 생성된 다음 인 11 부터 시작 
  */

 CREATE SEQUENCE SEQ_EMPID --SEQ_EMPID 시퀀스 객체 생성
  START WITH 300            -- 시작번호는 300부터
  INCREMENT BY 5            -- 5씩 증가
  MAXVALUE 310              -- 최대 310 까지
  NOCYCLE                   -- 310이후에는 증가하지않고 에러발생 알림
  NOCACHE;                  -- 캐쉬사용 안함
  
  -- NEXTVAL, CURRVAL
-- CURRVAL : 현재값을 반환 -- 현재값을 생성한후에 바로 조회하면 조회가 안되고 에러발생 
-- NEXTVAL : 현재 시퀀스 값의 다음값을 반환
  
  SELECT SEQ_EMPID.CURRVAL FROM DUAL;-- 에러
  -- CURRVAL사용시 주의점 : 생성한후에는  시퀀스의 시작값이 없으므로 NEXTVAL 을 무조건 1번 실행한후에 CURRVAL 실행
  SELECT SEQ_EMPID.NEXTVAL FROM DUAL;
  SELECT SEQ_EMPID.CURRVAL FROM DUAL;
  SELECT SEQ_EMPID.NEXTVAL FROM DUAL;
  SELECT SEQ_EMPID.NEXTVAL FROM DUAL; -- 최대값을 초과해서 에러 발생
  
  SELECT * FROM USER_SEQUENCES;
  
 
 --시퀀스 변경 
-- START WITH  는 변경불가능 - 변경하고자한다면 DROP 으로 삭제후 다시 생성해야함 
ALTER SEQUENCE SEQ_EMPID
INCREMENT BY 10          
MAXVALUE 400             
NOCYCLE                 
NOCACHE;

DROP SEQUENCE SEQ_EMPID;



CREATE SEQUENCE BBS_ID_SEQ   -- 시퀀스 객체 생성
START WITH 1            -- 시작번호는 1부터
INCREMENT BY 1          -- 1씩 증가 
MAXVALUE 100            -- 최대100까지
NOCYCLE                 -- 100이후 에러발생
NOCACHE;                -- 캐쉬사용안함

CREATE TABLE BBS7
AS
SELECT * FROM BBS WHERE 1 = 0; -- 구조복사

SELECT * FROM BBS7;

INSERT INTO BBS7
VALUES (BBS_ID_SEQ.NEXTVAL, 'HAPPY', '너무 슬퍼', 1);

DROP SEQUENCE BBS_ID_SEQ;