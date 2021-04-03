package com.webapp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.webapp.bean.*;

public class AppTest {
	
	public static void main(String[] args) {
	
	//tightly coupled
//	Employee emp = new Employee();
//	emp.setEmpid(1);
//	emp.setName("Frank");
//	emp.setDept("Mech");
//	emp.setSalary(20000);
//	
//	System.out.println(emp);
		
// 	1.Application Context container type : loads bean at startup time
//	ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
//	Employee emp1= (Employee) context.getBean("emp1");
//	System.out.println(emp1);
//	}
	
// 2.Bean Factory Container : it loads based on requirement
	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("appContext.xml"));
	
	Employee employee = (Employee) factory.getBean("emp2");
	System.out.println(employee);
	}
}
