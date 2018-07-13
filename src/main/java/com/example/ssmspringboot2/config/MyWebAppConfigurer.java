package com.example.ssmspringboot2.config;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurationSupport {
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/api/media/sprites/pokemon/**").addResourceLocations("classpath:/static/media/sprites/pokemon/");
        registry.addResourceHandler("/api/media/sprites/pokemon/back/**").addResourceLocations("classpath:/static/media/sprites/pokemon/back/");
        registry.addResourceHandler("/api/media/sprites/pokemon/back/female/**").addResourceLocations("classpath:/static/media/sprites/pokemon/back/female/");
        registry.addResourceHandler("/api/media/sprites/pokemon/back/shiny/female/**").addResourceLocations("classpath:/static/media/sprites/pokemon/back/shiny/female/");
        registry.addResourceHandler("/api/media/sprites/pokemon/back/shiny/**").addResourceLocations("classpath:/static/media/sprites/pokemon/back/shiny/");
        registry.addResourceHandler("/api/media/sprites/pokemon/female/**").addResourceLocations("classpath:/static/media/sprites/pokemon/female/");
        registry.addResourceHandler("/api/media/sprites/pokemon/shiny/**").addResourceLocations("classpath:/static/media/sprites/pokemon/shiny/");
        registry.addResourceHandler("/api/media/sprites/pokemon/shiny/female/**").addResourceLocations("classpath:/static/media/sprites/pokemon/shiny/female/");
        registry.addResourceHandler("/api/media/sprites/items/**").addResourceLocations("classpath:/static/media/sprites/items/");
        super.addResourceHandlers(registry);
    }
}
