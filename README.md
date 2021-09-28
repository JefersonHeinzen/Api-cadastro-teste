# API-casdastro REST usando Spring Boot 2, Hibernate, JPA, e H2.

## O Problema que Queremos Resolver:

Precisamos implementar uma API REST que tivesse login e senha, visualizar os dados cadastrados, além de alterar os mesmos. Na hora de fazer o cadastro, o
sistema deve receber o nome do usuário, seu e-mail, senha e o CNPJ da empresa. Quando
receber o CNPJ, utilize essa api para buscar as informações adicionais da empresa:
https://receitaws.com.br/v1/cnpj/{CNPJ}. Ao acessar a url trocando o parâmetro pelo CNPJ
informado, esse endpoint trará várias informações da empresa que devem ser armazenadas no
banco de dados. Feito o cadastro, o usuário deve conseguir fazer login no sistema. O login
efetuado com sucesso, deve-se carregar os dados da empresa associada a esse usuário.

*id
* Nome
* E-mail
* CNPJ


## Tecnologias a Serem Utilizadas:

As stacks principais serão Java, Spring e Hibernate e desdobrando-as usaremos:

* Java 11;
* Maven 3.6.3;
* Spring Boot (última versão estável);
* GIT/GITHUB para versionamento de código;
* Intellij (IDE);
* Postman;

## Qual foi o processo de decisão para realizar a implementação

Problema está bem delimitado fica mais fácil encontrar a solução, foi pedido uma API REST para o processo de cadastro, então é necessário entender o que é uma API REST (Representational State Transfer).
Na arquitetura REST. Esta é uma arquitetura madura e muito utilizada o que facilita a obtenção de informações. Neste padrão devemos mapear nossas operações necessárias ao cadastro e manipulação dos dados para verbos HTTP, e o framework Spring já é totalmente compatível com esta arquitetura o que facilita todo o processo de desenvolvimento. Desta forma seguiremos as recomendações da comunidade utilizando os recursos que o Spring nos oferece.

Para executar o projeto no terminal, digite o seguinte comando:

mvn spring-boot:run
Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:

http://localhost:8001/h2-console

O código não está em perfeito funcionamento, pois ainda me falta experiencia para fazer o projeto full, alguns problemas estão presente, aplicação está retornando no "CNPJ" null, tentei fazer tratativas mas não foram bem sucedidas, foi deixado em comentário as tratativas que estava sendo feitas, apresenta falha no "put" está dando erro, acabou que ainda não consegui arrumar o erro, mas vou estar trabalhando no codigo para corrigir.
Apesar de não ter atingindo todas os requisitos que foram mencionados, como foi pouco tempo para um pessoa que tem apenas poucos conhecimento, fico grato pelo que estou entregando.
