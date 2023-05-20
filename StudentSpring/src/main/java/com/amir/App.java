package com.amir;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
       StudentSpring s1= (StudentSpring)ctx.getBean("id1");
      s1.print();
    }
}
