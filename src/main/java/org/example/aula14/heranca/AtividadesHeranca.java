package org.example.aula14.heranca;

public class AtividadesHeranca {
    static void main() {
        /*
        1. Crie a classe Pessoa com os atributos nome e idade, e o método
        apresentar(), que imprime "Oi, sou [nome] e tenho [idade] anos."

        Crie a classe Aluna que SÓ faz extends Pessoa, sem acrescentar nada.

        Na Main, crie uma aluna, preencha nome e idade, e chame apresentar().

        Repare: você não escreveu nome, idade nem apresentar() na Aluna,
        e os três funcionaram.
         */
        Aluna aluna1 = new Aluna();

        aluna1.nome = "Laura";
        aluna1.idade = 27;

        aluna1.apresentar();


        /*
        2. Acrescente na Aluna o atributo curso e o método estudar(), que
        imprime "[nome] está estudando [curso]."

        Preencha os três atributos no objeto e chame os dois métodos.

        Repare que o estudar() usa o nome, que veio da mãe.
        */
        Aluna aluna2 = new Aluna();

        aluna2.nome = "Amanda";
        aluna2.idade = 22;
        aluna2.curso = "Ciência de Dados";

        aluna2.apresentar();
        aluna2.estudar();


        /*
        3. Crie a classe Professora, também filha de Pessoa, com o atributo
        disciplina e o método lancarNota(String aluna, double nota), que
        imprime algo como "Flora lançou nota 9.5 para Ana". Use printf
        com %.1f.

        Na Main, crie uma aluna e uma professora, preencha os atributos de
        cada objeto e chame os métodos das duas.
         */
        Aluna aluna3 = new Aluna();

        aluna3.nome = "Ana";
        aluna3.idade = 24;
        aluna3.curso = "Psicologia";

        Professora professora1 = new Professora();

        professora1.nome = "Luciana";
        professora1.idade = 45;
        professora1.disciplina = "Comportamento Humano";

        aluna3.apresentar();
        aluna3.estudar();

        professora1.lancarNota(aluna3.nome, 9.5);


        /*
        4. Na Professora, sobrescreva o apresentar() usando @Override, pra
        imprimir "Oi, sou [nome] e ensino [disciplina]."

        Chame apresentar() na aluna e na professora e compare as saídas.
        */
        aluna3.apresentar();

        professora1.apresentar();


        /*
        5. Faça uma cadeia de três níveis:
        - Funcionario, com o atributo nome e o método baterPonto()
        - Gerente extends Funcionario, com aprovarFerias(String quem)
        - Diretora extends Gerente, com definirMeta(String meta)

        Na Main, crie uma Diretora, preencha o nome dela (carla.nome = "Carla";) e chame OS TRÊS métodos no mesmo objeto.

        Herança em cadeia: ela tem tudo que vem de cima.
         */
        Diretora carla = new Diretora();

        carla.nome = "Carla";
        carla.baterPonto();
        carla.aprovarFerias("João");
        carla.definirMeta("Aumentar a receita anual em 20% até dezembro de 2026.");


        /*
        6. Crie duas interfaces:
        - Notificavel, com notificar(String mensagem)
        - Exportavel, com exportar()

        Faça o Gerente do exercício 5 implementar as duas, SEM tirar o
        extends Funcionario:

        class Gerente extends Funcionario implements Notificavel, Exportavel

        Na Main, crie um gerente, preencha o nome e chame os quatro métodos nele: baterPonto(), aprovarFerias()notificar() e exportar().
         */
        Gerente fabiano = new Gerente();

        fabiano.nome = "Fabiano";

        fabiano.baterPonto();
        fabiano.aprovarFerias("João");
        fabiano.notificar("As férias de João foram aprovadas.");
        fabiano.exportar();

    }
}