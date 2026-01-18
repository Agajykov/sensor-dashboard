package com.backend.resource;

import com.backend.model.Sensor;
import com.backend.service.SensorService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/sensors")
@Produces(MediaType.APPLICATION_JSON)
// @Consumes(MediaType.APPLICATION_JSON)
public class SensorResource {

	private final SensorService service = new SensorService();


	@GET
	public List<Sensor> getAll() {
		return service.getAll();
	}

	@POST
	@Path("/import")
	public List<Sensor> importFromCsv() {
		return service.loadFromCsvAndSave();
	}

	
	// @GET
	// @Path("/ping")
	// public String ping() {
	// 	return "pong";
	// }

	// @POST
	// @Path("/load-csv")
	// public List<Sensor> loadCSV() {
	// 	return service.loadFromCsvAndSave();
	// }
	
	// @GET
	// @Path("/fetch")
	// public Sensor fetchAndStore() {
	//     return service.fetchFromAwsAndSave();
	// }
}
