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
-- Table structure for table `service_address`
--

DROP TABLE IF EXISTS `service_address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `service_address` (
  `address_id` int(36) NOT NULL AUTO_INCREMENT COMMENT '주소ID',
  `address_state` varchar(255) NOT NULL COMMENT '시/도',
  `address_city` varchar(255) NOT NULL COMMENT '시군구',
  `address_dong` varchar(255) NOT NULL COMMENT '동/리',
  `address_detail` varchar(255) DEFAULT NULL COMMENT '자세한주소',
  PRIMARY KEY (`address_id`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service_address`
--

LOCK TABLES `service_address` WRITE;
/*!40000 ALTER TABLE `service_address` DISABLE KEYS */;
INSERT INTO `service_address` VALUES (1,'경기도 고양시','일산동구','장항동',NULL),(2,'서울시','마포구','백범로',NULL),(3,'서울시','마포구','공덕동',NULL),(4,'서울시','서대문구','상암동',NULL),(5,'충청남도','보령시','대천동',NULL),(6,'제주도 제주시','조천읍','신촌리',NULL),(7,'인천시','중구','선린동',NULL),(8,'제주특별자치도','서귀포시','서호동','1476-4 '),(9,'제주특별자치도','제주시','용담삼동','999-13 '),(10,'전라남도','순천시','장천동','18-22 '),(11,'전라남도','여수시','덕충동','61-7 '),(12,'제주특별자치도','서귀포시','남원읍','태흥리 '),(13,'제주특별자치도','서귀포시','안덕면','창천리 '),(14,'서울특별시','용산구','이태원동','119-23 '),(27,'서울특별시','마포구','상암동','알파문고'),(28,'서울특별시','마포구','공덕동','1-40 바퀴박멸사무소'),(29,'제주특별자치도','제주시','일도이동','321-19 외딴섬 어딘가...'),(30,'인천광역시','남동구','구월동','3-4 2층 건담카페'),(31,'강원도','강릉시','홍제동','14-7 뒷산 어딘가...'),(32,'경기도','김포시','사우동','7-2 김치싸다구김치찌개 2층'),(33,'서울특별시','서대문구','창천동','2-14 텍사스 타코집'),(34,'서울특별시','서대문구','연희동','1-116 미술학원 1층'),(35,'서울특별시','서대문구','남가좌동','293-20 여왕님의 안식처 1층'),(36,'경기도','고양시','일산동구','사리현동 어르신모임장소 2층'),(37,'서울특별시','마포구','공덕동','1-15 롯데캐슬 지하 헬스장'),(38,'서울특별시','서대문구','영천동','252 세스코'),(39,'경기도','김포시','장기동','2039-8 현대아파트 1차 2985239847동 1987239847호'),(40,'서울특별시','강남구','대치동','27-15 강이 잘보이는 한강공원 어디가에서...'),(41,'서울특별시','서대문구','창천동','30-18 1층 302호'),(42,'서울특별시','마포구','신수동','63-14 B1 홍원'),(43,'경상남도','창원시','성산구','성산동 모두투어 1층'),(44,'서울특별시','영등포구','당산동','1 2번출구 뒤쪽'),(45,'경기도','고양시','덕양구','화정동 민지네집'),(46,'서울특별시','마포구','신수동','22-2 서강대 정문'),(47,'경기도','김포시','장기동','1868-2 404동'),(48,'서울특별시','강남구','대치동','27-1 집에 가고싶다 1층'),(49,'서울특별시','마포구','공덕동','1-7 민형이네 집'),(50,'서울특별시','서대문구','창천동','18-54 은진이네 집'),(51,'경상남도','창원시','성산구','성산동 인력사무소'),(52,'경기도','수원시','팔달구','장안동 알파고 본진');
/*!40000 ALTER TABLE `service_address` ENABLE KEYS */;
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
