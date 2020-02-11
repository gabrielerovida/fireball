package it.gr.fireball.utils;

import java.io.InputStream;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import it.gr.fireball.listeners.StartStopListener;

 
public class HibernateUtil {
 
    private static final SessionFactory sessionFactory = buildSessionFactory();
 
    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
        	
        	InputStream input = StartStopListener.class.getClassLoader().getResourceAsStream("app.properties");
        	Properties app = new Properties();
            app.load(input);
            
        	Properties HBR_PROPS = new Properties();
        	HBR_PROPS.put("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
        	if(Long.parseLong(app.getProperty("published")) == 1) {
        		HBR_PROPS.put("hibernate.connection.url", app.getProperty("db_hostname_prod") + app.getProperty("db_schema_prod"));
        		HBR_PROPS.put("hibernate.connection.username", app.getProperty("db_username_prod"));
            	HBR_PROPS.put("hibernate.connection.password", app.getProperty("db_password_prod"));
        	} else {
        		HBR_PROPS.put("hibernate.connection.url", app.getProperty("db_hostname_devel") + app.getProperty("db_schema_devel"));
        		HBR_PROPS.put("hibernate.connection.username", app.getProperty("db_username_devel"));
            	HBR_PROPS.put("hibernate.connection.password", app.getProperty("db_password_devel"));
        	}
        	HBR_PROPS.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        	HBR_PROPS.put("hibernate.c3p0.min_size", "5");
        	HBR_PROPS.put("hibernate.c3p0.max_size", "200");
        	HBR_PROPS.put("hibernate.c3p0.timeout", "180");
        	HBR_PROPS.put("hibernate.c3p0.max_statements", "50");
        	HBR_PROPS.put("hibernate.current_session_context_class", "thread");
        	HBR_PROPS.put("hibernate.cache.provider_class", "org.hibernate.cache.NoCacheProvider");
        	HBR_PROPS.put("hibernate.show_sql", "true");
        	HBR_PROPS.put("javax.persistence.validation.mode", "none");
        	
        	Configuration cfg = new Configuration().configure();
        	cfg.setProperties(HBR_PROPS);
            return cfg.buildSessionFactory();
        }
        catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    public static void close() {
    	sessionFactory.close();
    }
 
}