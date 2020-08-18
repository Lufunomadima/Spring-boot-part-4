package com.funie.springboot4.wsdl;

public interface CountriesPort {
    /**
     *
     * @param getCountryRequest
     * @return
     *     returns com.example.producingwebservice.wsdl.GetCountryResponse
     */
    public GetCountryResponse getCountry(
            GetCountryRequest getCountryRequest);

}
