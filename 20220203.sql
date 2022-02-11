-- --------------------------------------------------------
-- 호스트:                          127.0.0.1
-- 서버 버전:                        10.6.5-MariaDB - mariadb.org binary distribution
-- 서버 OS:                        Win64
-- HeidiSQL 버전:                  11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- company 데이터베이스 구조 내보내기
CREATE DATABASE IF NOT EXISTS `company` /*!40100 DEFAULT CHARACTER SET utf8mb3 */;
USE `company`;

-- 테이블 company.news_agency_mst 구조 내보내기
CREATE TABLE IF NOT EXISTS `news_agency_mst` (
  `na_code` int(11) NOT NULL AUTO_INCREMENT,
  `na_name` varchar(50) NOT NULL,
  PRIMARY KEY (`na_code`),
  UNIQUE KEY `na_name` (`na_name`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb3;

-- 테이블 데이터 company.news_agency_mst:~3 rows (대략적) 내보내기
DELETE FROM `news_agency_mst`;
/*!40000 ALTER TABLE `news_agency_mst` DISABLE KEYS */;
INSERT INTO `news_agency_mst` (`na_code`, `na_name`) VALUES
	(2, 'KT'),
	(3, 'LG U+'),
	(1, 'SK Telecom');
/*!40000 ALTER TABLE `news_agency_mst` ENABLE KEYS */;

-- 테이블 company.phone_number_mst 구조 내보내기
CREATE TABLE IF NOT EXISTS `phone_number_mst` (
  `phone` varchar(50) NOT NULL,
  `na_code` int(11) NOT NULL COMMENT '1 = ''SK Teloecom''\r\n2 = ''KT''\r\n3 = ''LG U+''',
  PRIMARY KEY (`phone`),
  UNIQUE KEY `na_code` (`na_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- 테이블 데이터 company.phone_number_mst:~1 rows (대략적) 내보내기
DELETE FROM `phone_number_mst`;
/*!40000 ALTER TABLE `phone_number_mst` DISABLE KEYS */;
INSERT INTO `phone_number_mst` (`phone`, `na_code`) VALUES
	('010-7547-4596', 2);
/*!40000 ALTER TABLE `phone_number_mst` ENABLE KEYS */;

-- 테이블 company.product_mst 구조 내보내기
CREATE TABLE IF NOT EXISTS `product_mst` (
  `product_code` int(11) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(50) NOT NULL DEFAULT '0',
  `category_code` int(11) NOT NULL DEFAULT 0,
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`product_code`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;

-- 테이블 데이터 company.product_mst:~3 rows (대략적) 내보내기
DELETE FROM `product_mst`;
/*!40000 ALTER TABLE `product_mst` DISABLE KEYS */;
INSERT INTO `product_mst` (`product_code`, `product_name`, `category_code`, `create_date`, `update_date`) VALUES
	(1, '파랑텀블러', 1, '2022-01-25 21:35:11', '2022-01-25 21:35:11'),
	(2, '빨강텀블러', 1, '2022-01-25 21:35:11', '2022-01-25 21:35:11'),
	(4, '손잡이가 있는 머그컵', 2, '2022-01-25 21:35:11', '2022-01-25 21:35:11');
/*!40000 ALTER TABLE `product_mst` ENABLE KEYS */;

-- 테이블 company.user_dtl 구조 내보내기
CREATE TABLE IF NOT EXISTS `user_dtl` (
  `user_code` int(11) NOT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `addr` varchar(100) DEFAULT NULL,
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`user_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- 테이블 데이터 company.user_dtl:~1 rows (대략적) 내보내기
DELETE FROM `user_dtl`;
/*!40000 ALTER TABLE `user_dtl` DISABLE KEYS */;
INSERT INTO `user_dtl` (`user_code`, `phone`, `addr`, `create_date`, `update_date`) VALUES
	(7, '010-1234-5678', '부산 동래구', '2022-01-25 21:46:16', '2022-01-25 21:46:16');
/*!40000 ALTER TABLE `user_dtl` ENABLE KEYS */;

-- 테이블 company.user_mst 구조 내보내기
CREATE TABLE IF NOT EXISTS `user_mst` (
  `user_code` int(11) NOT NULL AUTO_INCREMENT COMMENT '사용자 인덱스',
  `username` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL,
  `name` varchar(20) NOT NULL,
  `email` varchar(30) NOT NULL,
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`user_code`) USING BTREE,
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb3 COMMENT='사용자 마스터 정보를 포함 \r\n상세정보는 user_dtl 테이블을 조인하여야함. \r\n';

-- 테이블 데이터 company.user_mst:~6 rows (대략적) 내보내기
DELETE FROM `user_mst`;
/*!40000 ALTER TABLE `user_mst` DISABLE KEYS */;
INSERT INTO `user_mst` (`user_code`, `username`, `password`, `name`, `email`, `create_date`, `update_date`) VALUES
	(1, 'seyeon', '03', '박세연', '@gmail', '2022-01-25 20:11:57', '2022-01-25 20:11:58'),
	(2, 'seyeon2', '03', '박세연', '@gmail', '2022-01-25 20:11:57', '2022-01-25 20:11:58'),
	(3, 'gg', '1233', '박세연이', '@naver', '2022-01-25 20:26:30', '2022-01-25 20:26:31'),
	(4, 'yeon', '1234', '박세연', '@naver.com', '2022-01-25 20:33:22', '2022-01-25 20:33:22'),
	(5, 'yeon2', '1234', '박세연', '@naver.com', '2022-01-25 20:35:27', '2022-01-25 20:35:27'),
	(7, 'seyeon3', '03', '박세연', '@gmail', '2022-01-25 20:11:57', '2022-01-25 20:11:58');
/*!40000 ALTER TABLE `user_mst` ENABLE KEYS */;

-- 트리거 company.user_dtl_before_delete 구조 내보내기
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `user_dtl_before_delete` BEFORE DELETE ON `user_dtl` FOR EACH ROW BEGIN
	DELETE 
	FROM 
		phone_number_mst 
	WHERE 
		phone = OLD.phone; 	

END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

-- 트리거 company.user_mst_after_insert 구조 내보내기
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `user_mst_after_insert` AFTER INSERT ON `user_mst` FOR EACH ROW BEGIN
	INSERT into  
		user_dtl(
			user_code,
			create_date,
			update_date
		)
	VALUES(
		NEW.user_code, 
		NOW(), 
		NOW()
	); 			 
			
END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

-- 트리거 company.user_mst_before_delete 구조 내보내기
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `user_mst_before_delete` BEFORE DELETE ON `user_mst` FOR EACH ROW BEGIN
	DELETE 
	FROM 
		user_dtl 
	WHERE 
		user_code = OLD.user_code;  	

END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
