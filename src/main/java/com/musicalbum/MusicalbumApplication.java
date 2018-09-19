package com.musicalbum;

import com.musicalbum.music.config.SpringApplicationContextInitializer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MusicalbumApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        new SpringApplicationBuilder(MusicalbumApplication.class).
                initializers(new SpringApplicationContextInitializer())
                .application()
                .run(args);
    }
    
}