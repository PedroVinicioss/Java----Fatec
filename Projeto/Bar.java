package Core.Entidades;
 
public class Bar extends EntidadeBase {
	private String Nome;
	
	private Usuario Dono;
	private int DonoId;
	
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

	public Usuario getDono() {
		return Dono;
	}

	public void setDono(Usuario dono) {
		Dono = dono;
	}

	public int getDonoId() {
		return DonoId;
	}

	public void setDonoId(int donoId) {
		DonoId = donoId;
	} 
}
