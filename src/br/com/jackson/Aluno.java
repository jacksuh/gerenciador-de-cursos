package br.com.jackson;

public class Aluno {

    private String nome;
    private int numeroMatricula;

    public Aluno(String nome, int numeroMatricula) {
        if (nome == null) {
            throw new NullPointerException("Nome não pode ser nulo");
        }
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }


    @Override
    public String toString() {
        return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + numeroMatricula;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = true;
        boolean finished = false;
        if (this != obj) {
            if (obj == null) {
                result = false;
            } else if (getClass() != obj.getClass()) {
                result = false;
            } else {
                Aluno other = (Aluno) obj;
                if (nome == null) {
                    if (other.nome != null) {
                        result = false;
                        finished = true;
                    }
                } else if (!nome.equals(other.nome)) {
                    result = false;
                    finished = true;
                }
                if (!finished) {
                    if (numeroMatricula != other.numeroMatricula) {
                        result = false;
                    }
                }
            }
        }
        return result;
    }
}
