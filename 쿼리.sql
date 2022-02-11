
#DML(CRUD)

#Create (Insert Into)
INSERT INTO 
	#테이블 명
	user_mst(
	user_code, 
	username,
	PASSWORD,
	create_date,
	update_date)
VALUES(	
	0,
	'yeon', 
	'1234',
 	NOW(),
 	NOW()
 	
); 

#################################################
INSERT INTO 
	#테이블 명
	user_mst
VALUES(	
	0,
	'yeon2', 
	'1234',
	null,
	null,
 	NOW(),
 	NOW()
); 

###################################################
#Read(select) 
SELECT 
	# 컬럼명들 
	user_code,
	username,
	PASSWORD,
	NAME,
	email,
	create_date,
	update_date
FROM # 데이터를 찾고자하는 테이블
	user_mst
#WHERE #조건	
#	user_code = 1 
#OR PASSWORD = '1234'
#	NAME = '박세연' 
#AND	username = 'seyeon3'
ORDER BY 
	user_code DESC ##역순정렬  
		
;		

#######################################################
SELECT 
	count(user_code) 
FROM 
	USER_mst	
; 

#######################################################	
/*
테이블 생성 
product_mst 
product_code -> pk, auto_increment 
product_name 
category_code 1, 2  
create_date 
update_date 

insert into 
product_code -> 0 
product_name -> 파랑 텀블러 
category_code -> 1 
date -> 현재시간 

product_code -> 0 
product_name -> 빨강 텀블러 
category_code -> 1 
date -> 현재시간 

product_code -> 0 
product_name -> 손잡이가 없는 머그컵 
category_code -> 2
date -> 현재시간 

product_code -> 0 
product_name -> 손잡이가 있는  머그컵 
category_code -> 2
date -> 현재시간  

조회 select 
텀블러인것만 출력 
머그컵인것만 출력 

*/
INSERT INTO 
	product_mst	
VALUES(
	0, 
	'파랑텀블러', 
	1,
	NOW(), 
	NOW()
), 
(
	0, 
	'빨강텀블러', 
	1, 
	NOW(), 
	NOW()
), 
(
	0, 
	'손잡이가 없는 머그컵', 
	2, 
	NOW(), 
	NOW()
), 
(
	0, 
	'손잡이가 있는 머그컵', 
	2, 
	NOW(), 
	NOW()
);
#######################################################
SELECT 
	* 
FROM 
	product_mst	
WHERE 
	category_code = 1; 	
	
SELECT 
	* 
FROM 
	product_mst	user_mst
WHERE 
	category_code = 2; 
	
#join: 테이블을 합치는 기능 
SELECT
	*
FROM
	user_mst;
	
SELECT
	* 
FROM 
	user_dtl;	
	
SELECT
	um.user_code AS usercode,
	um.username,
	um.password,
	um.name,
	um.email,
	ud.addr,
	ud.phone,
	pnm.na_code,
	nam.na_name
	
FROM
	user_mst AS um
	LEFT outer JOIN user_dtl AS ud ON(ud.user_code = um.user_code)
	LEFT OUTER JOIN phone_number_mst pnm ON(pnm.phone = ud.phone)
	LEFT OUTER JOIN news_agency_mst nam ON(nam.na_code = pnm.na_code)
WHERE 
	pnm.na_code = 2; 
	um.user_code = 7; 	

INSERT INTO 
	news_agency_mst 
VALUES(
	0,
	'SK Telecom'
),
(
	0,
	'KT'
),
(
	0,
	'LG U+'
); 	

#update( 수정) 
UPDATE 
	user_dtl 
SET 
	phone = '010-1234-5678',
	addr = '부산 동래구' 
WHERE 
	user_code = (SELECT user_code FROM user_mst WHERE username = 'seyeon3'); 		

#Delete(삭제)
DELETE 
FROM 
	product_mst 
WHERE 
	product_code = 3; 
	
DELETE 
FROM 
	user_mst 
WHERE 
	user_code = (SELECT user_code FROM user_mst WHERE username = 'seyeon4');	
			
				
	
		 