package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    public Actor actor1() {
        Actor actor1 = new Actor("Sreenath", "Male", 23);
        return actor1;
    }

    @Bean
    public Actor actor2() {
        Actor actor2 = new Actor("Febin", "Female", 21);
        return actor2;
    }

    @Bean
    public Actor actor3() {
        Actor actor3 = new Actor("Jerwin", "Male", 22);
        return actor3;
    }

    @Bean(name = {"cinema", "myMovie"})
    @Scope("prototype")
    public Movie getMovie() {
        return new Movie(actor2());
    }
}
