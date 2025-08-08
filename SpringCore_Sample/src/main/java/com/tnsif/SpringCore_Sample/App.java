package com.tnsif.SpringCore_Sample;

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
        System.out.println( "Hello World!" );
        ApplicationContext var=new ClassPathXmlApplicationContext("applicationcontext.xml");
        College c1=var.getBean("smvec",College.class);
        c1.display();
        
        College c2=var.getBean("mvit",College.class);
        c2.display();
        
    }
}
