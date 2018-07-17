package com.example.vivianbabiryekulumba.retrofit2example.service;

import com.example.vivianbabiryekulumba.retrofit2example.pojos.characters.CharacterData;
import com.example.vivianbabiryekulumba.retrofit2example.pojos.episodes.EpisodeData;
import com.example.vivianbabiryekulumba.retrofit2example.pojos.locations.LocationData;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by vivianbabiryekulumba on 7/11/18.
 */

public interface ApplicationNetworkService {

    @GET("character/")
    Observable<CharacterData> getCharacters(@Path("characters") String characters);

    @GET("location/")
    Observable<LocationData> getLocations(@Path("locations") String locations);

    @GET("episode/")
    Observable<EpisodeData> getEpisodes(@Path("episodes") String episodes);
}
