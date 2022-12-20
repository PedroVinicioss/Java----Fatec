package Core.Entidades;

import java.util.ArrayList;
import java.util.Date;

public class Evento extends EntidadeBase {
	private String Nome;
	private String Descricao;
	private Date Data;
	private Byte[] Imagem;
	private ArrayList<Ingresso> Ingressos;

	private Usuario Usuario;
	private int UsuarioId;
	
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

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public Date getData() {
		return Data;
	}

	public void setData(Date data) {
		Data = data;
	}

	public Byte[] getImagem() {
		return Imagem;
	}

	public void setImagem(Byte[] imagem) {
		Imagem = imagem;
	}

	public ArrayList<Ingresso> getIngressos() {
		return Ingressos;
	}

	public void setIngressos(ArrayList<Ingresso> ingressos) {
		Ingressos = ingressos;
	}

	public Usuario getUsuario() {
		return Usuario;
	}

	public void setUsuario(Usuario usuario) {
		Usuario = usuario;
	}

	public int getUsuarioId() {
		return UsuarioId;
	}

	public void setUsuarioId(int usuarioId) {
		UsuarioId = usuarioId;
	}
}
