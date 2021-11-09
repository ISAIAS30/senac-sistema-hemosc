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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author marcelo.nascimento1
 */
public class AgendamentosDao {
    
    public void excluir(Agendamentos agenda){
        
        Connection conn = ConexaoBanco.conectaBanco();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = conn.prepareStatement("DELETE FROM agendamento where id_agendamento = ? ");          
            stmt.setInt(1, agenda.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Agendamento Excluido com Sucesso!");
                    
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao Excluir! Tente novamente mais tarde!");
            Logger.getLogger(AgendamentosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
