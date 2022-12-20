package Core.Entidades;

import java.util.Date;

public class Mensagem extends EntidadeBase {
	private Date DataEnvio;
	private String Texto;

	private int RemetenteId;
	private Usuario Rementente;

	private int DestinatarioId;
	private Usuario Destinatario;
	
	@Override
	public void ValidarEntidade() throws Exception {
		if(this.getTexto() == null) {
			throw new Exception("Texto está nulo");
		}
	}

	public Date getDataEnvio() {
		return DataEnvio;
	}

	public void setDataEnvio(Date dataEnvio) {
		DataEnvio = dataEnvio;
	}

	public String getTexto() {
		return Texto;
	}

	public void setTexto(String texto) {
		Texto = texto;
	}

	public int getRemetenteId() {
		return RemetenteId;
	}

	public void setRemetenteId(int remetenteId) {
		RemetenteId = remetenteId;
	}

	public Usuario getRementente() {
		return Rementente;
	}

	public void setRementente(Usuario rementente) {
		Rementente = rementente;
	}

	public int getDestinatarioId() {
		return DestinatarioId;
	}

	public void setDestinatarioId(int destinatarioId) {
		DestinatarioId = destinatarioId;
	}

	public Usuario getDestinatario() {
		return Destinatario;
	}

	public void setDestinatario(Usuario destinatario) {
		Destinatario = destinatario;
	}
}
