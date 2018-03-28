package com.alex.crud.operacao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.alex.Crud.DAO.UsuarioDAO;
import com.alex.Crud.Model.Usuario;

/**
 *
 * @author alexferreira
 */
public class operacao {
    
    
    public static void main(String args[]){
        UsuarioDAO usuarioDao=new UsuarioDAO();
        Usuario usuario=new Usuario();
     
        
        
        usuario.setUserName("dfd");
        usuario.setSenha("90899");
        usuario.setNome("Gadnodfd");
        usuario.setEmail("cdfsdfdasdfrisdfd141@uol.com.br");
        usuario.setCelular("19-99760-9890");
        usuario.setTelFixo("19-3789-7689");
        usuario.setCidade("Guaxupé");
        usuario.setEstado("MG");
        usuarioDao.save(usuario);
        
        usuarioDao.removeById(27);
    }
   
}
