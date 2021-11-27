package ru.gb.lesson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

@SpringBootApplication
public class App extends SpringBootServletInitializer
{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
    {
        return application.sources(AppConfiguration.class);
    }

    public static void main(String[] args) throws Exception
    {
        SpringApplication application = new SpringApplication(App.class);
        application.setApplicationContextClass(AnnotationConfigWebApplicationContext.class);
        SpringApplication.run(App.class, args);
        System.out.println();
        System.out.println("           _..---...,\"\"-._     ,/}/)\n" +
                "        .''        ,      ``..'(/-<\n" +
                "       /   _      {      )         \\\n" +
                "      ;   _ `.     `.   <         a(\n" +
                "    ,'   ( \\  )      `.  \\ __.._ .: y\n" +
                "   (  <\\_-) )'-.____...\\  `._   //-'\n" +
                "    `. `-' /-._)))      `-._)))\n" +
                "      `...'         ");
    }
}
