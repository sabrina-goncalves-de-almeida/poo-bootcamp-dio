package br.dio.desafio;

public class Curso extends Conteudo{
 
    private int cargaHoraria;

    public Curso(){
        super();
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    public String toString(){
        return "Mentoria: título "+ getTitulo()+" descrição "+ getDescricao()+"carga horaria" + getCargaHoraria(); 
    }
    
}
