package uce.ona.jorge.health;

import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.health.Health;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.net.HttpURLConnection;
import java.net.URL;

@Health
@ApplicationScoped
@Slf4j
public class configHealthChek implements HealthCheck {

	@Inject
	@ConfigProperty(name = "direccion1.url", defaultValue = "https://localhost:8081/direccionDto")
	private String UpServicio;

	@Override
	public HealthCheckResponse call() {
		try {
			HttpURLConnection connection = (HttpURLConnection) new URL(UpServicio).openConnection();
			connection.setRequestMethod("HEAD");

			if (connection.getResponseCode() == 200) {
				return HealthCheckResponse.named(configHealthChek.class.getSimpleName()).up().build();
			}
		} catch (Exception exception) {
	//	log.error("Error checking health of" + meetUpApiUrl);
		}
		return HealthCheckResponse.named(configHealthChek.class.getSimpleName()).down().build();
	}
}