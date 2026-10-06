package desafio2Iniciante;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        int contador = 0;
        int maxNinjas = 5;

        String[] ninjas = new String[maxNinjas];

        int escolha = 0;

        do {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Deletar Ninja");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            escolha = entrada.nextInt();
            entrada.nextLine();

            switch (escolha){
                case 1:
                    if (contador < maxNinjas){
                    System.out.println("Qual o nome do seu ninja?");
                    ninjas[contador] = entrada.nextLine();
                    contador++;
                    }
                    else {
                        System.out.println("Lista cheia.");
                    }
                    break;
                case 2:
                    System.out.println("Lista de Ninjas.");
                    for (int i = 0; i < ninjas.length ; i++) {
                        System.out.println(ninjas[i]);
                    }
                    break;
                case 3:
                    System.out.println("Qual ninja você deseja deletar?");
                    for (int i = 0; i < contador; i++) {
                        System.out.println(i + " - " + ninjas[i]);
                    }
                    int delete = entrada.nextInt();
                    entrada.nextLine();

                    if (delete >= 0 && delete < contador) {
                        for (int i = delete; i < contador - 1; i++) {
                            ninjas[i] = ninjas[i + 1];
                        }
                        ninjas[contador - 1] = null;
                        contador--;
                        System.out.println("Ninja deletado!");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
            }
        }while (escolha != 4 );

    }
}
