package veiculos;

import org.hibernate.Session;
import org.junit.jupiter.api.Test;

import garagem.entidades.Veiculo;
import garagem.util.HibernateUtil;

class TestaHibernate {

	@Test
	void test() {
		Session session = HibernateUtil.getSessionfactory().openSession();
		System.out.println(session.getProperties().toString());
		System.out.println(session.isConnected());
		System.out.println(session.getStatistics());
		Veiculo veiculo = new Veiculo();
		veiculo.setId_veiculo(11);
		veiculo.setFabricacao_veiculo("11/01/1981");
		veiculo.setMarca_veiculo("Wolksvagen");
		veiculo.setPreco("12.888,07");
		veiculo.setTipo_veiculo("passeio");
		
		//session.getTransaction().begin();
		//session.getTransaction().commit();
		if(session.isConnected())
			session.close();
	}

}
