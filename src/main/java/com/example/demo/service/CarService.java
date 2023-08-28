package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CarModel;
import com.example.demo.repository.CarRepo;

@Service
public class CarService {
	@Autowired
	CarRepo sr;
	public List<CarModel>savedetails(List<CarModel> ss)
	{
		return (List<CarModel>)sr.saveAll(ss);
	}
	public List<CarModel>showinfo()
	{
		return sr.findAll();
	}
	public List<CarModel>getDetails1(int i)
	 {
		 return sr.getCarInfo(i);
	 }
	 public List<CarModel>getDetails2(String b1)
	 {
		 return sr.getCarInfo1(b1);
	 }
	 public List<CarModel>getDetails3(String b2)
	 {
		 return sr.getCarInfo2(b2);
	 }
	 public List<CarModel>getDetails4(int id,String b3)
	 {
		 return sr.getCarInfo3(id,b3);
	 }
}
