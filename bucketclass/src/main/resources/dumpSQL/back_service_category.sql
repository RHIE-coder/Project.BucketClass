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
-- Table structure for table `service_category`
--

DROP TABLE IF EXISTS `service_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `service_category` (
  `category_id` int(36) NOT NULL AUTO_INCREMENT COMMENT '카테고리번호',
  `category_subject` varchar(255) NOT NULL COMMENT '분야 (요리, 예술, 외국어, 헬스/웰빙, 비즈니스, 일상생활)',
  `category_type` varchar(255) NOT NULL COMMENT '타입 (체험, 교육)',
  `category_period` varchar(255) NOT NULL COMMENT '기간 (정기, 비정기)',
  `category_scale` varchar(255) NOT NULL COMMENT '규모 (단체, 개인)',
  `category_place` varchar(255) NOT NULL COMMENT '장소 (실내, 실외)',
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service_category`
--

LOCK TABLES `service_category` WRITE;
/*!40000 ALTER TABLE `service_category` DISABLE KEYS */;
INSERT INTO `service_category` VALUES (1,'요리','교육','비정기','단체','실내'),(2,'비즈니스','교육','정기','단체','실내'),(3,'예술','체험','비정기','개인','실내'),(4,'일상생활','체험','비정기','단체','실외'),(5,'헬스케어','체험','비정기','개인','실외'),(6,'예술','체험','비정기','단체','실외'),(7,'외국어','교육','정기','개인','실내'),(8,'비즈니스','교육','정기','단체','실내'),(9,'일상생활','체험','비정기','개인','실내'),(10,'비즈니스','교육','정기','단체','실내'),(11,'일상생활','체험','비정기','단체','실외'),(12,'일상생활','체험','비정기','단체','실내'),(13,'일상생활','체험','비정기','단체','실외'),(14,'일상생활','체험','정기','단체','실외'),(15,'요리','체험','비정기','단체','실외'),(16,'비즈니스','교육','비정기','단체','실내'),(17,'일상생활','체험','정기','단체','실내'),(18,'외국어','체험','비정기','단체','실외'),(19,'일상생활','체험','비정기','단체','실내'),(20,'요리','체험','비정기','단체','실외'),(21,'카테고리 선택','','','',''),(22,'예술','체험','비정기','개인','실내'),(23,'요리','교육','비정기','단체','실내'),(24,'일상생활','체험','비정기','단체','실외'),(25,'일상생활','교육','비정기','단체','실내'),(26,'일상생활','교육','비정기','단체','실외'),(27,'헬스/웰빙','체험','비정기','단체','실외'),(28,'요리','','','',''),(29,'외국어','교육','정기','단체','실내'),(30,'일상생활','교육','정기','단체','실외'),(31,'일상생활','','','',''),(32,'요리','교육','비정기','단체','실내'),(33,'헬스/웰빙','교육','정기','개인','실내'),(34,'일상생활','체험','비정기','개인','실내'),(35,'일상생활','체험','비정기','개인','실내'),(36,'헬스/웰빙','교육','정기','단체','실외'),(37,'요리','교육','정기','단체','실내'),(38,'요리','','','',''),(39,'외국어','교육','정기','단체','실내'),(40,'외국어','교육','정기','개인','실내'),(41,'외국어','교육','정기','단체','실내'),(42,'헬스/웰빙','교육','정기','단체','실외'),(43,'헬스/웰빙','교육','정기','개인','실내'),(44,'비즈니스','교육','정기','개인','실내'),(45,'비즈니스','교육','정기','개인','실내'),(46,'비즈니스','교육','정기','개인','실내'),(47,'일상생활','교육','정기','개인','실내'),(48,'일상생활','교육','정기','개인','실내');
/*!40000 ALTER TABLE `service_category` ENABLE KEYS */;
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
