# Bootcamp #ElasTech: Java + IA

Repositório de estudos do bootcamp #ElasTech, promovido pelo PagBank em parceria com a SoulCode. Aqui estão as atividades feitas aula a aula: primeiro os fundamentos de Java e da orientação a objetos, depois padrões de projeto, testes e programação funcional, e por fim APIs REST com Spring Boot.

- **Autora:** Rebeca ([LinkedIn](https://www.linkedin.com/in/rebecano))
- **Projetos do bootcamp:** [Sistema de Restaurante](https://github.com/rebecano/restaurante-backend) (projeto 1) e [Sistema de Empréstimo de Equipamentos](https://github.com/rebecano/emprestimo) (projeto 2)
## O que este repositório mostra

- **Orientação a objetos:** classes, encapsulamento, herança, polimorfismo, interfaces e classes abstratas.
- **Collections:** `ArrayList`, `HashMap`, `HashSet` e `ArrayDeque`, usados em exercícios e em um sistema de petshop.
- **Tratamento de exceções:** captura, lançamento e validação de entradas do usuário.
- **Padrões de projeto:** Singleton, Builder, Factory, Adapter, Decorator, Facade e Observer, cada um com um exemplo próprio.
- **Testes:** TDD com JUnit 5.
- **Programação funcional:** expressões lambda, interfaces funcionais e Streams.
- **APIs REST com Spring Boot:** controllers, rotas com parâmetros e persistência com Spring Data JPA e banco H2, separadas em camadas (controller, service, repository e model).
## Estrutura do repositório

O repositório tem dois projetos Maven independentes, um em cada pasta:

```
bootcamp-elas-tech
├── java-fundamentos   Java puro: lógica, orientação a objetos, padrões de projeto, testes e programação funcional
└── spring-boot        APIs REST com Spring Boot
```

Cada projeto deve ser aberto separadamente na IDE, pela sua própria pasta.

## Conteúdo

### java-fundamentos

Pacote base: `org.example`. Cada aula tem a sua pasta (`aula1`, `aula2` e assim por diante).

| Aula | Tema | Exemplos |
|---|---|---|
| 1 | Variáveis e tipos | `Variaveis` |
| 2 | Operadores aritméticos e concatenação | `Aritmeticos`, `Concatenacao` |
| 3 | Operadores relacionais | `OperadoresRelacionais` |
| 4 | Estruturas de decisão | `EstruturasDecisao`, `EstruturasDecisaoDesafio` |
| 5 | Lista de revisão | `ListaRevisaoEx1` a `Ex6` e desafio |
| 6 | Estruturas de repetição e leitura com `Scanner` | `AtividadeEstruturasRepeticao`, `AtividadeScanner` |
| 7 | Arrays e Strings | `AtividadeArrays`, `AtividadeStrings` |
| 8 | Métodos | `AtividadeMetodos`, `Utilidades` |
| 10 | Tratamento de exceções | `AtividadeTratamentoExcecoesEx1` a `Ex6` |
| 11 | `ArrayList` e `HashMap` | `AtividadeArrayList`, `AtividadeHashMap` |
| 12 | `ArrayDeque` e `HashSet` | `AtividadeArrayDeque`, `AtividadeHashSet` |
| 13 | For-each e interfaces | `Animal`, `Veiculo`, `Notificacao` |
| 14 | Herança e polimorfismo | `Pessoa`, `Funcionario`, `Gerente`, `MeioDePagamento`, `Pix`, `Boleto` |
| 15 | Projeto Petshop: herança, polimorfismo e coleções juntos | `Pet`, `Servico`, `FilaAtendimento`, `Petshop` |
| 16 | Encapsulamento | `ContaBancaria`, `Produto` |
| 19 | Singleton e revisão de orientação a objetos | `Carrinho`, `ContadorVisitas`, `SistemaFuncionarios` |
| 20 | Classes e construtores | `Bebe` |
| 21 | Construtores, Builder e Factory | `Agendamento`, `AnimalFactory` |
| 22 | Adapter, Decorator e Facade | `PayPalAdapter`, `AcaiDecorator`, `ManhaFacade` |
| 23 | TDD com JUnit 5 | `CalculadoraSimples`, `CalculadoraDesconto` e seus testes |
| 24 | Observer | `Estoque`, `PainelAeroporto` |
| 25 | Expressões lambda e interfaces funcionais | `Saudacao`, `Calculo`, `Condicao` |
| 26 | Lambdas e Streams | `stream_atividade` |

### spring-boot

Pacote base: `com.example.aulas`. As aulas 2 a 5 guardam os dados em listas na memória. As atividades 1 e 2 já usam banco de dados (Spring Data JPA e H2) e seguem a divisão em camadas.

| Pasta | Tema | Rotas |
|---|---|---|
| `aula2` | CRUD de lanches em memória | `/aula02/lanches` |
| `aula3` | Primeiro controller REST | `/ola-mundo` |
| `aula4` | Parâmetros na rota, retorno em JSON e CRUD de funcionários | `/aula4`, `/aula4/funcionarios` |
| `aula5` | Atividade REST: rotas de um petshop | `/pets` |
| `atividades/atividade1` | API de recados em camadas, com JPA e H2 | `/recados` |
| `atividades/atividade2` | API de tarefas em camadas, com JPA e H2 | `/tarefas` |

Divisão em camadas usada nas atividades:

| Camada | Responsabilidade |
|---|---|
| Controller | Define as rotas, recebe o pedido e devolve a resposta. |
| Service | Concentra a lógica entre o controller e o banco. |
| Repository | Guarda e busca os dados (interface do Spring Data JPA). |
| Model | Descreve a entidade salva no banco. |

## Tecnologias

| Projeto | Tecnologias |
|---|---|
| java-fundamentos | Java 27, Maven, JUnit 5, Lombok |
| spring-boot | Java 17, Spring Boot 4, Spring Web MVC, Spring Data JPA, H2, DevTools, Maven Wrapper |

## Como executar

### java-fundamentos

Requisitos: JDK na versão indicada no `pom.xml` (`maven.compiler.source`) e Maven.

No IntelliJ: **File → Open** → pasta `java-fundamentos`. Depois, é só abrir a classe de uma aula e executar o método `main`.

Para rodar os testes:

```bash
cd java-fundamentos
mvn test
```

### spring-boot

Requisitos: JDK 17 ou mais recente. O projeto traz o Maven Wrapper, então não é preciso instalar o Maven.

```bash
cd spring-boot
./mvnw spring-boot:run
```

No Windows: `mvnw.cmd spring-boot:run`. Também dá para abrir a pasta `spring-boot` no IntelliJ e executar a classe `AulasApplication`.

Com a aplicação rodando:

| O quê | Endereço |
|---|---|
| API | http://localhost:8080 (por exemplo, http://localhost:8080/recados) |
| Console do banco (H2) | http://localhost:8080/h2-console |

No console do H2, a URL de conexão é `jdbc:h2:file:./dados/aulas`, o usuário é `sa` e a senha fica em branco. O banco grava os dados na pasta `dados/`, que fica fora do Git. Para recomeçar do zero, pare a aplicação e apague essa pasta.

## Fluxo de trabalho

As atividades foram desenvolvidas com branches de feature (`feature/interfaces`, `feature/heranca-polimorfismo`, `feature/atividades`) e integradas à `master` por merge. A organização atual do repositório entrou por Pull Request, com commits no padrão Conventional Commits (`chore:`, `docs:`, `feat:`).

## Observações

- **Repositório de estudos:** o código acompanha o ritmo das aulas, então as primeiras atividades são mais simples e as últimas usam conceitos mais avançados. Os projetos completos do bootcamp estão nos repositórios próprios, linkados no início.
- **Aulas sem pasta:** algumas aulas não têm pasta porque não tiveram atividade prática para entregar.
- **Persistência:** as aulas 2 a 5 do Spring guardam os dados em memória, então tudo some quando a aplicação reinicia. As atividades 1 e 2 já usam o H2 em arquivo.
- **Histórico:** a pasta `spring-boot` veio de um repositório separado, que foi arquivado depois da junção.
 