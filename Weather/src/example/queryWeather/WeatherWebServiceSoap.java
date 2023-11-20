
package example.queryWeather;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WeatherWebServiceSoap", targetNamespace = "http://WebXml.com.cn/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WeatherWebServiceSoap {


    /**
     * 
     * @param byProvinceName
     * @return
     *     returns com.cn.phone.ArrayOfString
     */
    @WebMethod(action = "http://WebXml.com.cn/getSupportCity")
    @WebResult(name = "getSupportCityResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "getSupportCity", targetNamespace = "http://WebXml.com.cn/", className = "com.cn.phone.GetSupportCity")
    @ResponseWrapper(localName = "getSupportCityResponse", targetNamespace = "http://WebXml.com.cn/", className = "com.cn.phone.GetSupportCityResponse")
    public ArrayOfString getSupportCity(
        @WebParam(name = "byProvinceName", targetNamespace = "http://WebXml.com.cn/")
        String byProvinceName);

    /**
     * 
     * @return
     *     returns com.cn.phone.ArrayOfString
     */
    @WebMethod(action = "http://WebXml.com.cn/getSupportProvince")
    @WebResult(name = "getSupportProvinceResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "getSupportProvince", targetNamespace = "http://WebXml.com.cn/", className = "com.cn.phone.GetSupportProvince")
    @ResponseWrapper(localName = "getSupportProvinceResponse", targetNamespace = "http://WebXml.com.cn/", className = "com.cn.phone.GetSupportProvinceResponse")
    public ArrayOfString getSupportProvince();

    /**
     * 
     * @return
     *     returns com.cn.phone.GetSupportDataSetResponse.GetSupportDataSetResult
     */
    @WebMethod(action = "http://WebXml.com.cn/getSupportDataSet")
    @WebResult(name = "getSupportDataSetResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "getSupportDataSet", targetNamespace = "http://WebXml.com.cn/", className = "com.cn.phone.GetSupportDataSet")
    @ResponseWrapper(localName = "getSupportDataSetResponse", targetNamespace = "http://WebXml.com.cn/", className = "com.cn.phone.GetSupportDataSetResponse")
    public example.queryWeather.GetSupportDataSetResponse.GetSupportDataSetResult getSupportDataSet();

    /**
     * 
     * @param theCityName
     * @return
     *     returns com.cn.phone.ArrayOfString
     */
    @WebMethod(action = "http://WebXml.com.cn/getWeatherbyCityName")
    @WebResult(name = "getWeatherbyCityNameResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "getWeatherbyCityName", targetNamespace = "http://WebXml.com.cn/", className = "com.cn.phone.GetWeatherbyCityName")
    @ResponseWrapper(localName = "getWeatherbyCityNameResponse", targetNamespace = "http://WebXml.com.cn/", className = "com.cn.phone.GetWeatherbyCityNameResponse")
    public ArrayOfString getWeatherbyCityName(
        @WebParam(name = "theCityName", targetNamespace = "http://WebXml.com.cn/")
        String theCityName);

    /**
     * 
     * @param theCityName
     * @param theUserID
     * @return
     *     returns com.cn.phone.ArrayOfString
     */
    @WebMethod(action = "http://WebXml.com.cn/getWeatherbyCityNamePro")
    @WebResult(name = "getWeatherbyCityNameProResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "getWeatherbyCityNamePro", targetNamespace = "http://WebXml.com.cn/", className = "com.cn.phone.GetWeatherbyCityNamePro")
    @ResponseWrapper(localName = "getWeatherbyCityNameProResponse", targetNamespace = "http://WebXml.com.cn/", className = "com.cn.phone.GetWeatherbyCityNameProResponse")
    public ArrayOfString getWeatherbyCityNamePro(
        @WebParam(name = "theCityName", targetNamespace = "http://WebXml.com.cn/")
        String theCityName,
        @WebParam(name = "theUserID", targetNamespace = "http://WebXml.com.cn/")
        String theUserID);

}
