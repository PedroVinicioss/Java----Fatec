package Core;

import Core.Entidades.Usuario;
import Core.Entidades.UsuarioTipoEnum;
import Core.Services.*;

public class Program {
	public static void main(String[] args) throws Exception {

		UsuarioServico _usuarioServico = new UsuarioServico();

		Usuario usuario = new Usuario();
		usuario.setId(2);
		usuario.setNome("Zeh");
		usuario.setEmail("ze@hotmail.com");
		usuario.setSenha("12345678");
		usuario.setTipoUsuario(UsuarioTipoEnum.Administrador);

		try {
			_usuarioServico.CadastrarUsuario(usuario);
		} catch (Exception ex) {
			System.out.print("Encerrando o sistema com o erro:" + ex.getMessage());
		}
	}
}
