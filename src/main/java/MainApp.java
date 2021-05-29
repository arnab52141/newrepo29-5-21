

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

/**
 * Hello world!
 *
 */
@SuppressWarnings("deprecation")
public class MainApp {
	public static void main(String[] args) {
		// System.out.println( "Hello World!" );
		Resource r = new ClassPathResource("applicationContext.xml");

		BeanFactory factory = new XmlBeanFactory(r);

		Employee emp = (Employee)factory.getBean("e");
		emp.setMarks(25);
		new Employee("Arnab",10);
		emp.show();
         
		Email email = (Email)factory.getBean("mail");
		email.sendMail();
		email.recieveMail();
	}
}
