-- 1. Book 테이블 생성
/*
일련번호  : sequence  : int       
ISBN      : isbn      : String
제목      : title     : String  
저자      : author    : String  
출판사    : company   : String   
페이지 수 : totalPage : int       
가격      : price     : int     
재고수량  : quantity  : int       
*/
-- BOOK TABLE 생성 구문
DROP TABLE BOOK;
CREATE TABLE BOOK 
(  SEQUENCE NUMBER       
 , ISBN     VARCHAR2(13) 
 , TITLE    VARCHAR2(100) NOT NULL
 , AUTHOR   VARCHAR2(30) 
 , COMPANY  VARCHAR2(30)
 , TOTAL_PAGE NUMBER
 , PRICE    NUMBER(7)
 , QUANTITY NUMBER(4)
 , REG_DATE DATE        DEFAULT sysdate 
 , MOD_DATE DATE                        
 , CONSTRAINT PK_BOOK PRIMARY KEY (SEQUENCE)
 , CONSTRAINT UQ_BOOK_ISBN UNIQUE (ISBN)
);


-- 1건 조회
-- SEQUENCE 컬럼으로 걸어서 1번 책의 전체 컬럼 조회



-- 전체 컬럼 조회



-- INSERT 구문 
-- 전체 컬럼에 값 추가하는 구문으로 작성
/*
1, "9788936433598", "채식주의자" , "한강", "창비", 247, 10800, 10
일련번호  : sequence  : int       
ISBN      : isbn      : String
제목      : title     : String  
저자      : author    : String  
출판사    : company   : String   
페이지 수 : totalPage : int       
가격      : price     : int     
재고수량  : quantity  : int   
*/


-- UPDATE 구문
/*
1번 일련번호 책에 대해서 다음의 값으로 수정
1, "9788936433598", "채식주의자", "한강", "창비", 247, 10000, 7
*/


-- DELETE 구문
-- SEQUENCE 컬럼으로 걸어서 1번 책 정보 삭제

