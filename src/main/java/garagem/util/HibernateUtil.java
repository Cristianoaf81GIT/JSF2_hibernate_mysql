package garagem.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil 
{

		private static final SessionFactory sessionFactory = sessionFactoryBuilder();
		
		private static SessionFactory sessionFactoryBuilder()
		{
			try {
				ServiceRegistry service = new StandardServiceRegistryBuilder()
						.configure("hibernate.cfg.xml")
						.build();
				Metadata metadata = new MetadataSources(service)
						.getMetadataBuilder()
						.build();
				return metadata.getSessionFactoryBuilder().build();
			}catch(Throwable t) {
				System.out.println(
						"Falha na criação da session factory -> "+t.getMessage());
				throw new ExceptionInInitializerError(t);
			}			
		}

		public static SessionFactory getSessionfactory() {
			return sessionFactory;
		}
		
		
}
