package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Actor actor() {
        Actor actor = new Actor("Sreenath", "Male", 23);
        return actor;
    }

    @Bean
    public Movie movie() {
        return new Movie();
    }
}
