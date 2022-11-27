package com.myhome.controller;

import com.myhome.entity.MyHome;
import com.myhome.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    HomeService homeService;

    @GetMapping("getAll")
    public ResponseEntity<?> getAll()
    {
        List<MyHome> homes = homeService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(homes);
    }

    @PostMapping("addHome")
    public ResponseEntity<?> createHome(@RequestBody MyHome myHome)
    {
        MyHome home = homeService.createHome(myHome);
       return ResponseEntity.status(HttpStatus.CREATED).body(myHome);
    }

    @PutMapping("/updateHome/{homeId}")
    public ResponseEntity<?> updateHome(@RequestBody MyHome myHome ,@PathVariable ("homeId") int homeId)
    {
        MyHome updateHome = homeService.updateHome(myHome, homeId);
        return ResponseEntity.ok(updateHome);
    }

    @DeleteMapping("deleteHome/{homeId}")
    public ResponseEntity<?> deleteHome(@PathVariable("homeId") int homeId)
    {
        homeService.deleteHome(homeId);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
