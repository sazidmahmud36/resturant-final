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
-- Table structure for table `table_info`
--

DROP TABLE IF EXISTS `table_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `table_info` (
  `tableId` int NOT NULL AUTO_INCREMENT,
  `tableNumber` int DEFAULT NULL,
  `tableSit` int DEFAULT NULL,
  `tablePosition` varchar(45) DEFAULT NULL,
  `tableService` varchar(45) DEFAULT NULL,
  `fph` int DEFAULT NULL,
  `status` varchar(45) DEFAULT 'available',
  PRIMARY KEY (`tableId`),
  UNIQUE KEY `tableNumber_UNIQUE` (`tableNumber`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `table_info`
--

LOCK TABLES `table_info` WRITE;
/*!40000 ALTER TABLE `table_info` DISABLE KEYS */;
INSERT INTO `table_info` VALUES (1,101,2,'Front',NULL,100,'Booked'),(2,102,2,'Front',NULL,100,'available'),(3,103,3,'Front Right',NULL,120,'available'),(4,104,4,'Front Left',NULL,150,'available'),(5,105,4,'Middle Left',NULL,150,'available'),(6,106,4,'Middle Right',NULL,150,'available'),(7,107,4,'Middle Left Corner',NULL,150,'available'),(8,108,3,'middle',NULL,80,'Booked'),(9,109,2,'Back',NULL,50,'available');
/*!40000 ALTER TABLE `table_info` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-09 15:30:49
