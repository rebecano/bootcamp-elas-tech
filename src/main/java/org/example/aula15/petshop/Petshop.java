package org.example.aula15.petshop;

import java.util.*;

public class Petshop {

    public static void mostrarPet(Pet pet) {
        System.out.println("Nome: " + pet.nome);
    }

    public static void mostrarPet(Pet pet, String titulo) {
        System.out.println(titulo);
        System.out.println("Nome: " + pet.nome);
        System.out.println("Espécie: " + pet.especie);
        System.out.printf("Peso: %.1f kg\n", pet.peso);
        System.out.println("Porte: " + pet.porte);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pet[] listaPet = new Pet[5];

        HashSet<String> conjuntoPets = new HashSet<>();

        ArrayDeque<String> filaServico = new ArrayDeque<>();

        ArrayList<Servico> listaAtendimento = new ArrayList<>();

        listaAtendimento.add(new Banho());
        listaAtendimento.add(new Tosa());
        listaAtendimento.add(new Consulta());

        int opcao = -1;
        int total = 0;

        while (opcao != 0) {

            System.out.println("\n=== PETSHOP ===\n1 - Cadastrar pet\n2 - Listar pet\n3 - Buscar por nome\n4 - Ver espécies cadastradas\n5 - Entrar na fila (banho, tosa e consulta)\n6 - Atender o próximo\n7 - Ficha do pet\n0 - Sair\nEscolha:");

            try {
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        if (total >= listaPet.length) {
                            System.out.println("Limite de pets atingido.");
                            break;
                        }

                        System.out.println("\nDigite o nome do pet:");
                        String nome = sc.nextLine();

                        System.out.println("Digite a espécie:");
                        String especie = sc.nextLine();

                        Pet meuPet;

                        if (especie.equalsIgnoreCase("Cachorro")) {
                            meuPet = new Cachorro();
                        } else if (especie.equalsIgnoreCase("Gato")) {
                            meuPet = new Gato();
                        } else {
                            meuPet = new Pet();
                        }

                        meuPet.nome = nome;
                        meuPet.especie = especie;

                        System.out.println("Digite o peso:");
                        meuPet.peso = sc.nextDouble();
                        sc.nextLine();

                        meuPet.porte = meuPet.definirPorte();

                        listaPet[total] = meuPet;

                        conjuntoPets.add(especie);

                        total++;

                        System.out.printf(
                                "\nPet cadastrado! Agora são %d pet(s).\n\n",
                                total
                        );

                        break;

                    case 2:
                        if (total != 0) {
                            for (int i = 0; i < total; i++) {
                                System.out.printf("%s (%s) - %.1f kg - Porte %s\n", listaPet[i].nome, listaPet[i].especie, listaPet[i].peso, listaPet[i].definirPorte());
                                listaPet[i].emitirSom();
                            }
                        } else {
                            System.out.println("\nNenhum pet cadastrado.\n");
                        }

                        break;

                    case 3:
                        System.out.println("Qual pet você procura?");
                        String petBusca = sc.nextLine();

                        boolean achou = false;

                        for (int i = 0; i < total; i++) {
                            if (listaPet[i].nome.equalsIgnoreCase(petBusca)) {
                                System.out.printf("Encontrado: %s (%s) - %.1f kg\n\n", listaPet[i].nome, listaPet[i].especie, listaPet[i].peso);

                                achou = true;
                            }
                        }

                        if (!achou) {
                            System.out.println("Pet não encontrado.");
                        }

                        break;

                    case 4:
                        System.out.println("--- ESPÉCIES CADASTRADAS ---");

                        for (String pet : conjuntoPets) {
                            System.out.println("- " + pet);
                        }

                        System.out.println("\nTotal de espécies diferentes: " + conjuntoPets.size());

                        break;

                    case 5:
                        System.out.println("\nNome do pet para entrar na fila (banho, tosa e consulta): ");
                        String nomeFila = sc.nextLine();

                        boolean encontrado = false;

                        for (int i = 0; i < total; i++) {
                            if (listaPet[i].nome.equalsIgnoreCase(nomeFila)) {
                                System.out.printf("\n%s entrou na fila.\n", nomeFila);

                                filaServico.add(nomeFila);

                                System.out.println("Fila agora: " + filaServico);

                                encontrado = true;
                                break;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("Pet não cadastrado.");
                        }

                        break;

                    case 6:
                        if (filaServico.isEmpty()) {
                            System.out.println("\nNão há pets na fila.");

                        } else {
                            System.out.println("\nPróximo da fila: " + filaServico.peek());

                            for (Servico item : listaAtendimento) {
                                item.executar(filaServico.peek());
                            }

                            System.out.printf("\nBanho, tosa e consulta de %s finalizados.\n", filaServico.poll());

                            System.out.println("Fila agora: " + filaServico);
                        }

                        break;

                    case 7:
                        System.out.println("Digite o nome do pet:");
                        String nomeFicha = sc.nextLine();

                        boolean encontradoFicha = false;

                        for (int i = 0; i < total; i++) {
                            if (listaPet[i].nome.equalsIgnoreCase(nomeFicha)) {

                                mostrarPet(listaPet[i]);

                                System.out.println("---");

                                mostrarPet(listaPet[i], "=== FICHA DO PET ===");

                                encontradoFicha = true;
                                break;
                            }
                        }

                        if (!encontradoFicha) {
                            System.out.println("Pet não encontrado.");
                        }

                        break;

                    case 0:
                        System.out.println("\nAté logo!");

                        break;
                }

            } catch (InputMismatchException ime) {
                System.out.println("Digite apenas números!");
                sc.nextLine();

            } catch (NullPointerException npe){
                System.out.println("Nenhum pet foi cadastrado.");

            } finally {
                System.out.println(" ");
            }

        }
    }
}