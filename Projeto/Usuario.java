package Core.Entidades;

import java.util.ArrayList;

public class Usuario extends EntidadeBase {
	private String Nome;
	private String Email;
	private String Senha;
	private UsuarioTipoEnum TipoUsuario;

	private ArrayList<Bar> Bares;
	private ArrayList<Endereco> Enderecos;
	private ArrayList<Evento> Eventos;
	private ArrayList<Mensagem> Mensagens;

	@Override
	public void ValidarEntidade() throws Exception {
		if(this.getNome() == null) {
			throw new Exception("Nome está nulo");
		}
	}
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}

	public UsuarioTipoEnum getTipoUsuario() {
		return TipoUsuario;
	}

	public void setTipoUsuario(UsuarioTipoEnum tipoUsuario) {
		TipoUsuario = tipoUsuario;
	}

	public ArrayList<Bar> getBares() {
		return Bares;
	}

	public void setBares(ArrayList<Bar> bares) {
		Bares = bares;
	}

	public ArrayList<Endereco> getEnderecos() {
		return Enderecos;
	}

	public void setEnderecos(ArrayList<Endereco> enderecos) {
		Enderecos = enderecos;
	}

	public ArrayList<Evento> getEventos() {
		return Eventos;
	}

	public void setEventos(ArrayList<Evento> eventos) {
		Eventos = eventos;
	}

	public ArrayList<Mensagem> getMensagens() {
		return Mensagens;
	}

	public void setMensagens(ArrayList<Mensagem> mensagens) {
		Mensagens = mensagens;
	}
}
