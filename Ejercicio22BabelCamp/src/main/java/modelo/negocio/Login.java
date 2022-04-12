package modelo.negocio;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import org.json.JSONObject;

public class Login {
	
	public boolean getUser(String user, String password) {
		HttpRequest request;
		HttpClient client = HttpClient.newHttpClient();
		HttpResponse<String> response;
		boolean respuesta = false;
		try {
			request = HttpRequest.newBuilder()
					  .uri(new URI("http://localhost:8080/Ejercicio21BabelCamp/?user="+ user +"&password="+password))
					  .GET()
					  .build();
			response = client.send(request, BodyHandlers.ofString());
			System.out.println(response);
			System.out.println(response.body());
			JSONObject json = new JSONObject(response.body());
            respuesta = json.getBoolean("validado");
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		return respuesta;
	}

}
