package com.media.client;

import net.minidev.json.JSONObject;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class CallRestService implements CommandLineRunner {

    public static void callRestService(){
        RestTemplate restTemplate= new RestTemplate();
        JSONObject response = restTemplate.getForObject("https://api.themoviedb.org/3/search/company?api_key=433d425daefdff55eeb180ec5abfa479&query=Titanic", JSONObject.class);

        try {
            System.out.println("Response: "+response.toJSONString());
            List<Map> list = (ArrayList) response.get("results");
            for(Map l : list) {
                Map<String, String> resultsMap = l;
                System.out.println("Name: "+l.get("name"));
                System.out.println("Origin Country: "+l.get("origin_country"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
