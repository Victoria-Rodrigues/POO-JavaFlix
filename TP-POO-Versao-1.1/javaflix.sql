CREATE SCHEMA IF NOT EXISTS javaflix;

USE javaflix;
-- drop schema javaflix;
CREATE TABLE IF NOT EXISTS cliente
(
 cpf VARCHAR(30) NOT NULL,
 nome VARCHAR(100) NOT NULL UNIQUE,
 senha VARCHAR(50) NOT NULL,
 PRIMARY KEY(cpf)
);

CREATE TABLE IF NOT EXISTS administrador
(
 cpf VARCHAR(30) NOT NULL,
 nome VARCHAR(100) NOT NULL UNIQUE,
 senha VARCHAR(50) NOT NULL,
 PRIMARY KEY(cpf)
);

CREATE TABLE IF NOT EXISTS produto
(
idProduto INT NOT NULL,
identificador INT NOT NULL,
titulo VARCHAR(100) NOT NULL,
duracao FLOAT NOT NULL,
preco FLOAT NOT NULL,
descricao VARCHAR(1500) NOT NULL,
tipoLegenda INT NOT NULL,
quantidade INT NOT NULL,
PRIMARY KEY (idproduto)
);

CREATE TABLE IF NOT EXISTS listaCompra(
	cpf VARCHAR(30) NOT NULL,
	idProduto INT NOT NULL,
    quantidade INT,
    total FLOAT
);

INSERT INTO cliente(cpf, nome,senha)
VALUES ('12345678910',"Paulo Henrique Pereira","123"),
('02144477785',"Maria Joaquina Pereira","456"),('2547893654',"Fernanda Silva Rodrigues","789"),
('58436215058',"Luiza Oliveira Cardoso","254"),('7895021563',"Eunice Amelisa Duarte","145"),
('4928694837',"Madalena Assis de Souza","900"),('38592058391',"Silvio Antonio Gonçalves","751"),
('1058295836',"Natalia Freitas do Carmo","185"),('1960475913',"Jose Pereira Ribeiro","048"),
('0591703603',"Felipe da Silva Cruz","247"),('3059160385',"Jaqueline coelho dos Santos","981"),
('4910684739',"Adriano Fernades Teixeiras","134"),('2940583716',"Paloma Pimentel de Melo","108"),
('6947396842'," Paulo Assis de Cunha","221"),('2049582106',"Roberto Duarte Moraes","184"),
('7049275836',"Rafaela Chaves de Souza","564"),('3593730482',"Humberto Henrique Diaz","216"),
('1039401735',"Wesley Binho de Oliveira","676"),('4031720498',"Luciana Gonçalnves de Souza","092"),
('2948572052',"Thais Gonçalves Torres","082"),('8239383787',"Adriano Dantas Duarte","342"),
('1059385638',"Franciney Jose Geraldo","210"),('3240834948',"Luiz Eduardo Fortes","927"),
('9058473061',"Renata Cristina Marques","432"),('1034897437',"Ana Luiza dos Santos","284"),
('7810573952',"Larissa dos Santos","205"),('3948409323',"Juliana Camargo Rodrigues ","193"),
('1058395728',"Gabriel Martins de Souza","286"),('6723098120',"Diego Augusto Paiva ","184"),
('5048396043',"Davi Gomes de Castro","105"),('3098143545',"Amanda da Rosa","590"),
('2037250374',"Luis Cardoso de Freitas","938"),('2098334292',"Bruno Caetano Pereira","499");

-- os adminitradores serão da mesma familia 
INSERT INTO administrador(cpf, nome,senha)
VALUES ('2960471947',"Antonio Da Silva","001"),('2010572059',"Juliana Camargo Da Silva","002"),
('0195829504',"Felipe Camargo Da silva","003"),('8029259381',"Camila Camargo Da silva","003");

INSERT INTO produto(idProduto,identificador,titulo,duracao,preco, descricao, tipoLegenda, quantidade)
VALUES(1, 1, "Até o Limite",300, 40, "Dez anos depois de servir no Afeganistão e voltar para casa ferido, o ex-fuzileiro Paul Landing precisa lidar com suas limitações e com o abrigo de cães que ele mantém, agora ameaçado por uma ordem para reduzir seu espaço. Não bastasse isso, ele tem que encarar o preconceito e a discriminação por sua condição. Quando um incêndio criminoso provocado por arruaceiros destrói o canil, o homem perde o controle e suas ações terão graves consequências para todos. A batalha agora é no tribunal, com Paul, sua família e seus amigos enfrentando toda uma sociedade intolerante e corrupta contra eles.", 1, 10),
(2, 1, "Amor e Esperança",450, 32, "Quando veterano Brad Lee desaparece na noite de sua festa de formatura, sua namorada é forçada a questionar tudo o que ela achava que sabia sobre ele e seu relacionamento, assim como sua própria fé, na esperança de encontrá-lo.", 1, 13),
(3, 0, "Em Nome do Rei 2",70, 19, "Um ex-soldado das Forças Especiais viaja aos tempos medievais para cumprir uma antiga profecia e acaba encontrando a redenção para suas experiências no campo de batalha.", 2, 10),
(4, 0, "Coração Sangrento",130, 13, "Uma comédia romântica em Sorrento, na Itália. É uma história sobre um grupo de pessoas à procura de amor, paixão e felicidade, uma história sobre ciúme e solidão. Em primeiro lugar, é uma história sobre ter a coragem de mudar a sua vida - mesmo quando você acha que é tarde demais.", 1, 20),
(5, 0, "Traição e Desejo",180, 20, " Duas pessoas entram na vida de um casal bem-sucedido. Seráo casamento deles ressite à tentação e ao ciumes ", 2, 19),
(6, 0, "Homem Aranha",150, 15, "Um garoto ganha super poderes de aranha. Mas com grandes poderes vêm grandes responsabilidades. Se´ra essa sua maldição?", 1, 50),
(7, 1, "Elite",500, 50, "Após três jovens da escola pública serem transferidos para um conceituado colégio de elite, o conflito entre classes acaba levando a um assassinato.", 1, 8),
(8, 1, "La Casa de Papel",415, 43, "Um grupo de nove ladrões, liderados por um Professor, prepara o roubo do século na Casa da Moeda da Espanha, com o objetivo de fabricar o próprio dinheiro em quantidades incalculáveis e nunca antes vista.", 1, 30),
(9, 0, "Madagascar",120, 11, "Quando o navio onde estão naufraga, um leão, uma zebra, uma girafa e um hipopotamo ficam presos em Madagascar, uma ilha povoada por criaturas estranhas", 1, 34),
(10, 1, "The Walking Dead",700, 60, "Este drama potente e visceral retrata a vida nos Estados Unidos pós-apocalíptico. Um grupo de sobreviventes, liderado pelo policial Rick Grimes, segue viajando em busca de uma nova moradia segura e distante dos mortos-vivos.", 2, 5),
(11, 0, "De repente 30",120, 15, "Após uma festa de aniversario fracassada, uma garota nerd faz um desejo: ter 30 anos. No dia seguinte, ela acorda e descobre que está 17 anos mais velha ", 1, 15),
(12, 0, "Rastros de um sequestro",149, 20, "Sons que ninguem mais ouve, pesadelos que parecem reais demais. Uma noite mudará para sempre a vida dois irmãos", 2, 3),
(13, 1, "Titãs",350, 31, "O detetive Dick Grayson luta contra o crime como policial e justiceiro. Uma garota misteriosa com um segredo sombro chega a Detroid", 1, 7),
(14, 1, "Narcos",240, 35, "Primeiro, a mercadoria. Segundo, as rotas. Quando o dinheiro corre solto, a proxima parada é o poder", 1, 22),
(15, 0, "Crepusculo",70, 13, "Ao mudar de escola, uma jovem se apaixona por um rapaz misterioso e se depara com um mundo sobrenatural ameaçado por uma longa rivalidade entre vampiros.", 1, 18),
(16, 1, "Cidade Invisivel",140, 28, "Uma maldição terrivel entrelaça os destinos de um homem de luto e de criaturas folclóricas ameaçadas", 1, 15),
(17, 0, "Jumanji: Bem vindo a Selva",80, 19, "Quatro estudantes vão para dentro de um antigo videogame e precisam vencer um floresta cheia de perigos se não quiserem ficar presos no jogo para sempre .", 2, 5),
(18, 1, "Breaking Bead",500, 40, "Um professor de quimica do ensino medio começa a vender drogas para sustentar sua familia.", 1, 26),
(19, 1, "The Good Place",430, 35, "Ao morrer e chegar a um paraiso exclusivo para pessoas éticas, Eleanor percebe que foi confuida com outra pesoa.", 1, 13),
(20, 0, "Caranguejo Negro",120, 10, "Nas ruinas da Suécia pos-apocaliptica, arrasada pela guerra e congelada pela mudança climatica, os sobreviventes partem em uma ultima missão desesperada.", 2, 4),
(21, 1, "Cobra Kai",150, 30, "Ralph Macchio e William Zabka estão de volta ao dojô Cobra Kai e sem compaixão.", 1, 9),
(22, 1, "Outher Banks",160, 30, "Acompanhando pelos melhores amigos, John B. embarca em uma perigosa caça ao tesouro ligado ao misterioso deparecimento do pai.", 2, 8),
(23, 0, "Shek",120, 12, "Um ogro nada dedicado, mas adorável, estrela este conto alegre e perveso, rechado de piadas maldosas e cheio de sentimentos", 1, 30),
(24, 0, "Gemini Man",90, 11, "Uma agencia secreta do governo cria um clone mais jovem e mais forte de um atirador recém-aposentado com a missão de matá-lo.", 2, 3);

