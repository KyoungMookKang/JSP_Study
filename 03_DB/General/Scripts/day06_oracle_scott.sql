-- New script in localhost 4.
-- Connection Type: dev 
-- Url: jdbc:oracle:thin:@//localhost:1521/XE
-- workspace : C:\workspace\multi\03_DB
-- Date: 2024. 5. 13.
-- Time: 오전 9:39:38

--@SET SPERATION(집합연산)
-- 두개이상의 테이블에서 조인을 사용하지않고 연관된 데이터를 조회하는 방법
-- 여러개의 질의 결과를 연결하여 하나로 결합하는 방식 
-- 각테이블의 조회결과를 하나의 테이블에 합쳐서 반환함 

-- 조건 : SELECT 절의 "컬럼수가 동일"해야함
--       SELECT 절의 동일 위채에 존재하는 "컬럼의 데이터 타입이 상호호환"가능해야함.

-- UNION, UNION ALL, INTERSECT, MINUS

-- UNION : 여러개의 쿼리결과를 하나로 합치는 연산자이다. 
--         중복된 영역의 제외하여 하나로 합친다.

SELECT
	EMPNO,
	ENAME,
	DEPTNO,
	SAL
FROM EMP 
WHERE DEPTNO = '10' -- 7명출력
UNION
SELECT 
	EMPNO,
	ENAME,
	DEPTNO,
	SAL
FROM EMP
WHERE SAL > 1500; -- 8명 출력 / UNION 후 13명



-- UNION ALL : 여러개의 쿼리결과를 하나로 합치는 연산자
            -- UNION 과의 차이점은 중복영역을 모두 포함시킨다.

SELECT
	EMPNO,
	ENAME,
	DEPTNO,
	SAL
FROM EMP 
WHERE DEPTNO = '10' -- 7명출력
UNION ALL 
SELECT 
	EMPNO,
	ENAME,
	DEPTNO,
	SAL
FROM EMP
WHERE SAL > 1500; -- 8명 출력 / UNION ALL 후 15명



--INTERSECT : 여러개의 SELECT 한 결과에서 공통된 부분만 결과로 추출
-- 수학에서 교집합과 비슷

SELECT
	EMPNO,
	ENAME,
	DEPTNO,
	SAL
FROM EMP 
WHERE DEPTNO = '10' -- 7명출력
INTERSECT 
SELECT 
	EMPNO,
	ENAME,
	DEPTNO,
	SAL
FROM EMP
WHERE SAL > 1500; -- 8명 출력



--MINUS : 선행 SELECT 결과에서 다음 SELECT 결과와 겹치는 부분을 제외한 나머지 부분만추출
-- 수학에서 차집합과 비슷 하다

SELECT
	EMPNO,
	ENAME,
	DEPTNO,
	SAL
FROM EMP 
WHERE DEPTNO = '10' -- 7명출력
MINUS
SELECT 
	EMPNO,
	ENAME,
	DEPTNO,
	SAL
FROM EMP
WHERE SAL > 1500; -- 8명 출력 / MINUS 적용 후 5명 출력



SELECT 
    DEPTNO
    , JOB
    , MGR
    , FLOOR(AVG(SAL))
FROM EMP
GROUP BY  DEPTNO, JOB, MGR -- 11행 출력
UNION ALL
SELECT 
    DEPTNO
    , '' JOB
    , MGR
    , FLOOR(AVG(SAL))
FROM EMP
GROUP BY  DEPTNO, MGR -- UNION ALL 이전에 10행 / UNION ALL 이후 위와 합쳐 21행 출력
UNION ALL
SELECT
	0 DEPTNO 
	, JOB 
	, MGR 
	,FLOOR (AVG(SAL))
FROM EMP
GROUP BY GROUPING SETS((DEPTNO, JOB, MGR)
                        ,(DEPTNO, MGR)
                        ,(JOB, MGR));
                       
----------------------------------------------------
                       
--집계함수 

--ROLLUP 함수 : 그룹별로 중간 집계 처리를 하는 함수 
--GROUP BY 절에서만 사용 
-- 그룹별로 묶여진 값에 중간집계와 총집계를 구할때 사용
-- 그룹별로 계산된 값에대한 총집계가 자동으로 추가된다. 
-- 인자로 전달한 그룹중에서 가장 먼저 지정한 그룹(컬럼)별 합계와 총합계
SELECT * FROM EMP;

SELECT
	JOB,
	SUM(SAL)
FROM EMP 
GROUP BY ROLLUP (JOB); -- JOB별로 급여의 합을 더함


SELECT
	DEPTNO,
	JOB,
	SUM(SAL)
FROM EMP 
GROUP BY ROLLUP(DEPTNO, JOB);


--CUBE 함수 : 그룹별 산출한 결과를 집계하는 함수이다. 
-- 모든 그룹에대한 집계와 총합계
SELECT 
    JOB
    , SUM(SAL) 
FROM  EMP
GROUP BY CUBE(JOB)
ORDER BY 1;


SELECT
    DEPTNO
    , JOB
    ,SUM(SAL)
FROM EMP
GROUP BY CUBE(DEPTNO, JOB)
ORDER BY 1;



--GROUPING  함수 : ROLLUP이나 CUBE 에 의한 산출물이 
-- 인자로 전달받은 컬럼집합의 산출물이면 0
-- 아니면 1을 반환하는 함수
SELECT
    DEPTNO
    , JOB
    ,SUM(SAL)
    ,GROUPING(DEPTNO) 부서별그룹핑상태
    ,GROUPING(JOB) 직급별그룹핑상태
FROM EMP
GROUP BY CUBE(DEPTNO, JOB)
ORDER BY 1;



SELECT 
    DEPTNO
    ,JOB
    ,SUM(SAL)
    ,CASE
        WHEN GROUPING(DEPTNO) = 0 AND GROUPING(JOB) = 1 THEN '부서별합계'
        WHEN GROUPING(DEPTNO) = 1 AND GROUPING(JOB) = 0 THEN '직급별합계'
        WHEN GROUPING(DEPTNO) = 0 AND GROUPING(JOB) = 0 THEN '그룹별합계'
        ELSE '총합계'
    END 구분
FROM EMP
GROUP BY CUBE(DEPTNO, JOB)
ORDER BY 1;




/*@ 조인문(JOIN)
-> 여러테이블의 레코드를 조합하여 하나의 열로 표현한것, 하나로 합쳐서 결과를 조회한다. 
-> 두 개 이상의 테이블에서 연관성을 가지고있는 데이터 들을 따로 분류하여 새로운 가상의 테이블을 이용하여 출력
   서로다른 테이블에서 각각 공통값을 이용함으로써 필드를 조합함
   즉, 관계형 데이터베이스에서 SQL 문을 이용한 테이블간 "관계"를 맺는 방법
   
* JOIN 시 컬럼이 같을 경우와 다를 경우 2가지 방법이있다.
- ORACLE 전용구문
- ANSI 표준구문
(ANSI( 미국 국립 표준 협회 => 산업표준을 재정하는 단체 ) 에서 지정한 DBMS 에 상관없이 공통으로 사용하는 표준 SQL)
*/


--오라클 전용구문 
-- FROM 절에 ','  로 구분하여 합치게될 테이블명을 기술하고 
-- WHERE 절에 합치기위해 사용할 컬럼명을 명시한다.


-- JOIN: 왜 하는가? 검색을 하고 싶은데 항목들이 여러개의 테이블에 흩어져있는 경우
--      테이블을 모아서(합해서) 검색
-- 2개의 테이블의 공통된 값들만 조인해서 검색


---- INNER JOIN: 테이블간 공통된 값만 추출
---- EMP테이블과 DEPT테이블을 조인하세요.
---- 하나의 컬럼이상이 동일한 컬럼이 있어야 함.
---- EMPNO, ENAME, JOB, DEPTNO, LOC 컬럼 검색
---- 조인조건: DEPTNO

SELECT * FROM EMP;
SELECT * FROM DEPT;

-- 오라클 전용 구문
SELECT A.EMPNO, A.ENAME, A.JOB, A.DEPTNO, B.LOC
FROM EMP A, DEPT B
WHERE A.DEPTNO = B.DEPTNO ;


--ANSI 표준구문
-- 연결에 사용할 컬럼명이 같은경우에 USING(컬럼명)을 사용함
SELECT EMPNO, ENAME, JOB, DEPTNO, LOC
FROM EMP
JOIN DEPT USING (DEPTNO); -- USING 사용시 별칭을 쓰지않음

--  연결에 사용할 컬럼명이 다를경우 ON(컬럼명)을 사용함
SELECT A.EMPNO, A.ENAME, A.JOB, A.DEPTNO, B.LOC
FROM EMP A
JOIN DEPT B USING (A.DEPTNO = B.DEPTNO);


--조인은 기본이 EQUAL JOIN(등가조인) 이다(=EQU JOIN)
--연결이 되는 컬럼의 값이 일치하는 행들만 조인됨(일치하는 값이 없는 경우는 조인에서 제외되어 출력)

--JOIN 기본은 INNER JOIN(=JOIN) & EQU JOIN

--OUTER JOIN : 두테이블의 지정하는 컬럼값이 일치하지 않는 행도 조인에 포함을 시킴

--1. LEFT OUTER JOIN (= LEFT JOIN) : 합치기에 사용된 두테이블중에서 왼편에 기술된 테이블의 행을 기준으로 하여 JOIN

--2. RIGHT OUTER JOIN (= RIGHT JOIN) : 합치기에 사용된 두테이블중에서 오른편에 기술된 테이블의 행을 기준으로 하여 JOIN

--3. FULL OUTER JOIN (= FULL JOIN): 합치기에 사용된 두테이블이 가진 모든행을 결과에 포함하여 JOIN
-- LEFT/RIGHT OUTER JOIN


--1. LEFT OUTER JOIN (= LEFT JOIN)
SELECT *
FROM EMP A
LEFT JOIN DEPT B ON (A.DEPTNO = B.DEPTNO);
--오라클 전용 구문
SELECT *
FROM EMP A, DEPT B
WHERE A.DEPTNO = B.DEPTNO (+);


--2. RIGHT OUTER JOIN (= RIGHT JOIN)
 -- ANSI
SELECT * 
FROM EMP A
RIGHT JOIN DEPT B ON (A.DEPTNO = B.DEPTNO);

-- 오라클 전용 구문
SELECT *
FROM EMP A, DEPT B
WHERE A.DEPTNO(+) = B.DEPTNO;


--FULL OUTER JOIN
-- ANSI표준

SELECT
    ENAME, DNAME 
FROM EMP A
FULL JOIN DEPT B ON A.DEPTNO  = B.DEPTNO;

-- 오라클 전용구문
-- 오라클 전용구문으로는 FULL OUTER JOIN 을 할수 없다 -- 에러 

SELECT
    ENAME
    , DNAME
FROM EMP A
    ,DEPT B
WHERE A.DEPTNO(+) = B.DEPTNO(+);



--CROSS JOIN : 카테이션 곱이라고도 한다. 
--             조인이 되는 테이블의 각행들이 모두 매핑된 데이터가 검색되는 방법 (곱집합)

SELECT
  *
FROM EMP A; -- 21

SELECT * FROM DEPT B;  --4

SELECT
    ENAME, DNAME 
FROM EMP A
CROSS JOIN DEPT B; --84

-- 오라클 전용구문 
SELECT 
      ENAME, DNAME 
FROM EMP, DEPT;





SELECT * FROM MEMBER;
SELECT * FROM BBS;

INSERT INTO BBS VALUES (1, 'apple', 'apple', 1);
INSERT INTO BBS VALUES (2, 'apple', 'sana', 2);
INSERT INTO BBS VALUES (3, 'apple', 'lisa', 1);
INSERT INTO BBS VALUES (4, 'apple', 'park', 2);

-- 게시글 쓴 사람의 정보를 가져오기
SELECT A.* , B.NAME, B.TEL 
FROM BBS A
LEFT JOIN MEMBER B ON A.WRITER = B.ID;

-- 모든 회원이 작성한 글의 정보 회원기준,
SELECT *
FROM MEMBER A
LEFT JOIN BBS B ON A.ID = B.WRITER 
ORDER BY 1 , B.NO DESC ;

-- 글을 기준으로 쓴 사람의 정보를 알고자 할 때,
SELECT *
FROM MEMBER A
RIGHT JOIN BBS B ON A,ID = B.WRITER 
ORDER BY 1 ,B.NO DESC;



CREATE TABLE COMPANY (
	ID VARCHAR2(200) PRIMARY KEY,
	NAME VARCHAR2(200),
	ADDR VARCHAR2(200),
	TEL VARCHAR2(200)
);

INSERT INTO COMPANY VALUES ('c100', 'GOOD', 'SEOUL', '011');

INSERT INTO COMPANY VALUES ('c200', 'JOA', 'BUSAN', '012');

INSERT INTO COMPANY VALUES ('c300', 'MARIA', 'ULSAN', '013');

INSERT INTO COMPANY VALUES ('c400', 'MY', 'KWANGJU', '014');

SELECT * FROM COMPANY;
SELECT * FROM PRODUCT;


-- 모든 상품의 제품이름, 제품가격, 모든 회사 정보 출력
SELECT *
FROM PRODUCT A
LEFT JOIN COMPANY B ON A.COMPANY = B.ID
ORDER BY 1;


UPDATE PRODUCT SET content = 'soldout' WHERE id =109;

-- 품절 인 제품의 제품이름, 제품가격, 모든 회사 정보 출력
SELECT *
FROM PRODUCT A
LEFT JOIN COMPANY B ON A.COMPANY =B.ID
WHERE CONTENT = 'soldout'
ORDER BY 1;

-- 각 회사의 제품 정보 품절상품 제외
SELECT A. NAME, A.PRICE ,B.NAME 
FROM PRODUCT A
RIGHT JOIN COMPANY B ON A.COMPANY  =B.ID  
WHERE A.CONTENT NOT IN ('soldout');



--NON EQUAL JOIN(NON EQU JOIN)
--: 지정한 컬럼의 값이 일치하는 경우가 아닌 , 값의 범위에 포함하는 행들을 연결 하는 방식 
--ANSI 표준
SELECT 
    A.ENAME
    , A.SAL
    , B.GRADE  SAL_LEVEL
FROM EMP A
    JOIN SALGRADE B ON A.SAL BETWEEN B.LOSAL AND B.HISAL;
    
 -- 오라클 전용구문
SELECT 
    A.ENAME
    , A.SAL
    , B.GRADE  SAL_LEVEL
FROM EMP A
    , SALGRADE B
WHERE A.SAL BETWEEN B.LOSAL AND B.HISAL;



-- SELF JOIN : 같은 테이블을 조인하는 경우 자기 자신과 조인을 맺는것
-- 동일한 테이블내에서 원하는 정보를 한번에 가져올수 없을 때 사용 
SELECT 
*
FROM EMP A;
SELECT 
    A.EMPNO
    , A.ENAME 사원이름
    , A.DEPTNO
    , A.MGR
    , B.ENAME 관리자이름
FROM EMP A
    , EMP B
WHERE A.MGR = B.EMPNO;


-- 다중조인 : N 개의 테이블을 조회할때 사용 
-- ANSI표준
-- 순서중요 
SELECT
     A.EMPNO
    , A.ENAME   
    , E.DNAME 
    , C.GRADE  SAL_LEVEL
    , A.MGR		MGR_CODE
    , B.ENAME MGR_NAME
    , D.GRADE MGR_SAL_LEVEL
    , F.DNAME MGR_DEPT
FROM EMP A
JOIN EMP B ON A.MGR = B.EMPNO
LEFT JOIN SALGRADE C ON A.SAL BETWEEN C.LOSAL AND C.HISAL
LEFT JOIN SALGRADE D ON B.SAL BETWEEN D.LOSAL AND D.HISAL
LEFT JOIN DEPT E ON A.DEPTNO = E.DEPTNO
LEFT JOIN DEPT F ON B.DEPTNO = F.DEPTNO;

