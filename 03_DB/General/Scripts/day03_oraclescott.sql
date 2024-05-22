-- New script in localhost.
-- Connection Type: dev 
-- Url: jdbc:oracle:thin:@//localhost:1521/XE
-- workspace : C:\workspace\multi\03_DB
-- Date: 2024. 5. 8.
-- Time: 오전 10:03:28


-- DML 기본 연습
SELECT * FROM EMP;

-- DISTINCT : 중복제거, SELECT 절에서 딱 한번만 사용가능
SELECT DISTINCT DEPTNO FROM EMP;

SELECT DISTINCT DEPTNO, JOB FROM EMP;
SELECT DISTINCT COMM, JOB FROM EMP;

SELECT ENAME, SAL * 12 AS YEARSAL , SAL * 12 - (SAL * 0.03 * 12) AS REALSAL 
FROM EMP;

SELECT *
FROM EMP
ORDER BY SAL DESC;

-- 부서가 30, 사번으로 내림차순
SELECT * FROM EMP 
WHERE DEPTNO = 30
ORDER BY EMPNO DESC;

SELECT * FROM EMP 
WHERE DEPTNO = 30 AND JOB = 'SALESMAN';

/*@ 비교 연산자
-> 표현식 사이의 관계를 비교하기 위해 사용하고, 비교 결과는 논리 결과중에 하나
(TRUE/FALSE/NULL)가 됨
-> 단, 비교하는 두 컬럼 값/표현식은 서로 동일한 데이터 타입이어야 함

	연산자			설명
	=			같다
	>,<			크다/작다
	>=,=<			크거나 같다/작거나 같다
	<>,!=,^=		같지 않다
	BETWEEN AND		특정 범위에 포함되는지 비교
	LIKE / NOT LIKE		문자 패턴 비교
	IS NULL / IS NOT NULL	NULL 여부 비교
	IN / NOT IN		비교 값 목록에 포함/미포함 되는지 여부 비교
	
	* <> 작거나 크다 즉, 같지 않다!*/

SELECT * FROM EMP
WHERE SAL >= 1000
ORDER BY ENAME;

SELECT * FROM EMP
WHERE SAL != 3000
ORDER BY ENAME;

SELECT *
FROM EMP
WHERE JOB = 'SALESMAN' OR JOB = 'MANAGER';

-- 위 내용과 같은 내용
SELECT *
FROM EMP
WHERE JOB IN ('SALESMAN', 'MANAGER');

-- SALESMAN, MANGER 를 제외한 나머지 출력시
SELECT *
FROM EMP
WHERE JOB NOT IN ('SALESMAN', 'MANAGER');


-- BETWEEN AND사용
-- 컬럼명 BETWEEN 하한값 AND 상한값  
-- 하한값 이상 상한값 이하의 값
-- 비교하려는 값이 지정한 범위 (상한값 하한값 의 경계를 포함)

SELECT * FROM EMP
WHERE SAL BETWEEN 2000 AND 3000;

SELECT * FROM EMP
WHERE SAL NOT BETWEEN 2000 AND 3000;



--LIKE 연산자: 문자 패턴이 일치하는 값을 조회 할때 사용 
--컬럼명 LIKE '문자패턴'
--문자패턴  : '글자%'(글자로 시작하는 값)
--           '%글자%'(글자가 포함된 값)
--           '%글자'(글자로 끝나는 값)


/*'%' 와 '_' 와일드 카드 로 사용할수있다 
와일드 카드 : 아무거나 대체해서 사용할수 있는 것 
_: 한문자
%:모든것
*/

-- 이름에 L을 포함하고 있는 사람
SELECT *
FROM EMP 
WHERE ENAME LIKE '%L%';

--이름이 L로 시작하는 사람
SELECT *
FROM EMP 
WHERE ENAME LIKE 'L%';

--이름이 L로 끝나는 사람
SELECT *
FROM EMP 
WHERE ENAME LIKE '%L';


SELECT *
FROM EMP 
WHERE ENAME LIKE '_L%';



--ESCAPE 
--LIKE '%[문자][실제문자로인식시킬문자]%' ESCAPE '[문자]

Insert into SCOTT.EMP
   (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO)
 Values
   (7001, 'SMIT_SU', 'CLERK', 7902, 
    TO_DATE('12/17/1980 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 800, 20);
Insert into SCOTT.EMP
   (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
 Values
   (7002, 'ALLE_SU', 'SALESMAN', 7698, 
    TO_DATE('02/20/1981 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 1600, 300, 30);
Insert into SCOTT.EMP
   (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
 Values
   (7003, 'WAR_SU', 'SALESMAN', 7698, 
    TO_DATE('02/22/1981 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 1250, 500, 30);
    
   COMMIT;
   
SELECT * FROM EMP
WHERE ENAME LIKE '___@_%' ESCAPE '@';
 

SELECT * FROM EMP 
WHERE COMM IS NOT NULL;


INSERT INTO SCOTT.EMP
(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES(100, '1', '1', 0, '2022-01-01', 0, 0, 10);

INSERT INTO SCOTT.EMP
(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES(300, '1', '1', 0, TO_DATE('2022/01/01', 'YYYY/MM/DD'), 0, 0, 10);

INSERT INTO SCOTT.EMP
(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES(400, '1', '1', 0, TO_DATE(SYSDATE), 0, 0, 10); --2024-02-13 00:00:00.000

INSERT INTO SCOTT.EMP
(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES(500, '1', '1', 0, SYSDATE, 0, 0, 10);-- 2024-02-13 14:21:38.000

COMMIT;


SELECT * FROM EMP ORDER BY HIREDATE DESC;


-- 함수
SELECT * FROM EMPLOYEES ;
   
-- 1. 직원의 이름과 이메일, 이메일 길이를 출력하시오
--		  직원명	    이메일		이메일길이
--	ex) 	홍길동 , hong  	  13
SELECT LENGTH(FIRST_NAME , EMAIL) FROM EMPLOYEES;

-- 2. 2001 AND 2005년에 고용된  직원명과 입사년도, 보너스 값을 출력하시오 
--	그때 보너스 값이 null인 경우에는 0 이라고 출력 되게 만드시오
SELECT FIRST_NAME, 
	SUBSTR(TO_CAHR(HIRE_DATE, 'YYYY'), 2001 AND 2005) 
	FROM EMPLOYEES 
UPDATE EMPLOYEES 
SET COMM = 0
WHERE COMM IS NULL;

-- 3. '515' 핸드폰 번호를 사용하지 않는 사람의 수를 출력하시오(뒤에 단위는 명을 붙이시오)



-- 4. 직원명과 입사년월을 2003년 6월 형태로 출력하시오
--	단, 아래와 같이 출력되도록 만들어 보시오
--	    EMP_NAME		HIRE_YY
--	ex) 리사		       1997년 3월


--5 . 부서코드가 50,90인 직원들 중에서 2004년도에 입사한 직원 조회
-- 120(EMPNO)	Matthew Weiss(ENAME)	50(DEPTID)	2004-07-18(HIRE_DATE)  형식으로 출력 





--6 . 직원명, 입사일, 오늘까지의 근무일수 조회 * 주말도 포함 , 소수점 아래는 버림
SELECT FIRST_NAME, HIRE_DATE
	TO_CHAR(HIREDATE,'YYYY-MM-DD') - TO_DATE(SYSDATE. 'YYYY-MM-DD')
FROM DUAL;



-- 7. 직원들의 입사일로부터 년도만 가지고 각 년도별 입사 인원수를 구하시오
--  아래의 년도에 입사한 인원수를 조회하시오. 마지막으로 전체직원수도 구하시오

--  => to_char, decode, sum 사용
--
--	-------------------------------------------------------------------------
--	 2001년   2002년   2003년   2004년   2005년   2006년   2007년 2008년 전체직원수
--	-------------------------------------------------------------------------




--8. 부서코드가 50이면 총무부, 60이면 기획부, 90이면 영업부로 처리하시오
--   단, 부서코드가 50, 60, 90 인 직원의 정보만 조회함
--  => case 사용
--   부서코드 기준 오름차순 정렬함.

SELECT DEPARTMENT_ID,
	CASE
		WHEN DEPARTMENT_ID = 50 THEN '총무부'
		WHEN DEPARTMENT_ID = 60 THEN '기획부'
		WHEN DEPARTMENT_ID = 90 THEN '영업부'
		END AS 부서
FROM EMPLOYEES
ORDER BY EMPLOYEE_ID DESC;
	