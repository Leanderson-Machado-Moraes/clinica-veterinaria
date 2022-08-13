package br.ulbra.view;

import br.ulbra.classes.Animal;
import br.ulbra.classes.Funcoes;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        int codigo = 0;
        String pesquisa;
        Scanner ler = new Scanner(System.in);
        Menu menu = new Menu();
        Funcoes banco = new Funcoes();

        int op = 1;
        while (op != 0) {
            System.out.println("AUAU MIAUMIAU ");
            System.out.println("░░░░██░░░░░░░░░██░░░░░░░░\n"
                    + "░░░█░░█░░░░░░░█░░█░░░░░░░\n"
                    + "░░█░██░█░░░░░█░██░█░░░░░░\n"
                    + "░░█░██░███████░██░█░░░░░░\n"
                    + "░░█░░░░░░░░░░░░░░░█░░░░░░\n"
                    + "░░█░░░█░░░░░░█░░░░█░░░░░░\n"
                    + "░█░░░░░░░█░░░░░░░░░█░░░░░\n"
                    + "░░█░░░░█░█░█░░░░░░█░░░░░░\n"
                    + "░░█░░░░█████░░░░░░█░░░░░░");
            System.out.println("~~~~~~~~~~~~~~~~~~");
            System.out.println("🐾 1 - CADASTRAR ANIMAL 🐾");
            System.out.println("🐾 2 - LIBERAR ANIMAL 🐾");
            System.out.println("🐾 3 - BUSCAR DONO 🐾");
            System.out.println("🐾 4 - BUSCAR PET 🐾");
            System.out.println("🐾 5 - LISTAR ANIMAIS 🐾");
            System.out.println("🐾 6 - MOSTRAR DONOS 🐾");
            System.out.println("🐾 7 - MOSTRAR QUANTOS ANIMAIS HÁ NO SISTEMA 🐾");
            System.out.println("~~~~~~~~~~~~~~~~~~");
            System.out.println("0 - SAIR ฅ՞•ﻌ•՞ฅ");
            op = ler.nextInt();
            switch (op) {
                case 1:

                    //objeto do pet
                    Animal p = new Animal();
                    codigo++;
                    p.setCod(codigo);
                    System.out.println(" 🐶 CADASTRO 🐶");
                    System.out.println("~~~~~~~~~~~~~~~~");

                    ler.nextLine();
                    System.out.println("Digite o nome do seu pet: ");
                    p.setNomePet(ler.nextLine());
                    System.out.println("Qual a espécie? ");
                    p.setEspecie(ler.nextLine());
                    System.out.println("Quantos aninhos ele(a) têm ?");
                    p.setIdade(ler.nextInt());

                    ler.nextLine();
                    System.out.println("Digite seu nome: ");
                    p.setNomeDono(ler.nextLine());
                    System.out.println("Sobrenome: ");
                    p.setSobrenome(ler.nextLine());
                    System.out.println("Qual seu RG? ");
                    p.setRG(ler.nextLine());
                    System.out.println("Qual seu CPF? ");
                    p.setCpf(ler.nextLine());
                    System.out.println("Qual seu Email? ");
                    p.setEmail(ler.nextLine());

                    banco.cadastrar(p);

                    break;
                case 2:
                    pesquisa = "";
                    ler.nextLine();
                    String nome;
                    System.out.println("LIBERAR PET");
                    System.out.println("~~~~~~~~~~~~~~");
                    System.out.println("Informe o nome do pet que deseja liberar: ");
                    pesquisa = ler.nextLine();
                    int i = banco.encontrarAnimal(pesquisa);
                    if (i != -1) {
                        banco.excluir(i);
                    } else {
                        System.out.println("Este pet ja foi liberado ou não está cadastrado!");
                    }
                    break;

                case 3:
                    ler.nextLine();
                    pesquisa = "";
                    System.out.println("Informe o nome do dono ");
                    pesquisa = ler.nextLine();
                    int iA = banco.encontrarDono(pesquisa);
                    if (iA != -1) {
                        System.out.println(banco.listarDono());
                    } else {
                        System.out.println("Dono não registrado! ");
                    }
                    break;
                case 4:

                    ler.nextLine();
                    pesquisa = "";
                    System.out.println("Informe o nome do Pet");
                    pesquisa = ler.nextLine();
                    int iB = banco.encontrarAnimal(pesquisa);
                    if (iB != -1) {
                        System.out.println(banco.listarPet(iB));
                    } else {
                        System.out.println("Pet não registrado! ");
                    }
                    break;

                case 5:
                    System.out.println(banco.listarAnimal());
                    break;
                case 6:
                    int f = 0;
                    System.out.println(banco.listarRelacoes(f));
                    break;

                case 7:
                    banco.Tamanho();

            }
        }

    }
}
