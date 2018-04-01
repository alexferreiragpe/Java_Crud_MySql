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
        
      /*  usuario.setUserName("alexferreira");
        usuario.setSenha("12345");
        usuario.setNome("Alex Ferreira");
        usuario.setEmail("alexferreira@hotmail.com.br");
        usuario.setCelular("19-98803-0727");
        usuario.setTelFixo("19-8803-0727");
        usuario.setCidade("Campinas");
        usuario.setEstado("SP");
        usuario.setDataCadastro(new Date());
        usuarioDao.save(usuario);*/

        //Remove o Usuario com idUser=
        
        //usuarioDao.removeById(35);
        
        //Atualiza o Usuario com id = "" com os dados do objeto user//    
        
      /* Usuario user = new Usuario();
        user.setIdUser(35);
        user.setUserName("analic");
        user.setSenha("90d899");
        user.setNome("analic");
        user.setEmail("analic@uol.com.brxxx");
        user.setCelular("80-99999");
        user.setTelFixo("19-3789-7689");
        user.setCidade("Guaxupé");
        user.setEstado("MG");  
        user.setDataCadastro(new Date());
        usuarioDao.update(user);*/
         
        
        //Lista todos os contatos do banco de dados//
        for (Usuario u : usuarioDao.getUsuarios()) {
            System.out.println("Usuário -->  " + u.getUserName());
            ///System.out.println("DataCadastro -->  " + u.getDataCadastro());
        }

    }

}
