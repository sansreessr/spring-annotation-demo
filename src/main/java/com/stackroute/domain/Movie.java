package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {

    private Actor actor;
    private ApplicationContext context = null;
    private BeanFactory factory =null;
    private String name = "";

    @Autowired
    public Movie(Actor actor) {
        this.actor = actor;
    }

    @Autowired
    @Qualifier("actor3")
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context = context;
        System.out.println("Actor info from Movie class using ApplicationContextAware: " + factory.getBean("actor1"));
    }

    @Override
    public void setBeanFactory(BeanFactory factory) throws BeansException {
        this.factory = factory;
        System.out.println("Actor info from Movie class using BeanFactoryAware: " + factory.getBean("actor1"));
    }

    @Override
    public void setBeanName(String s) {
        this.name = s;
        System.out.println("Bean name using BeanNameAware: " + s);
    }
}
