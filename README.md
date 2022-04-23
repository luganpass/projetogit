# PROJETO GIT IP2


## INTEGRANTES DA EQUIPE
* Lucas Gabriel - luganpass@gmail.com
* Sávio Berdine - savio.berdine@gmail.com
* Gabriel Souza - gabriel.souzaa.980@gmail.com

## Descrição geral do projeto 
Histórico de eventos e acontecimentos na vida de um pet, onde o dono ou o veterinário podem registrar tanto os pets quanto os eventos sobre aquele pet, visualizando-os em forma de linha do tempo.
 1. Quem vai usar o programa?
    * Donos de pets;
    * Donos de abrigos para pets;
    * Veterinários;
 2. Que serviços são “necessários” (leia-se: importantes para os clientes e usuários)? 
    * Cadastro de pets;
    * Histórico de vacinação por pet;
    * Histórico de medicação por pet;
    * Histórico de consultas por pet; 
    * Histórico de sintomas;
    * Histórico de resultados de exames;
    * Histórico de diagnósticos;
 3. Quais serviços cada usuário pode executar? 
    * Veterinário: Consultar históricos, registro de diagnósticos, registro de exames, registro de vacinação; 
    * Dono de pet e de abrigos: Consultar históricos, registro de diagnósticos, registro de exames, registro de vacinação registro de sintomas;

 ## Requisitos do projeto
* **REQ1** - O sistema deve controlar o acesso através de login e senha. Os usuários do sistema serão do tipo dono de pet, dono de abrigo e veterinário. (Cadastro, login, logout)
  * Nome
  * Email
  * Idade
* **REQ2** - O sistema deve permitir o cadastro de pets.
  * Espécies: Gato, Cachorro, outros
  * Nome
  * Peso
  * ID do Chip
  * Dimensões: altura, comprimento, largura (apenas um deles obrigatório)
  * Data de nascimento
  * Id do dono
* **REQ3** - O sistema deve permitir o cadastro de vacinas, medicações, consultas, diagnósticos, sintomas e resultados de exames por pet.  
* **REQ9** - O sistema deve permitir a listagem de pets.
* **REQ4** - O sistema deve permitir a listagem de vacinas, medicações, consultas, diagnósticos, sintomas e resultados de exames por pet.
* **REQ5** - O sistema deve exibir uma linha do tempo de acontecimentos por pet, independente do tipo.
  * Medicações
  * Consultas
  * Sintomas
  * Resultados de exames
  * Diagnósticos
  * Vacinação
* **REQ6** - O sistema deve exibir uma página de detalhes ao clicar numa vacinação, medicação, consulta, diagnóstico, sintomas ou resultado de exame.
* **REQ7** - O sistema deve exibir uma página de detalhes ao clicar num pet.
* **REQ8** - O sistema deve permitir a edição de vacinas, medicações, consultas, diagnósticos, sintomas e resultados de exames por pet.
* **REQ9** - O sistema deve permitir a edição de pets.