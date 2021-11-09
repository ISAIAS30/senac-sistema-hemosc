/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author adriana.gunther
 */
public class saidassangue {

    private int codigo;
    private String id_saida_sangue;
    private String id_entidade;
    private String id_tipo_sanguineo;
    private Date data;
    private String quantidade;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getid_saida_sangue() {
        return id_saida_sangue;
    }

    public void setid_saida_sangue(String id_saida_sangue) {
        this.id_saida_sangue = id_saida_sangue;
    }

    public String getid_entidade() {
        return id_entidade;
    }

    public void setid_entidade(String id_entidade) {
        this.id_entidade = id_entidade;
    }

    public String getid_tipo_sanguineo() {
        return id_tipo_sanguineo;
    }

    public void setid_tipo_sanguineo(String id_tipo_sanguineo) {
        this.id_tipo_sanguineo = id_tipo_sanguineo;
    }
 public Date getdata() {
        return data;
    }

    public void setdata(Date data) {
        this.data = data;
    }
     public String getquantidade() {
        return quantidade;
    }

    public void setquantidade(String quantidade) {
        this.quantidade = quantidade;
    }
}
