-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: javaflix
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `cpf` varchar(30) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `senha` varchar(50) NOT NULL,
  PRIMARY KEY (`cpf`),
  UNIQUE KEY `nome` (`nome`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES ('02144477785','Maria Joaquina Pereira','456'),('0591703603','Felipe da Silva Cruz','247'),('1034897437','Ana Luiza dos Santos','284'),('1039401735','Wesley Binho de Oliveira','676'),('1058295836','Natalia Freitas do Carmo','185'),('1058395728','Gabriel Martins de Souza','286'),('1059385638','Franciney Jose Geraldo','210'),('12345678910','Paulo Henrique Pereira','123'),('1960475913','Jose Pereira Ribeiro','048'),('2037250374','Luis Cardoso de Freitas','938'),('2049582106','Roberto Duarte Moraes','184'),('2098334292','Bruno Caetano Pereira','499'),('2547893654','Fernanda Silva Rodrigues','789'),('2940583716','Paloma Pimentel de Melo','108'),('2948572052','Thais Gonçalves Torres','082'),('3059160385','Jaqueline coelho dos Santos','981'),('3098143545','Amanda da Rosa','590'),('3240834948','Luiz Eduardo Fortes','927'),('3593730482','Humberto Henrique Diaz','216'),('38592058391','Silvio Antonio Gonçalves','751'),('3948409323','Juliana Camargo Rodrigues ','193'),('4031720498','Luciana Gonçalnves de Souza','092'),('4910684739','Adriano Fernades Teixeiras','134'),('4928694837','Madalena Assis de Souza','900'),('5048396043','Davi Gomes de Castro','105'),('58436215058','Luiza Oliveira Cardoso','254'),('6723098120','Diego Augusto Paiva ','184'),('6947396842',' Paulo Assis de Cunha','221'),('7049275836','Rafaela Chaves de Souza','564'),('7810573952','Larissa dos Santos','205'),('7895021563','Eunice Amelisa Duarte','145'),('8239383787','Adriano Dantas Duarte','342'),('9058473061','Renata Cristina Marques','432');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-24  5:24:47
