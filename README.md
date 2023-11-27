# ContaBancaria - Sistema de Gerenciamento de Contas Bancárias

## Sobre o Projeto
O projeto ContaBancaria é uma aplicação Java desenvolvida para simular um sistema de gerenciamento de contas bancárias, oferecendo funcionalidades como operações bancárias e gerenciamento de diferentes tipos de contas. Este projeto foi construído com foco na aplicação prática de conceitos de POO (Programação Orientada a Objetos), manipulação de dados, e criação de interfaces de usuário interativas.

## Estrutura do Projeto
O projeto está organizado em várias pastas e arquivos principais, cada um desempenhando um papel específico na aplicação:

### Menu
- `Menu.java`: Classe principal que gerencia a interface do usuário. É responsável por exibir o menu principal e processar a entrada do usuário para navegar entre as diferentes funcionalidades do sistema.

### Controller
- `controller/ContaController.java`: Esta classe age como um intermediário entre o `Menu` e as classes do modelo (`Conta`, `ContaCorrente`, `ContaPoupanca`). Ela gerencia as operações bancárias, como criação, atualização e exclusão de contas, bem como transações como depósitos e saques.

### Model
- `model/Conta.java`: Classe abstrata que define a estrutura básica de uma conta bancária. Inclui atributos e métodos comuns a todas as contas.
- `model/ContaCorrente.java`: Subclasse de `Conta`, representa uma conta corrente com características específicas, como taxas e limites de operações.
- `model/ContaPoupanca.java`: Subclasse de `Conta`, representa uma conta poupança, com suas particularidades, como rendimentos.

### Repository
- `repository/ContaRepository.java`: Responsável pelo armazenamento e gerenciamento das contas. Implementa mecanismos para adicionar, remover, e buscar contas no sistema.

### Util
- `util/Cores.java`: Utilitário para gerenciar as cores na interface do usuário, melhorando a experiência visual do sistema.

## Funcionalidades
- **Criação de Contas**: Suporte para criação de contas correntes e poupanças com atributos específicos.
- **Operações Bancárias**: Permite aos usuários realizar depósitos, saques, verificar saldos, etc.
- **Gerenciamento de Contas**: Inclui funcionalidades para atualizar e excluir contas bancárias.
- **Interface Interativa**: Menu de navegação fácil e intuitivo, com suporte a cores para uma melhor experiência do usuário.

## Como Executar
1. Clone o repositório: `git clone https://github.com/gabrielsponda/ContaBancaria.git`.
2. Navegue até a pasta do projeto e compile os arquivos Java.
3. Inicie a aplicação executando a classe `Menu.java`.

## Capturas de Tela
// TODO

## Desenvolvimento e Personalização

### Desafios Enfrentados
Durante o desenvolvimento do projeto ContaBancaria, enfrentei vários desafios significativos que contribuíram para o meu crescimento como desenvolvedor Java. Os principais desafios incluíram:

- **Gerenciamento de Estado e Dados**: Implementar um sistema robusto de gerenciamento de estado para as contas bancárias, garantindo consistência e integridade dos dados, foi uma tarefa complexa. Especialmente desafiador foi o manejo de transações e atualizações simultâneas, que exigiu uma compreensão profunda de conceitos como coleções em Java e gerenciamento de memória.

- **Desenvolvimento de Interface de Usuário no Console**: Criar uma interface de usuário intuitiva e amigável usando apenas o console foi outro desafio. Foi necessário pensar cuidadosamente sobre a experiência do usuário para garantir que o sistema fosse fácil de navegar e usar, mesmo sem uma interface gráfica.

- **Tratamento de Exceções e Validações de Dados**: Aprendi a importância de um tratamento de exceções robusto e validações de dados para prevenir falhas do sistema e garantir a entrada de dados correta, melhorando a confiabilidade e a usabilidade do sistema.

### Personalizações
Além das funcionalidades básicas, implementei várias personalizações para melhorar a experiência do usuário e a eficiência do sistema:

- **Menu Colorido**: Para melhorar a experiência visual do usuário, personalizei o menu com cores, utilizando a classe `Cores.java`. Isso não apenas tornou a interface mais agradável visualmente, mas também ajudou na distinção de diferentes seções e funcionalidades do menu.

- **Estruturas de Dados Otimizadas**: Escolhi e implementei estruturas de dados específicas para otimizar o armazenamento e a recuperação de informações das contas, melhorando o desempenho do sistema, especialmente ao lidar com um grande número de contas.

- **Funcionalidades Avançadas de Conta**: Introduzi funcionalidades avançadas para as contas, como a capacidade de realizar transferências entre contas e cálculo de juros para contas poupança, proporcionando uma simulação mais realista do funcionamento de um banco.

Estes desafios e personalizações não apenas melhoraram o projeto, mas também me proporcionaram um aprendizado valioso em desenvolvimento de software e programação Java.

## Contribuições
Desenvolvido por Gabriel Sponda Freitas Bettarello. Sugestões e contribuições são bem-vindas.

## Referências
Este projeto foi desenvolvido com base no material recomendado pela Generation Brasil. Os conceitos e estruturas utilizadas foram inspirados pelo projeto disponibilizado no GitHub do professor Rafael Queiróz, parte do repositório "cookbook_java_fullstack". A série de projetos, começando com [pr01](https://github.com/conteudoGeneration/cookbook_java_fullstack/blob/main/01_java/pr01.md), foi fundamental para o desenvolvimento deste sistema de gerenciamento de contas bancárias, oferecendo uma base sólida de conceitos e práticas de programação em Java.
