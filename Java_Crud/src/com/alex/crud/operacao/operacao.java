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

    public static void main(String args[]) {
        UsuarioDAO usuarioDao = new UsuarioDAO();
        Usuario usuario = new Usuario();

        //Cria um Usuario e salva no banco//
        
        /*usuario.setUserName("alexferreira2");
        usuario.setSenha("90899");
        usuario.setNome("Alex Ferreiraa");
        usuario.setEmail("frisdfd14a1@uol.com.br");
        usuario.setCelular("19-99760-9890");
        usuario.setTelFixo("19-3789-7689");
        usuario.setCidade("Guaxupé");
        usuario.setEstado("MG");
        usuarioDao.save(usuario);*/

        //Remove o Usuario com idUser=//
        
        //usuarioDao.removeById(27);
        
        //Atualiza o Usuario com id = "" com os dados do objeto user//    
        
        Usuario user = new Usuario();
        user.setIdUser(31);
        user.setUserName("teste");
        user.setSenha("90d899");
        user.setNome("Cristina");
        user.setEmail("cristina@uol.com.br");
        user.setCelular("19-99760-9890");
        user.setTelFixo("19-3789-7689");
        user.setCidade("Guaxupé");
        user.setEstado("MG");                
        usuarioDao.update(user);
         
        
        //Lista todos os contatos do banco de dados//
        for (Usuario u : usuarioDao.getUsuarios()) {
            System.out.println("Usuário -->  " + u.getUserName());
        }

    }

}
