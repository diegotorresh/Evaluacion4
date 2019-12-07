package com.dtorres.evaluacionapp.Services;

import com.dtorres.evaluacionapp.Modelo.Mascota;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    String API_BASE_URL = "http://10.0.2.2:8080";

    @GET("/mascotas")
    Call<List<Mascota>> getMascota();

}
