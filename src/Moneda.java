import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Moneda {

    private static final String API_KEY = "cb902b2319e27ad21ef5fd1b";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public static String obtenerCodigoDeMoneda(int opcion){
        return switch (opcion){
            case 1 -> "ARS";
            case 2 -> "BOB";
            case 3 -> "BRL";
            case 4 -> "CLP";
            case 5 -> "COP";
            case 6 -> "USD";
            default -> "USD";


        };
    }


    public  static double obtenerTasaDeCambio(String monedaOrigen , String monedaDestino){
        try {
            String urlStr = BASE_URL + API_KEY + "/latest/" + monedaOrigen;
            URL url = new URL(urlStr);

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line= in.readLine()) != null){
                response.append(line);
            }
            in.close();

            Gson gson = new Gson();
            JsonObject jsonResponse = gson.fromJson(response.toString(), JsonObject.class);


            JsonObject rates = jsonResponse.getAsJsonObject("conversion_rates");
            return rates.get(monedaDestino).getAsDouble();



        } catch (Exception e){
            System.out.println("Error en la aplicacion" + e.getMessage());
            return -1;
        }
    }






}
