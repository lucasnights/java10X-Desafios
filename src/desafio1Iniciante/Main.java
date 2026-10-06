package desafio1Iniciante;

public class Main {
    static void main() {
        String nome1 = "Naruto Uzumaki.";
        int idade1 = 18;
        String aldeia1 = "Aldeia da folha.";
        String missao1 = "Derrotar Kakuzu.";
        String dificuldadeMissao1 = "A";
        String statusMissao1;

        if (idade1 > 15){
            statusMissao1 = "Missão concluída.";
        } else if (idade1 < 15 && dificuldadeMissao1 == "C" || dificuldadeMissao1 == "D") {
            statusMissao1 = "Missão concluída.";
        }else {
            statusMissao1 = "Missão Falha.";
        }


        String nome2 = "Gaara";
        int idade2 = 18;
        String aldeia2 = "Vila Oculta da Areia";
        String missao2 = "Derrotar Deidara.";
        String dificuldadeMissao2 = "A";
        String statusMissao2;

        if (idade2 > 15){
            statusMissao2 = "Missão concluída.";
        } else if (idade2 < 15 && dificuldadeMissao2 == "C" || dificuldadeMissao2 == "D") {
            statusMissao2 = "Missão concluída.";
        }else {
            statusMissao2 = "Missão Falha.";
        }

        String nome3 = "Konohamaru";
        int idade3 = 13;
        String aldeia3 = "Aldeia da folha";
        String missao3 = "Atrasar Pain";
        String dificuldadeMissao3 = "A";
        String statusMissao3;

        if (idade3 > 15){
            statusMissao3 = "Missão concluída.";
        } else if (idade3 < 15 && dificuldadeMissao3.toUpperCase() == "C" || dificuldadeMissao3.toUpperCase() == "D") {
            statusMissao3 = "Missão concluída.";
        }else {
            statusMissao3 = "Missão Falha.";
        }

        System.out.println("=============Ninja 1=============");
        System.out.println("Nome: " + nome1);
        System.out.println("Idade: " + idade1);
        System.out.println("Aldeia: " + aldeia1);
        System.out.println("Missão: " + missao1);
        System.out.println("Dificuldade da missão: " + dificuldadeMissao1);
        System.out.println("Status da missão: " + statusMissao1);

        System.out.println("\n=============Ninja 2=============");
        System.out.println("Nome: " + nome2);
        System.out.println("Idade: " + idade2);
        System.out.println("Aldeia: " + aldeia2);
        System.out.println("Missão: " + missao2);
        System.out.println("Dificuldade da missão: " + dificuldadeMissao2);
        System.out.println("Status da missão: " + statusMissao2);

        System.out.println("\n=============Ninja 3=============");
        System.out.println("Nome: " + nome3);
        System.out.println("Idade: " + idade3);
        System.out.println("Aldeia: " + aldeia3);
        System.out.println("Missão: " + missao3);
        System.out.println("Dificuldade da missão: " + dificuldadeMissao3);
        System.out.println("Status da missão: " + statusMissao3);
    }
}
