# PROJETO GIT IP2


## INTEGRANTES DA EQUIPE
Lucas Gabriel
Sávio Berdine

## Descrição geral do projeto 
Nesta descrição, apresente um texto resumido com a(s) principal(is) funcionalidade(s) do sistema. 
É muito importante que você consiga responder em uma única frase: qual a principal funcionalidade do seu sistema? 
A partir disso, você deve detalhar as funcionalidades do sistema tentando responder às perguntas:
 1. Quem vai usar o programa?
    * Donos de pets;
    * Donos de abrigos para pets;
    * Veterinários;
 2. Que serviços são “necessários” (leia-se: importantes para os clientes e usuários)? 
    * Signup;
    * Login;
    * Logout;
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
    Prioridade | Complexidade | Dependências
    ---------- | ------------ | ------------
    1 | 3 | None
* **REQ2** - O sistema deve permitir o cadastro de pets.
  * Espécies: Gato, Cachorro, outros
  * Nome
  * Peso
  * ID do Chip
  * Dimensões: altura, comprimento, largura (apenas um deles obrigatório)
  * Data de nascimento
  * Id do dono
    Prioridade | Complexidade | Dependências
    ---------- | ------------ | ------------
    3 | 8 | None
* **REQ3** - O sistema deve permitir o cadastro de vacinas por pet.
  * Nome
  * Foto do rótulo
  * Data
  * Dosagem (opcional)
  * Ordem da dose (primeira, segunda, etc)
  * Consulta (opcional)
    Prioridade | Complexidade | Dependências
    ---------- | ------------ | ------------
    2 | 13 | None
* **REQ4** - O sistema deve permitir o cadastro de medicação por pet.
  * Nome
  * Foto do rótulo
  * Data e hora
  * Dosagem (opcional)
  * Consulta (opcional)
    Prioridade | Complexidade | Dependências
    ---------- | ------------ | ------------
    2 | 13 | None
* **REQ5** - O sistema deve permitir o cadastro de consultas por pet.
  * Nome do veterinário
  * Clínica
  * Data
  * Descrição
    Prioridade | Complexidade | Dependências
    ---------- | ------------ | ------------
    2 | 5 | None
* **REQ6** - O sistema deve permitir o cadastro de diagnósticos por pet.
  * Título
  * Nome do veterinário
  * Clínica
  * Data
  * Descrição
  * Consulta (opcional)
    Prioridade | Complexidade | Dependências
    ---------- | ------------ | ------------
    2 | 5 | None
* **REQ7** - O sistema deve permitir o cadastro de sintomas por pet.
  * Título
  * Data e hora
  * Descrição
    Prioridade | Complexidade | Dependências
    ---------- | ------------ | ------------
    2 | 5 | None
* **REQ8** - O sistema deve permitir o cadastro de resultados de exames por pet.
  * Título
  * Nome do veterinário (opcional)
  * Clínica
  * Data e hora
  * Resultados
    Prioridade | Complexidade | Dependências
    ---------- | ------------ | ------------
    2 | 5 | None
* **REQ9** - O sistema deve permitir a listagem de pets.
    Prioridade | Complexidade | Dependências
    ---------- | ------------ | ------------
    3 | 13 | REQ2
* **REQ10** - O sistema deve permitir a listagem de vacinas por pet.
    Prioridade | Complexidade | Dependências
    ---------- | ------------ | ------------
    3 | 13 | REQ3
* **REQ11** - O sistema deve permitir a listagem de medicação por pet.
    Prioridade | Complexidade | Dependências
    ---------- | ------------ | ------------
    3 | 13 | REQ4
* **REQ12** - O sistema deve permitir a listagem de consultas por pet.
    Prioridade | Complexidade | Dependências
    ---------- | ------------ | ------------
    3 | 13 | REQ5
* **REQ13** - O sistema deve permitir a listagem de diagnósticos por pet.
    Prioridade | Complexidade | Dependências
    ---------- | ------------ | ------------
    3 | 13 | REQ6
* **REQ14** - O sistema deve permitir a listagem de sintomas por pet.
    Prioridade | Complexidade | Dependências
    ---------- | ------------ | ------------
    3 | 13 | REQ7
* **REQ15** - O sistema deve permitir a listagem de resultados de exames por pet.
    Prioridade | Complexidade | Dependências
    ---------- | ------------ | ------------
    3 | 13 | REQ8
* **REQ16** - O sistema deve exibir uma linha do tempo de acontecimentos por pet, independente do tipo.
  * Medicações
  * Consultas
  * Sintomas
  * Resultados de exames
  * Diagnósticos
  * Vacinação
    Prioridade | Complexidade | Dependências
    ---------- | ------------ | ------------
    3 | 13 | REQ2, REQ3, REQ4, REQ5, REQ6, REQ7, REQ8
* **REQ17** - O sistema deve exibir uma página de detalhes ao clicar numa vacinação.
    Prioridade | Complexidade | Dependências
    ---------- | ------------ | ------------
    3 | 13 | REQ3
* **REQ18** - O sistema deve exibir uma página de detalhes ao clicar numa medicação.
    Prioridade | Complexidade | Dependências
    ---------- | ------------ | ------------
    3 | 13 | REQ4
* **REQ19** - O sistema deve exibir uma página de detalhes ao clicar numa consulta.
    Prioridade | Complexidade | Dependências
    ---------- | ------------ | ------------
    3 | 8 | REQ5
* **REQ20** - O sistema deve exibir uma página de detalhes ao clicar num sintoma.
    Prioridade | Complexidade | Dependências
    ---------- | ------------ | ------------
    3 | 8 | REQ6
* **REQ21** - O sistema deve exibir uma página de detalhes ao clicar num resultado de exame.
    Prioridade | Complexidade | Dependências
    ---------- | ------------ | ------------
    3 | 8 | REQ7
* **REQ22** - O sistema deve exibir uma página de detalhes ao clicar num disgnóstico.
    Prioridade | Complexidade | Dependências
    ---------- | ------------ | ------------
    3 | 8 | REQ8
* **REQ23** - O sistema deve exibir uma página de detalhes ao clicar num pet.
    Prioridade | Complexidade | Dependências
    ---------- | ------------ | ------------
    3 | 8 | REQ2