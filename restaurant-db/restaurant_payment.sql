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
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `payment` (
  `paymentId` int NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `billId` int DEFAULT NULL,
  `customerId` int DEFAULT NULL,
  `amount` int DEFAULT NULL,
  `paymentType` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`paymentId`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment`
--

LOCK TABLES `payment` WRITE;
/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
INSERT INTO `payment` VALUES (1,'2024-06-01',36,14,1290,'cash payment'),(2,'2024-06-02',39,2,1050,'cash payment'),(3,NULL,0,0,0,'cash payment'),(4,NULL,0,0,0,'cash payment'),(5,'2024-06-02',38,16,150,'cash payment'),(6,'2024-06-01',36,14,1290,'cash payment'),(7,NULL,0,0,0,'cash payment'),(8,NULL,0,0,0,'cash payment'),(9,NULL,0,0,0,'cash payment'),(10,NULL,0,0,0,'cash payment'),(11,NULL,0,0,0,'cash payment'),(12,NULL,0,0,0,'cash payment'),(13,NULL,0,0,0,'cash payment'),(14,'2024-06-01',40,17,1290,'cash payment'),(15,'2024-05-31',23,2,960,'cash payment'),(16,'2024-05-30',41,2,820,'cash payment'),(17,'2024-05-31',33,13,890,'cash payment'),(18,'2024-05-31',24,11,120,'cash payment'),(19,'2024-05-31',20,0,120,'cash payment'),(20,'2024-06-01',42,14,770,'cash payment'),(21,'2024-05-31',20,0,120,'cash payment'),(22,'2024-06-01',43,12,880,'cash payment'),(23,'2024-06-01',44,18,1000,'cash payment'),(24,'2024-06-01',45,19,5390,'cash payment'),(25,'2024-06-01',46,20,490,'cash payment'),(26,'2024-06-01',47,2,1870,'cash payment'),(27,'2024-06-01',48,21,5080,'cash payment'),(28,'2024-06-06',35,2,0,'cash payment'),(29,'2024-06-01',51,24,500,'cash payment'),(30,'2024-06-04',49,22,32320,'cash payment'),(31,'2024-06-02',53,25,450,'cash payment'),(32,'2024-06-04',54,26,1780,'cash payment'),(33,'2024-06-03',58,28,630,'cash payment'),(34,'2024-06-06',62,3,930,'cash payment'),(35,'2024-06-05',64,2,470,'cash payment'),(36,'2024-06-07',66,30,660,'cash payment'),(37,'2024-06-06',68,32,1000,'cash payment');
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-09 15:30:48
