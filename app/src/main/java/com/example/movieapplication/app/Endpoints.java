package com.example.movieapplication.app;

public class Endpoints {

//    private static final String URL_CATEGORY = "category";
//    private static final String URL_PRODUCT = "products";
//    private static final String URL_REGISTER = "auth/register";
//    private static final String URL_SUBCATEGORY = "subcategory/";
    private static final String API_KEY = "1ac708dc9f83534a8053382fcb036d82";
    private static final String ACCESS_TOKEN = "eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIxYWM3MDhkYzlmODM1MzRhODA1MzM4MmZjYjAzNmQ4MiIsInN1YiI6IjYwMTU2YzAzZGQ3MzFiMDAzZDU2Y2JkYiIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.tY-IxgcpQ36AXVAf-iSF68WEipV4zas30LBdhWHlPog";
//    public static String getCategory() {
//        return Config.BASE_URL + URL_CATEGORY;
//    }
//
//    public static String getAllProducts() {
//        return Config.BASE_URL + URL_PRODUCT;
//    }
//
//    public static String register() {
//        return Config.BASE_URL + URL_REGISTER;
//    }
//
//    public static String getAllSubcategory(){  return Config.BASE_URL + URL_SUBCATEGORY;  }


    public static String getApiKey() {
        return API_KEY;
    }

    public static String getAccessToken() {
        return ACCESS_TOKEN;
    }

    public static String getMovies()
    {
        return Config.BASE_URL+API_KEY;
    }
}
