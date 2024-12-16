package com.doggies.controller;

import com.doggies.model.DogProfile;
import com.doggies.service.DogProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    @Autowired
    private DogProfileService dogProfileService;

    @GetMapping("/api/profile")
    public DogProfile getProfile() {
        return dogProfileService.getDogProfile();
    }
}
