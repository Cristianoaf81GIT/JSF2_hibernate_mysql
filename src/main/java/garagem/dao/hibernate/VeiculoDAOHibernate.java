package garagem.dao.hibernate;

import java.util.List;

import org.hibernate.Session;

import garagem.dao.*;
import garagem.entidades.Veiculo;

public class VeiculoDAOHibernate implements VeiculoDAO
{
	
	private Session sessao;
	
	
	public void setSession(Session sessao_hb) 
	{
		this.sessao =  sessao_hb;
	}

	@Override
	public void salvar(Veiculo veiculo) 
	{
		this.sessao.saveOrUpdate(veiculo);		
	}

		
	@Override
	public void excluir(Veiculo veiculo) {
		this.sessao.delete(veiculo);
		
	}

	@Override
	public List<Veiculo> listar() {
		return this.sessao.createQuery(
				"from Veiculo",Veiculo.class).list();
	}


}
