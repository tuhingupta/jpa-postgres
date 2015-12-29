/**
 * @author Tuhin Gupta
 */
package com.spring.jpa.postgres.test;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jpa.postgres.dao.CustomerDAO;
import com.spring.jpa.postgres.model.Customer;

/**
 * @author Tuhin Gupta
 *
 */
public class App {

/**
 * @param args
 */
	 public static void main(String[] args) {
	        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
	                "spring-jpa-context.xml");
	        CustomerDAO dao = context.getBean(CustomerDAO.class);
	 
	        
	        Customer cust = new Customer("John","1 Street","New York","NY","01234");
	        dao.save(cust);
	        
	        // Find Person by surname
	        List<Customer> custList = dao.findByZip("01234");
	        for (Iterator iterator = custList.iterator(); iterator.hasNext();) {
				Customer customer = (Customer) iterator.next();
				System.out.println("Find by zip : "  + customer.getId()+" "+customer.getAddr());
				
			}
	        
	 

	 
	        context.close();
	    }
}
