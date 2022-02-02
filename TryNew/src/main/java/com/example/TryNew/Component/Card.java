package com.example.TryNew.Component;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.TryNew.MyMapper.myMapper;
import com.example.TryNew.ServiceImpl.serviceImpl;

@Service
public  class Card  {
	@Autowired
	public myMapper map;
	@Autowired
	public serviceImpl impl;

	public JSONArray getAll() {
		JSONArray array =new JSONArray();
		JSONObject obj=new JSONObject();
		obj.put("ok",map.hrsg1table1(serviceImpl.c1));
		array.add(obj);
		return array;
	}

	

}
