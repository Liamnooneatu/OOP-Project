CREATE DATABASE  IF NOT EXISTS `gamepass` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `gamepass`;
-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: gamepass
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `address` (
  `Address_ID` int NOT NULL AUTO_INCREMENT,
  `Customer_ID` int NOT NULL,
  `Region` varchar(30) DEFAULT NULL,
  `Country` varchar(30) DEFAULT NULL,
  `City` varchar(30) DEFAULT NULL,
  `Address_line_1` varchar(50) DEFAULT NULL,
  `Address_line_2` varchar(50) DEFAULT NULL,
  `Postal_code` varchar(15) DEFAULT NULL,
  `Last_Update` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`Address_ID`),
  KEY `Customer_ID` (`Customer_ID`),
  CONSTRAINT `address_ibfk_1` FOREIGN KEY (`Customer_ID`) REFERENCES `customer` (`Customer_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (1,1,'EUROPE','IRELAND','GALWAY','THISROAD','41','H55 5555','2024-04-22 13:43:20'),(2,2,'EUROPE','IRELAND','DUBLIN','THATROAD','33','H55 5555','2024-04-22 13:47:38'),(3,3,'EUROPE','IRELAND','MAYO','ANYROAD','23','H55 5555','2024-04-22 13:47:38'),(4,4,'EUROPE','SPAIN','MADRID','ANYROAD','44','H55 5555','2024-04-22 13:47:38'),(5,5,'UK','ENGLAND','LONDON','THISROAD','15','H55 5555','2024-04-22 13:47:38'),(6,6,'NORTH AMERICA','USA','MIAMI','EVERYROAD','45','H55 5555','2024-04-22 13:47:38');
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `Customer_ID` int NOT NULL AUTO_INCREMENT,
  `First_Name` varchar(20) NOT NULL,
  `last_name` varchar(30) NOT NULL,
  `age` int NOT NULL,
  `email` varchar(40) NOT NULL,
  `Username` varchar(40) NOT NULL,
  `Phone` varchar(20) NOT NULL,
  `Gender` varchar(20) NOT NULL,
  `Date_of_birth` varchar(30) NOT NULL,
  PRIMARY KEY (`Customer_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'Nathan','McCormack',20,'nthn@noemail.com','nathan20','083 555 5555','MALE','01/01/2003'),(2,'Eoin','Fitz',20,'eoin@noemail.com','eoin20','083 555 5555','MALE','01/01/2003'),(3,'Naoise','O Loughlin',54,'naoise@noemail.com','naoise20','083 555 5555','MALE','01/01/1966'),(4,'Liam','Noone',20,'liam@noemail.com','liam20','083 555 5555','MALE','01/01/2003'),(5,'Cathal','Hardy',108,'cathal@noemail.com','cathal40','083 555 5555','MALE','01/01/1916'),(6,'Rosie','Walsh',21,'rosie@noemail.com','rosie21','083 555 5555','FEMALE','01/01/2002');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `game`
--

DROP TABLE IF EXISTS `game`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `game` (
  `GAME_ID` int NOT NULL AUTO_INCREMENT,
  `Title` varchar(30) NOT NULL,
  `Description` varchar(50) NOT NULL,
  `Cost` int NOT NULL,
  `size_GB` int NOT NULL,
  `Release_Date` varchar(20) NOT NULL,
  `Rating` varchar(10) NOT NULL,
  `Original_Language` varchar(20) NOT NULL,
  `Platform` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`GAME_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `game`
--

LOCK TABLES `game` WRITE;
/*!40000 ALTER TABLE `game` DISABLE KEYS */;
INSERT INTO `game` VALUES (1,'FIFA 22','FOOTBALL GAME',60,124,'19/09/2022','6/10','ENGLISH','XBOX'),(2,'NBA 2K19','BASKETBALL GAME',70,82,'05/10/2018','8/10','ENGLISH','PLAYSTATION'),(3,'GRAN TURISMO 4','RACING GAME',50,55,'28/12/2004','7/10','ENGLISH','PLAYSTATION'),(4,'METAL GEAR SOLID V','ACTION GAME',70,64,'01/09/2015','6/10','ENGLISH','PLAYSTATION'),(5,'MARVELS SPIDER MAN','ACTION GAME',70,81,'07/09/2018','8/10','ENGLISH','PLAYSTATION'),(6,'MINECRAFT','ADVENTURE GAME',40,30,'18/11/2011','10/10','ENGLISH','PC'),(7,'DIABLO III','ADVENTURE GAME',60,90,'15/05/2012','9/10','ENGLISH','PC'),(8,'THE WITCHER III','ACTION GAME',70,110,'19/05/2015','8/10','ENGLISH','PC'),(9,'SKYRIM','ADVENTURE GAME',70,60,'11/11/2011','8/10','ENGLISH','PC'),(10,'HALO 3','ACTION GAME',60,54,'25/09/2007','9/10','ENGLISH','XBOX'),(11,'RED DEAD REDEMPTION 2','ADVENTURE GAME',80,120,'26/10/2018','9/10','ENGLISH','XBOX'),(12,'FORZA HORIZON','RACING GAME',70,90,'17/09/2012','8/10','ENGLISH','XBOX'),(13,'GEARS OF WAR','SHOOTING GAME',60,40,'17/09/2006','7/10','ENGLISH','XBOX'),(14,'COD: BLACK OPS 2','SHOOTING GAME',60,60,'17/09/2012','7/10','ENGLISH','PLAYSTATION'),(15,'WORLD OF WARCRAFT','ADVENTURE GAME',70,80,'12/11/2006','6/10','ENGLISH','PC'),(16,'NEED FOR SPEED RIVALS','RACING GAME',60,70,'11/10/2014','8/10','ENGLISH','XBOX'),(17,'CRASH BANDICOOT','ADVENTURE GAME',30,7,'18/05/1998','8/10','ENGLISH','PLAYSTATION'),(18,'RAINBOW SIX SIEGE','SHOOTING GAME',70,64,'08/10/2015','7/10','ENGLISH','PC'),(19,'MORTAL KOMBAT X','FIGHTING GAME',60,70,'19/10/2018','5/10','ENGLISH','XBOX'),(20,'STREET FIGHTER IV','FIGHTING GAME',60,58,'22/09/2008','7/10','ENGLISH','PLAYSTATION'),(21,'TEKKEN TAG-TOURNAMENT','FIGHTING GAME',40,16,'22/09/2006','8/10','ENGLISH','PLAYSTATION');
/*!40000 ALTER TABLE `game` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `payment` (
  `Payment_ID` int NOT NULL AUTO_INCREMENT,
  `Staff_ID` int NOT NULL,
  `Customer_ID` int NOT NULL,
  `Subscription_ID` int NOT NULL,
  `Payment_amount` float NOT NULL,
  `Payment_date` varchar(15) NOT NULL,
  `Payment_type` varchar(30) NOT NULL,
  PRIMARY KEY (`Payment_ID`),
  KEY `Staff_ID` (`Staff_ID`),
  KEY `Customer_ID` (`Customer_ID`),
  KEY `Subscription_ID` (`Subscription_ID`),
  CONSTRAINT `payment_ibfk_1` FOREIGN KEY (`Staff_ID`) REFERENCES `staff` (`Staff_ID`),
  CONSTRAINT `payment_ibfk_2` FOREIGN KEY (`Customer_ID`) REFERENCES `customer` (`Customer_ID`),
  CONSTRAINT `payment_ibfk_3` FOREIGN KEY (`Subscription_ID`) REFERENCES `subscription` (`Subscription_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment`
--

LOCK TABLES `payment` WRITE;
/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
INSERT INTO `payment` VALUES (1,1,1,1,12.99,'12/12/2023','VISA'),(2,1,2,2,12.99,'21/01/2023','MASTERCARD'),(3,1,3,3,24.99,'13/02/2023','PAYPAL'),(4,1,4,4,59.99,'19/02/2023','PAYPAL'),(5,1,5,5,59.99,'19/02/2023','MASTERCARD'),(6,1,6,6,59.99,'19/02/2023','VISA');
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff`
--

DROP TABLE IF EXISTS `staff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `staff` (
  `Staff_ID` int NOT NULL AUTO_INCREMENT,
  `Store_ID` int NOT NULL,
  `First_Name` varchar(20) NOT NULL,
  `Last_Name` varchar(35) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Contract_length` varchar(15) NOT NULL,
  `Contract_expiry_date` varchar(15) NOT NULL,
  `Salary` int NOT NULL,
  PRIMARY KEY (`Staff_ID`),
  KEY `Store_ID` (`Store_ID`),
  CONSTRAINT `staff_ibfk_1` FOREIGN KEY (`Store_ID`) REFERENCES `store` (`Store_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff`
--

LOCK TABLES `staff` WRITE;
/*!40000 ALTER TABLE `staff` DISABLE KEYS */;
INSERT INTO `staff` VALUES (1,1,'TOM','SCOTT','tom@noemail.com','3 YEARS','2026',35000),(2,1,'KATY','THOMAS','katy@noemail.com','2 YEARS','2024',33000),(3,1,'KYLE','JAXON','kyle@noemail.com','4 YEARS','2026',38000),(4,2,'JEN','WIGHAM','jen@noemail.com','1 YEAR','2025',40000),(5,3,'BOB','FRANCIS','bob@noemail.com','3 YEARS','2027',36000),(6,4,'DOUG','ALLEN','doug@noemail.com','3 YEARS','2027',36000);
/*!40000 ALTER TABLE `staff` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `store`
--

DROP TABLE IF EXISTS `store`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `store` (
  `Store_ID` int NOT NULL AUTO_INCREMENT,
  `Store_location` varchar(50) NOT NULL,
  `Number_of_staff` int NOT NULL,
  `Store_Phone` varchar(20) NOT NULL,
  `Store_email` varchar(40) NOT NULL,
  `Store_website` varchar(50) NOT NULL,
  PRIMARY KEY (`Store_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `store`
--

LOCK TABLES `store` WRITE;
/*!40000 ALTER TABLE `store` DISABLE KEYS */;
INSERT INTO `store` VALUES (1,'IRELAND',3,'083 555 5555','thisstore@noemail.com','thisstore.com'),(2,'ENGLAND',1,'083 555 5555','thatstore@noemail.com','thatstore.com'),(3,'MIAMI',1,'083 555 5555','everystore@noemail.com','everystore.com'),(4,'SPAIN',1,'083 555 5555','anystore@noemail.com','anystore.com');
/*!40000 ALTER TABLE `store` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subscription`
--

DROP TABLE IF EXISTS `subscription`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subscription` (
  `Subscription_ID` int NOT NULL AUTO_INCREMENT,
  `Customer_ID` int NOT NULL,
  `Subscription_cost` float NOT NULL,
  `Subscription_length` varchar(20) DEFAULT NULL,
  `Start_date` varchar(20) DEFAULT NULL,
  `Expiry_date` varchar(20) DEFAULT NULL,
  `Last_Update` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`Subscription_ID`),
  KEY `Customer_ID` (`Customer_ID`),
  CONSTRAINT `subscription_ibfk_1` FOREIGN KEY (`Customer_ID`) REFERENCES `customer` (`Customer_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subscription`
--

LOCK TABLES `subscription` WRITE;
/*!40000 ALTER TABLE `subscription` DISABLE KEYS */;
INSERT INTO `subscription` VALUES (1,1,12.99,'1 MONTH','12/12/2023','12/01/2024','2024-04-22 14:07:28'),(2,2,12.99,'1 MONTH','21/01/2023','21/02/2024','2024-04-22 14:07:28'),(3,3,24.99,'2 MONTHS','13/02/2023','13/04/2023','2024-04-22 14:07:28'),(4,4,59.99,'6 MONTHS','19/02/2023','13/08/2023','2024-04-22 14:07:28'),(5,5,59.99,'6 MONTHS','19/02/2023','13/08/2023','2024-04-22 14:07:28'),(6,6,59.99,'6 MONTHS','19/02/2023','13/08/2023','2024-04-22 14:07:28');
/*!40000 ALTER TABLE `subscription` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-22 15:35:18
