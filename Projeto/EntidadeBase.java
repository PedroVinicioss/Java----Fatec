package Core.Entidades;

public abstract class EntidadeBase {
	private int Id;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
	
	public abstract void ValidarEntidade() throws Exception;
}
