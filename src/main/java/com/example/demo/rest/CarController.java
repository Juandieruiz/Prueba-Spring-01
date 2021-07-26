package com.example.demo.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Car;

@RestController
@RequestMapping("/api")
public class CarController {

	private final Logger log = LoggerFactory.getLogger(CarController.class);

	// find one
	/*
	 * http://localhost:8080/api/cars/1
	 * 
	 * @return a response entity with car
	 */
	@GetMapping("/cars/{id}")
	public ResponseEntity<Car> findOne(@PathVariable Long id) {
		log.info("REST request to find one car");
		Car car1 = new Car(id, "Audi", "XS", 2.0, 2);

		return ResponseEntity.ok(car1);
	}

	// find All
	/*
	 * http:localhost:8080/api/cars
	 * 
	 */
	@GetMapping("/cars")
	public List<Car> findAll() {
		log.info("REST request to find all cars");
		Car car1 = new Car(1L, "Tesla", "XS", 2.0, 2);
		Car car2 = new Car(1L, "Tesla2", "Model Z", 2.0, 4);
		return List.of(car1, car2);
	}

	// create one
	@PostMapping("/cars")
	public ResponseEntity<Car> create(@RequestBody Car car) {
		log.info("REST request to create a new car");

		if (car.getIdLong() != null) { // quiere decir que ya existe
			log.warn("Trying to create a new car with existent id");
			return ResponseEntity.badRequest().build();
		}
		car.setIdLong(3L);
		return ResponseEntity.ok(car);
	}

	// update
	@PutMapping("/cars")
	public ResponseEntity<Car> update(@RequestBody Car car) {

		if (car.getIdLong() == null) { // No hay ID-- no existe el coche a actualizar
			log.warn("Trying to update an existing car with existent without id");
			return ResponseEntity.badRequest().build();
		}
		car.setManufacturer(car.getManufacturer() + "Editado");

		return ResponseEntity.ok(car);
	}

	// delete one
	@DeleteMapping("cars/{id}")
	public ResponseEntity<Car> delete(@PathVariable Long id) {
		log.info("REST request to delete an existing car");
		
		//Simular borrar de base de datos
		// deleteById(ID)
		
		return ResponseEntity.noContent().build();
	}
	
	// delete all
	@DeleteMapping("/cars")
	public ResponseEntity<Car> deleteAll() {
		log.info("REST request to delete all cars");
		
		//Simular borrar de base de datos
		// deleteAll()
		
		return ResponseEntity.noContent().build();
	}

}
