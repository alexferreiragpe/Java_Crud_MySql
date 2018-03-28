/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.Crud.DAO;

import com.alex.Crud.Model.Usuario;
import com.alex.Crud.ConexaoBanco.ConexaoMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    public void save(Usuario usuario) {

        String sql = "INSERT INTO user(UserName,Senha,Nome,Email,Celular,TelFixo,Cidade,Estado)" + "values(?,?,?,?,?,?,?,?)";
        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConexaoMySQL.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, usuario.getUserName());
            pstm.setString(2, usuario.getSenha());
            pstm.setString(3, usuario.getNome());
            pstm.setString(4, usuario.getEmail());
            pstm.setString(5, usuario.getCelular());
            pstm.setString(6, usuario.getTelFixo());
            pstm.setString(7, usuario.getCidade());
            pstm.setString(8, usuario.getEstado());
            pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                    System.out.println("Usuário Cadastrado com Sucesso!");
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
    }

    public void removeById(int id) {

        String sql = "DELETE from user where iduser=?";
        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConexaoMySQL.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    System.out.println("Usuário Excluído com Sucesso!");
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void update(Usuario usuario) {

        String sql = "UPDATE user SET UserName=?,Senha=?,Nome=?,Email=?,Celular=?,TelFixo=?,Cidade=?,Estado=?"
                + "where iduser=?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConexaoMySQL.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, usuario.getUserName());
            pstm.setString(2, usuario.getSenha());
            pstm.setString(3, usuario.getNome());
            pstm.setString(4, usuario.getEmail());
            pstm.setString(5, usuario.getCelular());
            pstm.setString(6, usuario.getTelFixo());
            pstm.setString(7, usuario.getCidade());
            pstm.setString(8, usuario.getEstado());
            pstm.setInt(9, usuario.getIdUser());
            pstm.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    System.out.println("Usuário Atualizado com Sucesso!");
                    pstm.close();
                }

                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public List<Usuario> getUsuarios() {

        String sql = "SELECT * FROM user";

        List<Usuario> usuarios = new ArrayList<Usuario>();

        Connection conn = null;
        PreparedStatement pstm = null;

        ResultSet rset = null;

        try {
            conn = ConexaoMySQL.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            rset = pstm.executeQuery();

            while (rset.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUser(rset.getInt("IdUser"));
                usuario.setUserName(rset.getString("UserName"));
                usuario.setNome(rset.getString("Nome"));
                usuario.setEmail(rset.getString("Email"));
                usuario.setCelular(rset.getString("Celular"));
                usuario.setTelFixo(rset.getString("TelFixo"));
                usuario.setCidade(rset.getString("Cidade"));
                usuario.setEstado(rset.getString("Estado"));

                usuarios.add(usuario);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rset != null) {
                    System.out.println("Usuários Listados com Sucesso!\n");
                    rset.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return usuarios;
    }

}
