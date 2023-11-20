package example;

import example.queryWeather.ArrayOfString;
import example.queryWeather.WeatherWebService;
import example.queryWeather.WeatherWebServiceSoap;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class WeatherForecastService {

    public static void main(String[] args) throws RemoteException, ServiceException {
        System.out.println("======程序启动======");
        String result[] = QueryWeatherForecastInfo("成都");
        for (String r : result) {
            System.out.println(r);
        }
        System.out.println("======程序结束======");
    }

    public static String[] QueryWeatherForecastInfo(String cityName) throws RemoteException, ServiceException {
        WeatherWebService locator = new WeatherWebService();

        // 调用xxLocator对象的getXXPort()方法生成xxSoapBindingStub对象
        WeatherWebServiceSoap stud = locator.getWeatherWebServiceSoap();
        // 输出当天的天气状况
        String[] weather = stud.getWeatherbyCityName("成都").getString().toArray(new String[0]);

        return weather;
    }

}