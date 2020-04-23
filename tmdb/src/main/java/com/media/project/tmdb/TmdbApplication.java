package com.media.project.tmdb;

import com.media.client.CallRestService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import static com.media.client.CallRestService.callRestService;

@SpringBootApplication
@Component("com.media.client")
public class TmdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(TmdbApplication.class, args);
		callRestService();
	}

}
