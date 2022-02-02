package com.example.TryNew.MyController;

import org.json.simple.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TryNew.Component.Card;
import com.example.TryNew.ServiceImpl.serviceImpl;

@RestController
public class myController {
	@Autowired
	private Card crd;
	
	public myController(Card crd) {
		this.crd=crd;
	}
@GetMapping("/get")
public JSONArray getAll() {
	return this.crd.getAll();
}
}
