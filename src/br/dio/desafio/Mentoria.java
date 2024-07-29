package br.dio.desafio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;
    


    public Mentoria(){
        super();
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }
   
    public String toString(){
        return "Mentoria: título "+ getTitulo()+" descrição "+ getDescricao(); 
    }
}
