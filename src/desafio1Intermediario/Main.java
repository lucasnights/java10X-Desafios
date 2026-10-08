package desafio1Intermediario;

import java.util.Scanner;

public class Main {
    static void main() {
        //Entrada de dados.
        Scanner scanner = new Scanner(System.in);

        //Contadores.
        int ninjasCadastrados = 0;
        int uchihasCadastrados = 0;
        int maxCadastros = 6;

        //Integer para loop.
        int escolha = 0;

        //Armazenamento de usuários.
        Ninja[] ninjas = new Ninja[maxCadastros];
        Uchiha[] uchihas = new Uchiha[maxCadastros];

        do {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar ninja.");
            System.out.println("2. Listar ninjas.");
            System.out.println("3. Deletar ninja.");
            System.out.println("4. Mudar habilidade especial.");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("Você quer criar um ninja comum ou uchiha?");
                    System.out.println("1. Ninja comum.");
                    System.out.println("2. Uchiha");
                    int tipoNinja = scanner.nextInt();
                    scanner.nextLine();
                    switch (tipoNinja) {
                        case 1:
                            if (ninjasCadastrados < maxCadastros) {
                                Ninja novoNinja = new Ninja();
                                System.out.println("Qual o nome do seu ninja?");
                                novoNinja.nome = scanner.nextLine();
                                System.out.println("Qual a idade do seu ninja?");
                                novoNinja.idade = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Qual a missão do seu ninja?");
                                novoNinja.missao = scanner.nextLine();
                                System.out.println("Qual a dificuldade da missão?");
                                novoNinja.nivelDificuldade = scanner.nextLine();
                                System.out.println("Qual o status da missão?");
                                novoNinja.statusMissao = scanner.nextLine();
                                ninjas[ninjasCadastrados] = novoNinja;
                                ninjasCadastrados++;
                                System.out.println("Ninja cadastrado.");
                            } else {
                                System.out.println("Lista cheia.");
                            }
                            break;
                        case 2:
                            if (uchihasCadastrados < maxCadastros) {
                                Uchiha novoUchiha = new Uchiha();
                                System.out.println("Qual o nome do seu ninja?");
                                novoUchiha.nome = scanner.nextLine();
                                System.out.println("Qual a idade do seu ninja?");
                                novoUchiha.idade = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Qual a missão do seu ninja?");
                                novoUchiha.missao = scanner.nextLine();
                                System.out.println("Qual a dificuldade da missão?");
                                novoUchiha.nivelDificuldade = scanner.nextLine();
                                System.out.println("Qual o status da missão?");
                                novoUchiha.statusMissao = scanner.nextLine();
                                System.out.println("Qual a sua habilidade especial?");
                                novoUchiha.habilidadeEspecial = scanner.nextLine();
                                uchihas[uchihasCadastrados] = novoUchiha;
                                uchihasCadastrados++;
                                System.out.println("Uchiha cadastrado.");
                            } else {
                                System.out.println("Lista cheia.");
                            }
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;

                case 2:
                    System.out.println("Você quer ver qual lista?");
                    System.out.println("1. Ninja comum.");
                    System.out.println("2. Uchiha");
                    int tipoLista = scanner.nextInt();
                    scanner.nextLine();
                    switch (tipoLista) {
                        case 1:
                            if (ninjasCadastrados > 0) {
                                for (int i = 0; i < ninjasCadastrados; i++) {
                                    ninjas[i].mostrarInformacoes();
                                }
                            } else {
                                System.out.println("Lista vazia.");
                            }
                            break;
                        case 2:
                            if (uchihasCadastrados > 0) {
                                for (int i = 0; i < uchihasCadastrados; i++) {
                                    uchihas[i].mostrarInformacoes();
                                }
                            } else {
                                System.out.println("Lista vazia.");
                            }
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;

                case 3:
                    System.out.println("Você quer deletar de qual lista?");
                    System.out.println("1. Ninja comum.");
                    System.out.println("2. Uchiha");
                    int tipoDeletar = scanner.nextInt();
                    scanner.nextLine();
                    switch (tipoDeletar) {
                        case 1:
                            if (ninjasCadastrados == 0) {
                                System.out.println("Lista vazia.");
                                break;
                            }
                            System.out.println("Qual ninja deseja deletar?");
                            for (int i = 0; i < ninjasCadastrados; i++) {
                                System.out.println(i + "- " + ninjas[i].nome);
                            }
                            int posicaoNinja = scanner.nextInt();
                            scanner.nextLine();
                            if (posicaoNinja < 0 || posicaoNinja >= ninjasCadastrados) {
                                System.out.println("Posição inválida.");
                                break;
                            }
                            for (int i = posicaoNinja; i < ninjasCadastrados - 1; i++) {
                                ninjas[i] = ninjas[i + 1];
                            }
                            ninjas[ninjasCadastrados - 1] = null;
                            ninjasCadastrados--;
                            System.out.println("Ninja deletado.");
                            break;
                        case 2:
                            if (uchihasCadastrados == 0) {
                                System.out.println("Lista vazia.");
                                break;
                            }
                            System.out.println("Qual uchiha deseja deletar?");
                            for (int i = 0; i < uchihasCadastrados; i++) {
                                System.out.println(i + "- " + uchihas[i].nome);
                            }
                            int posicaoUchiha = scanner.nextInt();
                            scanner.nextLine();
                            if (posicaoUchiha < 0 || posicaoUchiha >= uchihasCadastrados) {
                                System.out.println("Posição inválida.");
                                break;
                            }
                            for (int i = posicaoUchiha; i < uchihasCadastrados - 1; i++) {
                                uchihas[i] = uchihas[i + 1];
                            }
                            uchihas[uchihasCadastrados - 1] = null;
                            uchihasCadastrados--;
                            System.out.println("Uchiha deletado.");
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;

                case 4:
                    if (uchihasCadastrados == 0) {
                        System.out.println("Lista vazia.");
                        break;
                    }
                    System.out.println("Deseja mudar a habilidade especial de qual Uchiha?");
                    for (int i = 0; i < uchihasCadastrados; i++) {
                        System.out.println(i + "- " + uchihas[i].nome + " - " + uchihas[i].habilidadeEspecial);
                    }
                    int mudarHabilidade = scanner.nextInt();
                    scanner.nextLine();
                    if (mudarHabilidade < 0 || mudarHabilidade >= uchihasCadastrados) {
                        System.out.println("Escolha uma opção válida.");
                        break;
                    }
                    System.out.println("Digite a nova habilidade:");
                    uchihas[mudarHabilidade].habilidadeEspecial = scanner.nextLine();
                    System.out.println("Habilidade atualizada.");
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (escolha != 5);
    }
}