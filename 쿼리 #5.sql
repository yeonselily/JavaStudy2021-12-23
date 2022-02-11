SELECT 
	COUNT(um.username) + COUNT(um2.PASSWORD) AS login_flag 
FROM 
	user_mst um 
	LEFT OUTER JOIN user_mst um2 ON(um2.user_code = um.user_code AND um2.password = '03') 
WHERE 
	um.username = 'seyeon';		
	


SELECT
	um2.password
FROM 
	user_mst um2 
WHERE 
	um2.user_code =1 
AND um2.password = '1234'; 

SELECT 
	um.user_code,
	um.username,
	um.password,
	um.name,
	um.email,
	ud.phone,
	ud.addr
FROM 
	user_mst um
	LEFT OUTER JOIN user_dtl ud ON(ud.user_code = um.user_code)
WHERE
	um.username = ?						