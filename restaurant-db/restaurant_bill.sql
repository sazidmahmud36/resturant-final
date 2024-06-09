-- MySQL dump 10.13  Distrib 8.0.30, for macos12 (x86_64)
--
-- Host: localhost    Database: restaurant
-- ------------------------------------------------------
-- Server version	8.3.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bill`
--

DROP TABLE IF EXISTS `bill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bill` (
  `billId` int NOT NULL AUTO_INCREMENT,
  `customerId` int DEFAULT NULL,
  `date` date DEFAULT NULL,
  `totalBill` int DEFAULT NULL,
  `paid` int DEFAULT NULL,
  `due` int DEFAULT NULL,
  `billStatus` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`billId`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill`
--

LOCK TABLES `bill` WRITE;
/*!40000 ALTER TABLE `bill` DISABLE KEYS */;
INSERT INTO `bill` VALUES (1,0,'2024-05-30',100,0,0,'due'),(2,0,'2024-05-30',120,0,0,'due'),(3,0,'2024-05-30',100,0,0,'due'),(4,0,'2024-05-30',100,0,0,'due'),(5,0,'2024-05-30',100,0,0,'due'),(6,0,'2024-05-30',100,0,0,'due'),(7,0,'2024-05-30',100,0,0,'due'),(8,0,'2024-05-30',100,0,0,'due'),(9,0,'2024-05-30',100,0,0,'due'),(10,0,'2024-05-30',100,0,0,'due'),(11,0,'2024-05-30',100,0,0,'due'),(12,0,'2024-05-30',100,0,0,'due'),(13,0,'2024-05-31',120,0,0,'due'),(14,0,'2024-05-31',120,0,0,'due'),(15,0,'2024-05-31',120,0,0,'due'),(16,0,'2024-05-31',120,0,0,'due'),(17,0,'2024-05-31',120,0,0,'due'),(18,0,'2024-05-31',120,0,0,'due'),(19,0,'2024-05-31',120,0,0,'due'),(20,0,'2024-05-31',120,120,0,'paid'),(21,2,'2024-05-31',120,0,0,'due'),(22,2,'2024-05-31',120,0,0,'due'),(23,2,'2024-05-31',960,960,0,'paid'),(24,11,'2024-05-31',120,120,0,'paid'),(25,4,'2024-05-30',80,0,0,'due'),(26,2,'2024-05-30',100,0,0,'due'),(27,0,NULL,0,0,0,NULL),(28,2,'2024-05-30',100,0,0,'due'),(29,2,'2024-05-30',100,0,0,'due'),(30,2,'2024-05-30',100,0,0,'due'),(31,2,'2024-05-30',2460,0,2460,'due'),(32,12,NULL,100,0,0,'due'),(33,13,'2024-05-31',890,890,0,'paid'),(34,2,'2024-06-06',120,0,0,'due'),(35,2,'2024-06-06',0,0,0,'paid'),(36,14,'2024-06-01',1290,1290,0,'paid'),(37,15,'2024-06-02',540,0,540,'due'),(38,16,'2024-06-02',150,150,0,'paid'),(39,2,'2024-06-02',1050,1050,0,'paid'),(40,17,'2024-06-01',1290,1290,0,'paid'),(41,2,'2024-05-30',820,820,0,'paid'),(42,14,'2024-06-01',770,770,0,'paid'),(43,12,'2024-06-01',880,880,0,'paid'),(44,18,'2024-06-01',1000,1000,0,'paid'),(45,19,'2024-06-01',5390,5390,0,'paid'),(46,20,'2024-06-01',490,490,0,'paid'),(47,2,'2024-06-01',1870,1870,0,'paid'),(48,21,'2024-06-01',5080,5080,0,'paid'),(49,22,'2024-06-04',32320,32320,0,'paid'),(50,23,'2024-06-06',100,0,0,'due'),(51,24,'2024-06-01',500,500,0,'paid'),(52,24,'2024-06-04',80,0,0,'due'),(53,25,'2024-06-02',450,450,0,'paid'),(54,26,'2024-06-04',2200,0,2200,'paid'),(55,2,'2024-06-04',100,0,0,'due'),(56,27,'2024-06-05',1920,0,1920,'due'),(57,28,NULL,150,0,0,'due'),(58,28,'2024-06-03',630,630,0,'paid'),(59,2,'2024-06-05',100,0,0,'due'),(60,3,'2024-06-05',150,0,0,'due'),(61,2,NULL,150,0,0,'due'),(62,3,'2024-06-06',930,930,0,'paid'),(63,0,'2024-06-06',120,0,0,'due'),(64,2,'2024-06-05',470,470,0,'paid'),(65,2,'2024-06-07',50,0,0,'due'),(66,30,'2024-06-07',660,660,0,'paid'),(67,31,'2024-06-05',400,0,400,'due'),(68,32,'2024-06-06',1000,1000,0,'paid');
/*!40000 ALTER TABLE `bill` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-09 15:30:47
