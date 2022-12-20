package Core.Entidades;

import java.util.Date;

public class Pagamento extends EntidadeBase {
	private Date DataPagamento;

	private Ingresso Ingresso;
	private int IngressoId;
	
	@Override
	public void ValidarEntidade() throws Exception {
		if(this.getDataPagamento() == null) {
			throw new Exception("Data pagamento está nulo");
		}
	}

	public Date getDataPagamento() {
		return DataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		DataPagamento = dataPagamento;
	}

	public Ingresso getIngresso() {
		return Ingresso;
	}

	public void setIngresso(Ingresso ingresso) {
		Ingresso = ingresso;
	}

	public int getIngressoId() {
		return IngressoId;
	}

	public void setIngressoId(int ingressoId) {
		IngressoId = ingressoId;
	}
}