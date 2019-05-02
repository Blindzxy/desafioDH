package br.com.digitalhouse;

public class Professor {
    private String nome;
    private String sobrenome;
    private int tempodecasa;
    private int codigodeprofessor;

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

    public int getTempodecasa() {
        return tempodecasa;
    }

    public void setTempodecasa(int tempodecasa) {
        this.tempodecasa = tempodecasa;
    }

    public int getCodigodeprofessor() {
        return codigodeprofessor;
    }

    public void setCodigodeprofessor(int codigodeprofessor) {
        this.codigodeprofessor = codigodeprofessor;
    }
}
