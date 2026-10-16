package com.example.restaurant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class RestaurantController {

    @GetMapping("/restaurant")
    public List<String> getRestaurants() {
        return Arrays.asList(
            "Restaurant 1: The Food Palace",
            "Restaurant 2: Spice Garden",
            "Restaurant 3: Punjabi Dhaba",
            "Restaurant 4: South Indian Cafe",
            "Restaurant 5: Pizza Corner"
        );
    }
}