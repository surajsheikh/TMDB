package com.media.client;

import com.media.MoviesAttributes.Page;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CallRestService implements CommandLineRunner {

    private static void callRestService(){
//        Below 2 lines can be used anywhere to consume the o/p of Rest web service and get the results
        RestTemplate restTemplate= new RestTemplate();
        Page page = restTemplate.getForObject("https://api.themoviedb.org/3/search/company?api_key=433d425daefdff55eeb180ec5abfa479&query=Titanic",Page.class);
        System.out.println("Movie Name: "+page.getName());
    }

//    After the Spring Boot App starts up and it's done creating all the spring beans and
//    creating the application context, it will call all the run methods implemented by CommandLineRunner

    @Override
    public void run(String... args) throws Exception {

    }
}
