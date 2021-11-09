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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabriel
 */
public class ColaboradoresDao {
    
    public List<Colaboradores > listar(){
        Connection conn = ConexaoBanco.conectaBanco();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Colaboradores> Colaboradores = new ArrayList<>();
        
        try {
            stmt = conn.prepareStatement("SELECT * FROM colaboradores");
            
            rs = stmt.executeQuery();
        while (rs.next()) {
            Colaboradores c = new Colaboradores();
            c.setId_colaborador(rs.getInt("id_colaborador"));
            c.setId_cidade(rs.getInt("id_cidade"));
            c.setNome(rs.getString("nome"));
            c.setEndereco(rs.getString("endereco"));
            c.setFuncao(rs.getString("funcao"));
           
     
            Colaboradores.add(c);
            
        }
            
        } catch (SQLException ex) {
            Logger.getLogger(ColaboradoresDao.class.getName()).log(Level.SEVERE, null, ex);
        
        }
        return Colaboradores;
        }
    
    
    public void alterar(Colaboradores c) {

        Connection conn = ConexaoBanco.conectaBanco();

        PreparedStatement stmt = null;

        
        try {
            stmt = conn.prepareStatement("UPDATE colaboradores set  id_cidade = ?, nome = ?, endereco = ?, funcao = ? where id_colaborador = ?");
            stmt.setInt(1, c.getId_cidade());
            stmt.setString(2, c.getNome());
            stmt.setString(3, c.getEndereco());
            stmt.setString(4, c.getFuncao());            
            stmt.setInt(5, c.getId_colaborador());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Colaborador alterado com Sucesso!");
            
        } catch (SQLException ex) {
            Logger.getLogger(ColaboradoresDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
