package com.funie.springboot4.wsdl;

import javax.naming.spi.ObjectFactory;
import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(name = "CountriesPort", targetNamespace = "http://spring.io/guides/gs-producing-web-service")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
        ObjectFactory.class
})
public class CountryPort {
    @WebResult(name = "getCountryResponse", targetNamespace = "http://spring.io/guides/gs-producing-web-service", partName = "getCountryResponse")
    public GetCountryResponse getCountry(
            @WebParam(name = "getCountryRequest", targetNamespace = "http://spring.io/guides/gs-producing-web-service", partName = "getCountryRequest")
                    GetCountryRequest getCountryRequest) {
        return null;
    }
}
