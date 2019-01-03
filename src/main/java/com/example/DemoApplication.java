package com.example;

import com.example.car.Car;
import com.example.car.Subaru;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    public DemoApplication() {
        (new Car()).run();
        (new Subaru()).run();
    }
}

