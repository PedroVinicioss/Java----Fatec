package Core.Services;

import Core.Entidades.EntidadeBase;

public class ServicoBase {
	protected void ValidarEntidade(EntidadeBase entidade) throws Exception {
		entidade.ValidarEntidade();
	}
}
