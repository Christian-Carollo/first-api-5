package co.develhope.firstapi5.controllers;

import co.develhope.firstapi5.DTO.CarDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/cars")
public class CarController {

    @GetMapping("/get")
    public CarDTO getCar(){
        return new CarDTO("01", "fiat", 12.000);
    }

    @PostMapping("/post")
    public ResponseEntity<String> addCar(@RequestBody CarDTO car) {
        System.out.println("Car ID: " + car.getId());
        System.out.println("Car Model: " + car.getModelName());
        System.out.println("Car Price: " + car.getPrice());
        return new ResponseEntity<>("Auto aggiunta con successo", HttpStatus.CREATED);
    }
}
