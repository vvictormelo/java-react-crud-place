package br.com.vvictormelo.crudplace.domain;

import reactor.core.publisher.Mono;

public class PlaceService {
    
    public PlaceRepository placeRepository;

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    public Mono<Place> create(Place place) {
        return placeRepository.save(place);
    }
}
