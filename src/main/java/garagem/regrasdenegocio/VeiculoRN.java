package garagem.regrasdenegocio;

import java.util.List;

import garagem.dao.VeiculoDAO;
import garagem.entidades.Veiculo;
import garagem.util.DAOFactory;

public class VeiculoRN {
	
	private VeiculoDAO veiculoDAO;
	
	public VeiculoRN()
	{
		veiculoDAO = DAOFactory.criarVeiculoDAO();
	}

	public void salvar(Veiculo veiculo)
	{
		this.veiculoDAO.salvar(veiculo);
	}
	
	public void excluir(Veiculo veiculo) {
		this.veiculoDAO.excluir(veiculo);
	}
	
	public List<Veiculo> listar(){
		return this.veiculoDAO.listar();
	}	
	
}
