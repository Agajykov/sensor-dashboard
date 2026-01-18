package com.backend.resource;

import com.backend.model.Sensor;
import com.backend.model.User;
import com.backend.service.SensorService;
import com.backend.service.UserService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {

	private final SensorService sensorService = new SensorService();
	private final UserService service = new UserService();

	@GET
	public List<Sensor> getAllSensors() {
		return sensorService.getAll();
	}

	// @GET
	// public List<User> getAll() {
	// 	return service.getAll();
	// }

	@POST
	public void createUser(User user) {
		service.save(user);
	}
}
