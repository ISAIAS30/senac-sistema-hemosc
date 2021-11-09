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
public class Doacoes {

    private int codigo;
    private String id_doaçao;
    private Date data;
    private String id_doador;
    private String id_tipo_sanguineo;
    private String id_colaborador;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getid_doaçao() {
        return id_doaçao;
    }

    public void setid_doaçao(String id_doaçao) {
        this.id_doaçao = id_doaçao;
    }

    public Date getdata() {
        return data;
    }

    public void setdata(Date data) {
        this.data = data;
    }

    public String getid_doador() {
        return id_doador;
    }

    public void setid_doador(String id_doador) {
        this.id_doador = id_doador;
    }

    public String getid_tipo_sanguineo() {
        return id_tipo_sanguineo;
    }

    public void setid_tipo_sanguineo(String id_tipo_sanguineo) {
        this.id_tipo_sanguineo = id_tipo_sanguineo;
    }

    public String getid_colaborador() {
        return id_colaborador;
    }

    public void setid_colaborador(String id_colaborador) {
        this.id_colaborador = id_colaborador;
    }

}
