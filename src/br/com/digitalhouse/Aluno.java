package br.com.digitalhouse;

public class Aluno {
    private String nome;
    private String sobrenome;
    private int codigodealuno;

    public Aluno() {
    }

    public Aluno(String nome, String sobrenome, int codigodealuno) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigodealuno = codigodealuno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getCodigodealuno() {
        return codigodealuno;
    }

    public void setCodigodealuno(int codigodealuno) {
        this.codigodealuno = codigodealuno;
    }
}
