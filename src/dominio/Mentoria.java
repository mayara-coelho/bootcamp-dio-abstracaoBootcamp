package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;
    
    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.data = data;
    }

    @Override
    public double calcularXp() {
       return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "Título: " + getTitulo() + ", Descrição: " + getDescricao() + ", Data: " + data;
    }
}

