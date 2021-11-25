import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        OkHttpClient okHttpClient = new OkHttpClient();

//        Request request = new Request.Builder()
//                .url("https://gb.ru")
//                .build();
//        Response response = okHttpClient.newCall(request).execute();

//        System.out.println(response.headers());
//        System.out.println(response.body().string());
//        String cityCode = RequestHandler.detectCityId("Volgograd");
//        System.out.println(cityCode);
//        String forecastOneDay = RequestHandler.getForecastsOneDay(cityCode);
//        System.out.println("Прогноз на 1 день\n" + forecastOneDay);
//        String forecast = RequestHandler.getForecasts(cityCode);
 //       System.out.println("Прогноз на 5 дней\n" + forecast);
        System.out.println(RequestFavQsAPI.quoteOfTheDay()); /*новый запрос на получение цитат с api favqs.com*/

    }
   
}
