package Core.Entidades;

public class Ingresso extends EntidadeBase {
	private double Valor;

	private Evento Evento;
	private int EventoId;

	private Usuario Usuario;
	private int UsuarioId;

	private Pagamento Pagamento;
	private int PagamentoId;
	
	@Override
	public void ValidarEntidade() throws Exception {
		if(this.getValor() <= 0) {
			throw new Exception("O valor deve ser maior que zero");
		}
	}

	public double getValor() {
		return Valor;
	}

	public void setValor(double valor) {
		Valor = valor;
	}

	public Evento getEvento() {
		return Evento;
	}

	public void setEvento(Evento evento) {
		Evento = evento;
	}

	public int getEventoId() {
		return EventoId;
	}

	public void setEventoId(int eventoId) {
		EventoId = eventoId;
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

	public Pagamento getPagamento() {
		return Pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		Pagamento = pagamento;
	}

	public int getPagamentoId() {
		return PagamentoId;
	}

	public void setPagamentoId(int pagamentoId) {
		PagamentoId = pagamentoId;
	}
}