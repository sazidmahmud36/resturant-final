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
-- Table structure for table `booking`
--

DROP TABLE IF EXISTS `booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `booking` (
  `bookingId` int NOT NULL AUTO_INCREMENT,
  `tableNo` int DEFAULT NULL,
  `customerId` int DEFAULT NULL,
  `bookingTime` varchar(45) DEFAULT NULL,
  `bookingStatus` varchar(45) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `orderId` int DEFAULT NULL,
  PRIMARY KEY (`bookingId`)
) ENGINE=InnoDB AUTO_INCREMENT=73 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booking`
--

LOCK TABLES `booking` WRITE;
/*!40000 ALTER TABLE `booking` DISABLE KEYS */;
INSERT INTO `booking` VALUES (1,101,0,'breakfast','booked','2024-05-22',0),(2,101,2,'breakfast','booked','2024-05-30',0),(3,102,3,'lunch','booked','2024-05-30',0),(4,101,4,'breakfast','booked','2024-05-30',0),(5,101,0,'breakfast','booked','2024-05-30',0),(6,102,0,'lunch','booked','2024-05-30',0),(7,103,0,'breakfast','booked','2024-05-30',0),(8,101,0,'breakfast','booked','2024-05-30',0),(9,101,0,'breakfast','booked','2024-05-30',0),(10,101,0,'breakfast','booked','2024-05-30',0),(11,101,0,'breakfast','booked','2024-05-30',0),(12,101,0,'breakfast','booked','2024-05-30',0),(13,101,0,'breakfast','booked','2024-05-30',0),(14,101,0,'breakfast','booked','2024-05-30',0),(15,101,0,'breakfast','booked','2024-05-30',0),(16,101,0,'breakfast','booked','2024-05-30',0),(17,101,0,'breakfast','booked','2024-05-30',0),(18,103,0,'breakfast','check out','2024-05-31',0),(19,103,0,'breakfast','check out','2024-05-31',0),(20,103,0,'breakfast','booked','2024-05-31',0),(21,103,0,'breakfast','booked','2024-05-31',0),(22,103,0,'breakfast','booked','2024-05-31',0),(23,103,0,'breakfast','booked','2024-05-31',0),(24,103,0,'breakfast','booked','2024-05-31',0),(25,103,0,'breakfast','booked','2024-05-31',0),(26,103,2,'breakfast','check out','2024-05-31',0),(27,103,2,'breakfast','booked','2024-05-31',0),(28,103,2,'breakfast','booked','2024-05-31',0),(29,103,11,'breakfast','check out','2024-05-31',0),(30,109,4,'breakfast','booked','2024-05-30',0),(31,102,2,'breakfast','booked','2024-05-30',0),(32,102,2,'breakfast','booked','2024-05-30',0),(33,101,2,'breakfast','booked','2024-05-30',0),(34,101,2,'breakfast','booked','2024-05-30',0),(35,101,2,'breakfast','booked','2024-05-30',0),(36,101,12,'Select Time','booked',NULL,0),(37,104,13,'lunch','check out','2024-05-31',0),(38,103,2,'breakfast','check out','2024-06-06',0),(39,109,2,'breakfast','booked','2024-06-06',0),(40,105,14,'breakfast','check out','2024-06-01',0),(41,106,15,'breakfast','booked','2024-06-02',0),(42,107,16,'lunch','booked','2024-06-02',0),(43,108,2,'lunch','check out','2024-06-02',0),(44,108,17,'breakfast','check out','2024-06-01',0),(45,105,2,'lunch','check out','2024-05-30',0),(46,102,14,'lunch','check out','2024-06-01',0),(47,101,12,'lunch','check out','2024-06-01',0),(48,101,18,'breakfast','check out','2024-06-01',0),(49,102,19,'lunch','check out','2024-06-01',0),(50,103,20,'breakfast','check out','2024-06-01',0),(51,104,2,'breakfast','check out','2024-06-01',0),(52,105,21,'breakfast','check out','2024-06-01',0),(53,106,22,'lunch','check out','2024-06-04',0),(54,101,23,'dinner','booked','2024-06-06',0),(55,102,24,'breakfast','check out','2024-06-01',0),(56,109,24,'breakfast','booked','2024-06-04',0),(57,108,25,'dinner','check out','2024-06-02',0),(58,109,26,'lunch','check out','2024-06-04',0),(59,102,2,'lunch','booked','2024-06-04',0),(60,108,27,'breakfast','booked','2024-06-05',0),(61,107,28,'breakfast','booked',NULL,0),(62,107,28,'breakfast','check out','2024-06-03',0),(63,101,2,'lunch','booked','2024-06-05',0),(64,106,3,'breakfast','booked','2024-06-05',0),(65,105,2,'Select Time','booked',NULL,0),(66,104,3,'breakfast','check out','2024-06-06',0),(67,103,0,'breakfast','booked','2024-06-06',0),(68,109,2,'lunch','check out','2024-06-05',0),(69,109,2,'breakfast','booked','2024-06-07',0),(70,108,30,'lunch','check out','2024-06-07',0),(71,101,31,'lunch','booked','2024-06-05',0),(72,101,32,'lunch','check out','2024-06-06',0);
/*!40000 ALTER TABLE `booking` ENABLE KEYS */;
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
