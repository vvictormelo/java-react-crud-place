package br.com.vvictormelo.crudplace.config;

import br.com.vvictormelo.crudplace.domain.PlaceRepository;
import br.com.vvictormelo.crudplace.domain.PlaceService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlaceConfig {
    
    @Bean
    PlaceService placeService(PlaceRepository placeRepository){
        return new PlaceService(placeRepository);
    }

}
