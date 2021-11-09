/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_DAO;

import Database.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Model.Colaboradores;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabriel
 */
public class ColaboradoresDao {
    
    public void cadastrar(Colaboradores c) {

        Connection conn = ConexaoBanco.conectaBanco();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

       try{
       stmt = conn.prepareStatement("INSERT INTO colaborador (id_cidade,nome,endereco,funcao) VALUES (?,?,?,?)");
       stmt.setInt(1,c.getId_cidade());
       stmt.setString(2,c.getNome());
       stmt.setString(3,c.getEndereco());
       stmt.setString(4,c.getFuncao());
       
       
       stmt.executeUpdate();
       
           JOptionPane.showMessageDialog(null,"Colaborador cadastrado com sucesso!");
       
       } catch (SQLException ex) {
       
       }
    
    
    }
    
    
    
}
