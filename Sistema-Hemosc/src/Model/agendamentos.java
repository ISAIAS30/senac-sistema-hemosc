/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author adriana.gunther
 */
public class agendamentos {
 private int codigo;
    private String id_agendamento;
    private Date data;
    private Time hora;
 private String id_doador;
 
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getid_agendamento() {
        return id_agendamento;
    }

    public void setid_agendamento(String id_agendamento) {
        this.id_agendamento = id_agendamento;
    }

    public Date getdata() {
        return data;
    }

    public void setdata(Date data) {
        this.data = data;
    }

    public Time gethora() {
        return hora;
    }

    public void sethora(Time hora) {
        this.hora = hora;
    }
     public String id_doador () {
        return id_doador;
    }

    public void setid_doador(String id_doador) {
        this.id_doador = id_doador;
    }
    
   
}
