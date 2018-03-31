package com.alex.crud.operacao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.alex.Crud.DAO.UsuarioDAO;
import com.alex.Crud.Model.Usuario;
import java.util.Date;

/**
 *
 * @author alexferreira
 */
public class operacao {

    public static void main(String args[]) {
        UsuarioDAO usuarioDao = new UsuarioDAO();
        Usuario usuario = new Usuario();

        //Cria um Usuario e salva no banco//
        
       /* usuario.setUserName("aaaaaa");
        usuario.setSenha("908d99");
        usuario.setNome("aaaaaaaaaaaaaLoredfdfdfna");
        usuario.setEmail("aaaaaaaaaafrisadfddfd14aa1@uol.com.br");
        usuario.setCelular("aaa19-993760-9080");
        usuario.setTelFixo("19-3789-7689");
        usuario.setCidade("Guaxupé");
        usuario.setEstado("MG");
        usuario.setDataCadastro(new Date());
        usuarioDao.save(usuario);*/

        //Remove o Usuario com idUser=//
        
        //usuarioDao.removeById(27);
        
        //Atualiza o Usuario com id = "" com os dados do objeto user//    
        
        Usuario user = new Usuario();
        user.setIdUser(1);
        user.setUserName("5aaaaaa");
        user.setSenha("90d899");
        user.setNome("ca");
        user.setEmail("@uol.com.brxxx");
        user.setCelular("0-9890xxx");
        user.setTelFixo("19-3789-7689");
        user.setCidade("Guaxupé");
        user.setEstado("MG");  
        user.setDataCadastro(new Date());
        usuarioDao.update(user);
         
        
        //Lista todos os contatos do banco de dados//
        for (Usuario u : usuarioDao.getUsuarios()) {
            System.out.println("Usuário -->  " + u.getUserName());
            System.out.println("DataCadastro -->  " + u.getDataCadastro());
        }

    }

}
