package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private int codigodecurso;
    private ProfessorAdjunto professorAdjunto;
    private ProfessorTitular professorTitular;
    private int alunos;


    List<Aluno> listadealunos = new ArrayList<>();

    public void excluirAluno(Aluno aluno){

        listadealunos.remove(aluno);
    }

    public boolean adicionarUmAluno(int aluno) {
        if ((aluno + 1) > alunos) ;
        return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigodecurso() {
        return codigodecurso;
    }

    public void setCodigodecurso(int codigodecurso) {
        this.codigodecurso = codigodecurso;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public int getAlunos() {
        return alunos;
    }

    public void setAlunos(int alunos) {
        this.alunos = alunos;
    }

    public List<Aluno> getListadealunos() {
        return listadealunos;
    }

    public void setListadealunos(List<Aluno> listadealunos) {
        this.listadealunos = listadealunos;
    }
}

