/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.Crud.DAO;
import com.alex.Crud.DAO.UsuarioDAO;
import com.alex.Crud.Model.Usuario;
import com.alex.crud.ConexaoBanco.ConexaoMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class UsuarioDAO {
    
    public void save(Usuario usuario){
        String sql="INSERT INTO user(UserName,Senha,Nome,Email,Celular,TelFixo,Cidade,Estado)" +"values(?,?,?,?,?,?,?,?)";
        Connection conn=null;
        PreparedStatement pstm=null;
        
        try {
            conn=ConexaoMySQL.createConnectionToMySQL();
            pstm=conn.prepareStatement(sql);
            
            pstm.setString(1,usuario.getUserName());
            pstm.setString(2,usuario.getSenha());
            pstm.setString(3,usuario.getNome());
            pstm.setString(4,usuario.getEmail());
            pstm.setString(5,usuario.getCelular());
            pstm.setString(6,usuario.getTelFixo());
            pstm.setString(7,usuario.getCidade());
            pstm.setString(8,usuario.getEstado());
            pstm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(pstm!=null){
                    pstm.close();
                    System.out.println("Usuário Cadastrado com Sucesso!");
                }
                if(conn!=null){
                    conn.close();   
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
