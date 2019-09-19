-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: localhost    Database: back
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `member` (
  `member_id` varchar(255) NOT NULL COMMENT '회원아이디',
  `member_password` varchar(255) NOT NULL COMMENT '비밀번호',
  `member_email` varchar(255) NOT NULL COMMENT '이메일',
  `member_nickname` varchar(255) NOT NULL COMMENT '닉네임',
  `member_join_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '가입일',
  `member_img` varchar(255) DEFAULT NULL COMMENT '프로필이미지',
  `member_isActive` tinyint(1) NOT NULL DEFAULT '1' COMMENT '회원상태 (True=활성화, False=비활성화)',
  `career` varchar(255) DEFAULT NULL COMMENT '경력',
  `certi` varchar(255) DEFAULT NULL COMMENT '자격증',
  `introduce` mediumtext COMMENT '자기소개',
  PRIMARY KEY (`member_id`),
  UNIQUE KEY `member_email` (`member_email`),
  UNIQUE KEY `member_nickname` (`member_nickname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES ('kimseula20','1234','kimseula20@pap.com','queen','2019-09-04 21:44:30',NULL,1,NULL,NULL,NULL),('pap','1234','pap@pap.com','pap','2019-09-04 21:44:30',NULL,1,NULL,NULL,NULL),('provider01','1234','provider01@pap.com','별다방','2019-09-04 21:44:44','../img/profile1.jpg',1,'커피전문점 2년','바리스타 자격증 1급','커피전문점 2년이랑 바리스타 자격증 1급을 가진 강사입니다.'),('provider02','1234','provider02@pap.com','비트캠프','2019-09-04 21:44:44','../img/profile2.jpg',1,'비트캡프 6개월과정 수료','정보처리기사','비트캠프 수료후 강사를 하고 있어요'),('provider03','1234','provider03@pap.com','돼지발','2019-09-04 21:44:44','../img/profile3.jpg',1,'미슐랭 0.5성급 식당에서 청소를 10년 동안 해왔습니다.','한식자격증','먹는게 세상에서 제일 좋아요'),('provider04','1234','provider04@pap.com','수온체크','2019-09-04 21:44:44','../img/profile4.jpg',1,'아 졸려 자고 싶다','자격증 없음....','졸려졸려졸려졸려졸려졸려조려조렬려조려졸ㄹ려졸려졸졀조렬'),('provider05','1234','provider05@pap.com','뱃가죽이등member가죽','2019-09-04 21:44:44','../img/profile5.jpg',1,'동네 헬스장 카운터 3년 6개월 근무','운동 치료사 2급 (유효기간 만료)','10kg 감량 성공 경험 있습니다. 그런데 병원에서 앞으로 10kg 더 빼라고 하네요...'),('provider06','1234','provider06@pap.com','KT','2019-09-04 21:44:44','../img/profile6.jpg',1,'서점 주인 20년','스킨스쿠버 마스터링','서울 혜화동에서 서점을 운영하다가 제주도로 이사왔습니다.'),('provider07','12345678','provider07@pap.com','zzangjae1','2019-09-04 21:44:44','스크린샷 2019-08-25 오후 2.10.46.png',1,'호주 시드니 맥쿼리 대학교  Master of Translation and Interpreting 석사','TOIEC 신발 사이즈','안녕하세요 \r\n영어통번역사이자 영어강사 Julia입니다 ^^ \r\n저는 12년 전 호주워킹홀리데이를 다녀온 뒤 한국에서는 영어통번역학을 전공한 뒤 국내에서 통번역사 및 영어회화 강사로 활동하고 있습니다.\r\n호주 워킹에 필요한 회화 수업이 필요하시다면 제가 도움 드릴 수 있을 것 같습니다~^-^'),('provider08','1234','provider08@pap.com','유령08','2019-09-04 21:44:44','../img/profile8.jpg',0,'죽은지 8년','장례지도사8급','탈퇴한지 8년되었어요'),('provider09','1234','provider09@pap.com','유령09','2019-09-04 21:44:44','../img/profile9.jpg',0,'죽은지 9년','장례지도사9급','탈퇴한지 9년되었어요'),('provider10','1234','provider10@pap.com','유령10','2019-09-04 21:44:44','../img/profile10.jpg',0,'죽은지 10년','장례지도사10급','탈퇴한지 10년되었어요'),('provider111','12345678','j1j1@gmail.com','j1jang','2019-09-05 04:15:35',NULL,1,NULL,NULL,NULL),('quotia72','1234','quotia72@pap.com','wolf','2019-09-04 21:44:30',NULL,1,'wolf learder','HSK6','ni hao'),('user01','1234','user01@pap.com','pap01','2019-09-04 21:44:44','../img/user01.jpg',1,NULL,NULL,NULL),('user02','1234','user02@pap.com','pap02','2019-09-04 21:44:44','../img/user02.jpg',1,NULL,NULL,NULL),('user03','1234','user03@pap.com','pap03','2019-09-04 21:44:44','../img/user03.jpg',1,NULL,NULL,NULL),('user04','1234','user04@pap.com','pap04','2019-09-04 21:44:44','../img/user04.jpg',1,NULL,NULL,NULL),('user05','1234','user05@pap.com','pap05','2019-09-04 21:44:44','../img/user05.jpg',1,NULL,NULL,NULL),('user06','1234','user06@pap.com','pap06','2019-09-04 21:44:44','../img/user06.jpg',1,NULL,NULL,NULL),('user07','1234','user07@pap.com','pap07','2019-09-04 21:44:44','../img/user07.jpg',1,NULL,NULL,NULL),('user08','1234','user08@pap.com','pap08','2019-09-04 21:44:44','../img/user08.jpg',0,'나도 고객인데 탈퇴한지 8년','자격증 없음','회원 8이에요'),('user09','1234','user09@pap.com','pap09','2019-09-04 21:44:44','../img/user09.jpg',0,'나도 고객인데 탈퇴한지 9년','자격증 없음','회원 9에요'),('user10','1234','user10@pap.com','pap10','2019-09-04 21:44:44','../img/user10.jpg',0,'나도 고객인데 탈퇴한지 10년','자격증 없음','회원 10이에요'),('user11','1234','user11@pap.com','pap11','2019-09-04 21:44:44','../img/user11.jpg',1,NULL,NULL,NULL),('user12','1234','user12@pap.com','pap12','2019-09-04 21:44:44','../img/user12.jpg',1,NULL,NULL,NULL),('user13','1234','user13@pap.com','pap13','2019-09-04 21:44:44','../img/user13.jpg',1,NULL,NULL,NULL),('user14','1234','user14@pap.com','pap14','2019-09-04 21:44:44','../img/user14.jpg',1,NULL,NULL,NULL),('user15','1234','user15@pap.com','pap15','2019-09-04 21:44:44','../img/user15.jpg',1,NULL,NULL,NULL);
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-09-05  6:36:40
