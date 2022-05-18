package br.com.principal.enumeracoes_composicoes;

import java.util.Date;

public class HourContract {

    //Atributos
    private Date date;
    private Double valuePerhour;
    private Integer hours;

    //Construtor padrao
    public HourContract(){
    }
    // //Construtor C/ argumentos


    public HourContract(Date date, Double valuePerhour, Integer hours) {
        this.date = date;
        this.valuePerhour = valuePerhour;
        this.hours = hours;
    }
    //Getters e Setters

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerhour() {
        return valuePerhour;
    }

    public void setValuePerhour(Double valuePerhour) {
        this.valuePerhour = valuePerhour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
}
