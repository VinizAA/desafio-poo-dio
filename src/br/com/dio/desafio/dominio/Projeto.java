package br.com.dio.desafio.dominio;

public class Projeto extends Conteudo {
    
    private double nota;

    public Projeto() {}

    public Projeto(String titulo, String descricao, double nota) {
        super.setTitulo(titulo);
        super.setDescricao(descricao);
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public double calcularXp() {
        return 10 * nota;
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", nota=" + nota +
                '}';
    }
}
