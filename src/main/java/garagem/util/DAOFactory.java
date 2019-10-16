package garagem.util;

import garagem.dao.VeiculoDAO;
import garagem.dao.hibernate.VeiculoDAOHibernate;

public class DAOFactory {
	
	public static VeiculoDAO criarVeiculoDAO(){
		VeiculoDAOHibernate veiculoDH = new VeiculoDAOHibernate();
		veiculoDH.setSession(HibernateUtil.getSessionfactory().getCurrentSession());
		return veiculoDH;
	}

}
