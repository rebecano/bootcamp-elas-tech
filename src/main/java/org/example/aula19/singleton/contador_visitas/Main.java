package org.example.aula19.singleton.contador_visitas;

public class Main {
    static void main() {
        /*
        6.  Crie uma classe Singleton chamada ContadorVisitas que:
        -tenha um atributo total, começando em 0;
        -tenha um método registrarVisita() que soma 1 ao total;
        -tenha um método getTotal() que devolve o total.

        Depois, no main, obtenha ele duas vezes em variáveis diferentes pagina1 e pagina2, registre visitas usando as duas, e imprima o total. O resultado deve mostrar que as duas variáveis usam o mesmo contador.

        Exemplo de saída esperada:

        Total de visitas: 3

        Dica: Para instanciar(criar) não use o new. Classe v1 = Classe.getInstancia();
         */

        ContadorVisitas pagina1 = ContadorVisitas.getInstancia();

        pagina1.registrarVisita();
        System.out.println(pagina1.getTotal());


        ContadorVisitas pagina2 = ContadorVisitas.getInstancia();

        pagina2.registrarVisita();
        System.out.println(pagina2.getTotal());
    }
}
