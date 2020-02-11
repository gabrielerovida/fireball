package it.gr.fireball.support;

import java.util.Locale;
import java.util.Properties;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;



public class ContextSupport {
	
	public static ServletContext context;
	public static ActionContext acontext;
	public static Properties app;

	static {
		try {
			context = ServletActionContext.getServletContext();
			acontext = ActionContext.getContext();
			app = (Properties) context.getAttribute("app");
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
	}
	
	
	public static Boolean isDebug() {
		if(app.getProperty("debug") == "1") {
			return true;
		} else {
			return false;
		}
	}
	
	public static void setLocaleIT() {
		acontext.setLocale(Locale.ITALY);
	}

	
	
}
