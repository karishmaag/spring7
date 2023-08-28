package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CarModel;
import com.example.demo.service.CarService;


@RestController
public class CarController {

	 @Autowired  
		CarService sser;
	@PostMapping("addnCar")
    public List<CarModel> addndetails(@RequestBody List<CarModel> ss)
    {
   	 return sser.savedetails(ss);
    }
    @GetMapping("showCar")
    public List<CarModel> show()
    {
        return sser.showinfo();
    }
    @GetMapping("getnew/{owner}")
    public List<CarModel>displayAll(@PathVariable int owner)
    {
   	 return sser.getDetails1(owner);
    }
    @GetMapping("getnew1/{address}")
    public List<CarModel>displayAll1(@PathVariable  String address)
    {
   	 return sser.getDetails2( address);
    }
    @GetMapping("getnew2/{carname}")
    public List<CarModel>displayAll2(@PathVariable  String carname)
    {
   	 return sser.getDetails3(carname);
    }
    @GetMapping("getnew2/{id}/{name}")
    public List<CarModel>displayAll3(@PathVariable int id,@PathVariable String name)
    {
   	 return sser.getDetails4(id, name);
    }
}
