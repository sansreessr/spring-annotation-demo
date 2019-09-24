package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean is in afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean destroys now");
    }

    public void customInit() {
        System.out.println("Bean is in customInit");
    }

    public void customDestroy() {
        System.out.println("Bean destroys; from customDestroy");
    }
}
