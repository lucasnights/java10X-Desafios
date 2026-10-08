package desafio1Intermediario;

public class Uchiha extends Ninja{
    String habilidadeEspecial;

    public Uchiha() {
    }

    public Uchiha(String nome, int idade, String missao, String nivelDificuldade, String statusMissao, String habilidadeEspecial) {
        super(nome, idade, missao, nivelDificuldade, statusMissao);
        this.habilidadeEspecial = habilidadeEspecial;
    }

    @Override
    void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Habilidade uchiha: " + habilidadeEspecial);
    }
}
