package Core.Entidades;

public class Endereco {
	private String Rua;
	private String Cidade;
	private String Estado;
	private String Numero;
	private String Bairro;
	
	private Usuario Usuario;
	private int UsuarioId;
	
	public String getRua() {
		return Rua;
	}
	public void setRua(String rua) {
		Rua = rua;
	}
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public String getNumero() {
		return Numero;
	}
	public void setNumero(String numero) {
		Numero = numero;
	}
	public String getBairro() {
		return Bairro;
	}
	public void setBairro(String bairro) {
		Bairro = bairro;
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
