package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.CarModel;



public interface CarRepo extends JpaRepository<CarModel, Integer> {

	@Query(value="select * from cartable where owner=:s",nativeQuery = true)
	public List<CarModel>getCarInfo(@Param("s") int owner);
	
	@Query(value="select * from cartable where address=:sn",nativeQuery = true)
	public List<CarModel>getCarInfo1(@Param("sn") String address);
	
	@Query(value="select * from cartable where carname=:scn",nativeQuery = true)
	public List<CarModel>getCarInfo2(@Param("scn") String name);
	
	@Query(value="select * from studenttable where owner=:so or cartype=:st",nativeQuery = true)
	public List<CarModel>getCarInfo3(@Param("so") int id,@Param("st") String name);
}
