package it.gr.fireball.listeners;

import java.io.InputStream;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;
import java.util.Properties;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


import it.gr.fireball.utils.HibernateUtil;


/**
 * Application Lifecycle Listener implementation class StartStopListener
 *
 */
@WebListener
public class StartStopListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public StartStopListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent evt)  { 
         // TODO Auto-generated method stub
    	
    	HibernateUtil.close();
    	
        Enumeration<Driver> drivers = DriverManager.getDrivers();
        while (drivers.hasMoreElements()) {
            Driver driver = drivers.nextElement();
            try {
                DriverManager.deregisterDriver(driver);
            } catch (Exception ex) {
                System.err.println(ex.getStackTrace());
            }

        }
    	
    	System.out.println("Stopping web application.");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent evt)  { 
         // TODO Auto-generated method stub
    	
    	try {
    		
    		InputStream input = StartStopListener.class.getClassLoader().getResourceAsStream("app.properties");
    		Properties app = new Properties();

            app.load(input);
    		
            evt.getServletContext().setAttribute("app", app);
            
//    		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//    		session.beginTransaction();
//    		Config config = (Config) session.createQuery("from Config").uniqueResult();
//    		session.getTransaction().commit();
//        
//    		evt.getServletContext().setAttribute("config", config);
        
    		System.out.println("Starting web application.");
        
    	} catch(Exception ex) {
    		ex.printStackTrace();
    	}

    }
	
}
