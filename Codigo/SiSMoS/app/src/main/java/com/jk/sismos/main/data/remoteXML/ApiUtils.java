package com.jk.sismos.main.data.remoteXML;

public class ApiUtils {

    public static final String BASE_URL = "http://contenidos.inpres.gov.ar/";

    private ApiUtils() {
    }

    public static APIService getAPIService() {

        return RetrofitXMLClient.getClient(BASE_URL).create(APIService.class);
    }
}