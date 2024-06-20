package dominio;

public class Curso extends Conteudo{
    private int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    } 

    @Override
    public String toString() {
        return "Título: " + getTitulo() + ", Descrição: " + getDescricao() + ", Carga Horária: " + cargaHoraria;
    }
      
}
