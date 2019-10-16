package garagem.dao;

import garagem.entidades.Veiculo;

public interface VeiculoDAO {
	public void salvar(Veiculo veiculo);
	public void excluir(Veiculo veiculo);
	public java.util.List<Veiculo> listar();

}
