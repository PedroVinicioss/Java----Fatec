package Core.Services;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import Core.Entidades.Usuario;

public class UsuarioServico extends ServicoBase {

	public UsuarioServico() throws Exception {
		CriarArquivo();
	}

	public void CadastrarUsuario(Usuario usuario) throws Exception {
		try {
			if (usuario == null)
				throw new Exception("Objecto usuario null");

			this.ValidarEntidade(usuario);
			this.Salvar(usuario);
		} catch (Exception e) {
			throw e;
		}
	}

	private void Salvar(Usuario entidade) throws IOException {
		List<Usuario> entidades = Entidades();
		entidades.add(entidade);

		ObjectMapper objectMapper = new ObjectMapper();

		String entidadesJson = objectMapper.writeValueAsString(entidades);

		EscreverArquivo(CaminhoArquivo(), entidadesJson);
	}

	private List<Usuario> Entidades() throws IOException {
		File file = new File(CaminhoArquivo());
		String entidadesJson = file.exists() ? LerArquivo(CaminhoArquivo()) : "";

		if (entidadesJson == null || entidadesJson.trim().isEmpty())
			return new ArrayList<Usuario>();

		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.readValue(entidadesJson, new TypeReference<List<Usuario>>() {
		});
	}

	private void CriarArquivo() throws Exception {
		File file = new File(CaminhoArquivo());

		if (file.exists())
			return;

		CriarDiretorio(file.getParent());
	}

	private void CriarDiretorio(String caminho) throws IOException {
		Files.createDirectories(Paths.get(caminho));
	}

	private String CaminhoArquivo() {
		return "E:\\QueroBar\\\\Entidades\\usuario.json";
	}

	private String LerArquivo(String caminho) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(caminho));
		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			return sb.toString();
		} finally {
			br.close();
		}
	}

	private void EscreverArquivo(String caminho, String texto) throws IOException {
		try {
			FileWriter myWriter = new FileWriter(caminho);
			myWriter.write(texto);
			myWriter.close();
		} catch (IOException e) {
			throw e;
		}
	}
}
