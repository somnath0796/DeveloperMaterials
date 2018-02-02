-- MySQL dump 10.13  Distrib 5.7.11, for Win64 (x86_64)
--
-- Host: localhost    Database: demo
-- ------------------------------------------------------
-- Server version	5.7.11-log

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
-- Table structure for table `mydept`
--

DROP TABLE IF EXISTS `mydept`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mydept` (
  `DNO` int(11) NOT NULL,
  `DNAME` varchar(15) DEFAULT NULL,
  `MANAGER` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`DNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mydept`
--

LOCK TABLES `mydept` WRITE;
/*!40000 ALTER TABLE `mydept` DISABLE KEYS */;
INSERT INTO `mydept` VALUES (10,'Accounts','Rahul'),(20,'IT','Manish'),(30,'HR','Ankur');
/*!40000 ALTER TABLE `mydept` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `myemp`
--

DROP TABLE IF EXISTS `myemp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `myemp` (
  `EMPNO` int(11) NOT NULL,
  `NAME` varchar(15) DEFAULT NULL,
  `SALARY` double DEFAULT NULL,
  `ADDRESS` varchar(15) DEFAULT NULL,
  `DNO` int(11) DEFAULT NULL,
  PRIMARY KEY (`EMPNO`),
  KEY `FK_12many` (`DNO`),
  CONSTRAINT `FK_12many` FOREIGN KEY (`DNO`) REFERENCES `mydept` (`DNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `myemp`
--

LOCK TABLES `myemp` WRITE;
/*!40000 ALTER TABLE `myemp` DISABLE KEYS */;
INSERT INTO `myemp` VALUES (100,'Shantanu',30000,'Hyd',10),(101,'Rajiv',30000,'Hyd',10),(102,'Shankar',30000,'Blore',20),(103,'Madhu',30000,'Hyd',20),(104,'Kannan',30000,'Dhanbad',20),(105,'Vimal',30000,'Hyd',10),(106,'Rupa',30000,'Bhopal',30),(107,'Pavan',30000,'Hyd',30),(108,'Kalyan',30000,'Chennai',30),(109,'Bhavesh',30000,'Hyd',20),(110,'Arun',30000,'Hyd',20),(111,'Kanti',30000,'Hyd',10),(112,'Suraj',30000,'Hyd',10),(114,'Sadvana',300080,'Delhi',20),(115,'SadhuSANT',200010,'Haridwar',30);
/*!40000 ALTER TABLE `myemp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES ('chandra','wfc'),('saikir','hello'),('soms','sam'),('survi','san');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-02-02 16:23:29
