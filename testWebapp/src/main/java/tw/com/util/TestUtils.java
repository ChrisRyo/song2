package tw.com.util;

import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * 
 * @author chrisryo
 *
 */
public class TestUtils {

	/**
	 * 取得bean
	 * 
	 * @param beanName 呼叫的bean
	 * @param interfaceClass 被呼叫的bean interface
	 * @return bean
	 * @throws NamingException
	 */
	public static Object getEJB(String beanName, Class<?> interfaceClass) throws NamingException {
		
		String interfaceClassPath = interfaceClass.getName();
		String jndiPath = "java:global//testWebapp/" + beanName + "!" + interfaceClassPath;
		
		System.out.print("jndiPath = " + jndiPath);
		
		InitialContext context = new InitialContext();
		
		Object bean =(Object)context.lookup(jndiPath);
		
		return bean;
		
	}
}
