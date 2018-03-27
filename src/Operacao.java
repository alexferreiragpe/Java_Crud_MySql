
import com.alex.Crud.DAO.UsuarioDAO;
import com.alex.Crud.Model.Usuario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexf
 */
public class Operacao {
    
    public static void main(String args[]){
        
        UsuarioDAO usuarioDao=new UsuarioDAO();
        Usuario usuario=new Usuario();
        
        usuario.setUserName("cristina");
        usuario.setSenha("90899");
        usuario.setNome("Cristina Marques");
        usuario.setEmail("cris_marques@uol.com.br");
        usuario.setCelular("19-99760-9890");
        usuario.setTelFixo("19-3789-7689");
        usuario.setCidade("Guaranésia");
        usuario.setEstado("MG");
        usuarioDao.save(usuario);
    }
    
}
