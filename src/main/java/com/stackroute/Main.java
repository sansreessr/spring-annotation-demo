package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;

@ComponentScan(basePackages = "com.stackroute")

public class Main
{
    public static void main( String[] args ) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ((AbstractApplicationContext)context).registerShutdownHook();
        Movie movie = context.getBean("myMovie", Movie.class);
    }
}
