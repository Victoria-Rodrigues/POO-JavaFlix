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
-- Table structure for table `produto`
--

DROP TABLE IF EXISTS `produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `produto` (
  `idProduto` int NOT NULL,
  `identificador` int NOT NULL,
  `titulo` varchar(100) NOT NULL,
  `duracao` float NOT NULL,
  `preco` float NOT NULL,
  `descricao` varchar(1500) NOT NULL,
  `tipoLegenda` int NOT NULL,
  `quantidade` int NOT NULL,
  PRIMARY KEY (`idProduto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto`
--

LOCK TABLES `produto` WRITE;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
INSERT INTO `produto` VALUES (1,1,'Até o Limite',300,40,'Dez anos depois de servir no Afeganistão e voltar para casa ferido, o ex-fuzileiro Paul Landing precisa lidar com suas limitações e com o abrigo de cães que ele mantém, agora ameaçado por uma ordem para reduzir seu espaço. Não bastasse isso, ele tem que encarar o preconceito e a discriminação por sua condição. Quando um incêndio criminoso provocado por arruaceiros destrói o canil, o homem perde o controle e suas ações terão graves consequências para todos. A batalha agora é no tribunal, com Paul, sua família e seus amigos enfrentando toda uma sociedade intolerante e corrupta contra eles.',1,10),(2,1,'Amor e Esperança',450,32,'Quando veterano Brad Lee desaparece na noite de sua festa de formatura, sua namorada é forçada a questionar tudo o que ela achava que sabia sobre ele e seu relacionamento, assim como sua própria fé, na esperança de encontrá-lo.',1,13),(3,0,'Em Nome do Rei 2',70,19,'Um ex-soldado das Forças Especiais viaja aos tempos medievais para cumprir uma antiga profecia e acaba encontrando a redenção para suas experiências no campo de batalha.',2,10),(4,0,'Coração Sangrento',130,13,'Uma comédia romântica em Sorrento, na Itália. É uma história sobre um grupo de pessoas à procura de amor, paixão e felicidade, uma história sobre ciúme e solidão. Em primeiro lugar, é uma história sobre ter a coragem de mudar a sua vida - mesmo quando você acha que é tarde demais.',1,20),(5,0,'Traição e Desejo',180,20,' Duas pessoas entram na vida de um casal bem-sucedido. Seráo casamento deles ressite à tentação e ao ciumes ',2,19),(6,0,'Homem Aranha',150,15,'Um garoto ganha super poderes de aranha. Mas com grandes poderes vêm grandes responsabilidades. Se´ra essa sua maldição?',1,50),(7,1,'Elite',500,50,'Após três jovens da escola pública serem transferidos para um conceituado colégio de elite, o conflito entre classes acaba levando a um assassinato.',1,8),(8,1,'La Casa de Papel',415,43,'Um grupo de nove ladrões, liderados por um Professor, prepara o roubo do século na Casa da Moeda da Espanha, com o objetivo de fabricar o próprio dinheiro em quantidades incalculáveis e nunca antes vista.',1,30),(9,0,'Madagascar',120,11,'Quando o navio onde estão naufraga, um leão, uma zebra, uma girafa e um hipopotamo ficam presos em Madagascar, uma ilha povoada por criaturas estranhas',1,34),(10,1,'The Walking Dead',700,60,'Este drama potente e visceral retrata a vida nos Estados Unidos pós-apocalíptico. Um grupo de sobreviventes, liderado pelo policial Rick Grimes, segue viajando em busca de uma nova moradia segura e distante dos mortos-vivos.',2,5),(11,0,'De repente 30',120,15,'Após uma festa de aniversario fracassada, uma garota nerd faz um desejo: ter 30 anos. No dia seguinte, ela acorda e descobre que está 17 anos mais velha ',1,15),(12,0,'Rastros de um sequestro',149,20,'Sons que ninguem mais ouve, pesadelos que parecem reais demais. Uma noite mudará para sempre a vida dois irmãos',2,3),(13,1,'Titãs',350,31,'O detetive Dick Grayson luta contra o crime como policial e justiceiro. Uma garota misteriosa com um segredo sombro chega a Detroid',1,7),(14,1,'Narcos',240,35,'Primeiro, a mercadoria. Segundo, as rotas. Quando o dinheiro corre solto, a proxima parada é o poder',1,22),(15,0,'Crepusculo',70,13,'Ao mudar de escola, uma jovem se apaixona por um rapaz misterioso e se depara com um mundo sobrenatural ameaçado por uma longa rivalidade entre vampiros.',1,18),(16,1,'Cidade Invisivel',140,28,'Uma maldição terrivel entrelaça os destinos de um homem de luto e de criaturas folclóricas ameaçadas',1,15),(17,0,'Jumanji: Bem vindo a Selva',80,19,'Quatro estudantes vão para dentro de um antigo videogame e precisam vencer um floresta cheia de perigos se não quiserem ficar presos no jogo para sempre .',2,5),(18,1,'Breaking Bead',500,40,'Um professor de quimica do ensino medio começa a vender drogas para sustentar sua familia.',1,26),(19,1,'The Good Place',430,35,'Ao morrer e chegar a um paraiso exclusivo para pessoas éticas, Eleanor percebe que foi confuida com outra pesoa.',1,13),(20,0,'Caranguejo Negro',120,10,'Nas ruinas da Suécia pos-apocaliptica, arrasada pela guerra e congelada pela mudança climatica, os sobreviventes partem em uma ultima missão desesperada.',2,4),(21,1,'Cobra Kai',150,30,'Ralph Macchio e William Zabka estão de volta ao dojô Cobra Kai e sem compaixão.',1,9),(22,1,'Outher Banks',160,30,'Acompanhando pelos melhores amigos, John B. embarca em uma perigosa caça ao tesouro ligado ao misterioso deparecimento do pai.',2,8),(23,0,'Shek',120,12,'Um ogro nada dedicado, mas adorável, estrela este conto alegre e perveso, rechado de piadas maldosas e cheio de sentimentos',1,30),(24,0,'Gemini Man',90,11,'Uma agencia secreta do governo cria um clone mais jovem e mais forte de um atirador recém-aposentado com a missão de matá-lo.',2,3);
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;
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
