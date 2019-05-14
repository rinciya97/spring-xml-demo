package com.stackroute.spring;
import com.stackroute.spring.domain.Actor;
import com.stackroute.spring.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
public class Main {
    public static void main(String[] args) {
        // Task-1 using Application context
        ApplicationContext bean=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie =(Movie)bean.getBean("bean-1");
        System.out.println(movie.getActor1());
        // Task-1 using XmlBeanFactory
        XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("beans.xml"));
        Movie movie1=(Movie)factory.getBean("bean-2");
        System.out.println(movie1.getActor1());
    }
}
