CREATE DATABASE  IF NOT EXISTS `students_information` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `students_information`;
-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: students_information
-- ------------------------------------------------------
-- Server version	8.0.30

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
-- Table structure for table `students_profiles`
--

DROP TABLE IF EXISTS `students_profiles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `students_profiles` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `surname` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `pass` varchar(45) DEFAULT NULL,
  `module_1` varchar(45) DEFAULT NULL,
  `mark_1` varchar(45) DEFAULT NULL,
  `module_2` varchar(45) DEFAULT NULL,
  `mark_2` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students_profiles`
--

LOCK TABLES `students_profiles` WRITE;
/*!40000 ALTER TABLE `students_profiles` DISABLE KEYS */;
INSERT INTO `students_profiles` VALUES (1,'Angila','Byer','Female','angilaB@gmail.com','0987654321','1AB@lrmcollege','Lrm910','C#','30','C++','82'),(2,'Dagny','Olson','Male','dagnyO@gmail.com','0876543219','2DO@lrmcollege','Lrm810','JAVA','90','PHP','55'),(3,'Drew','Bellson','Male','drewB@gmail.com','0765432198','3DB@lrmcollege','Lrm710','JAVASCRIPT','','PHP',''),(4,'Thando','Pele','Female','thandoP@gmail.com','0852147963','4TP@lrmcollege','Lrm530','PYTHON','60','HTML','85'),(5,'Corinna','Joines','Female','corinnaJ@gmail.com','0543219876','5CJ@lrmcollege','Lrm120','PYTHON','83','HTML','40'),(6,'Bob','Smith','Male','bobS@gmail.com','0547896321','6BS@lrmcollege','Lrm201','JAVASCRIPT','75','C++','55'),(7,'Debbie ','A Gomez','Female','debbieA@gmail.com','0963258147','7DA@lrm@college','Lrm800','C#','84','CSS','63'),(8,'Lauran','Banda','Female','lauranB@gmail.com','0668884411','8LA@lrmcollege','Lrm643','JAVA','80','HTML','90'),(9,'Rhulani','Mashaba','Male','rhulaniM@gmail.com','0874596321','RM@lrmcollege','Lrm3210','JAVA','50','HTML','75');
/*!40000 ALTER TABLE `students_profiles` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-14 18:57:34
