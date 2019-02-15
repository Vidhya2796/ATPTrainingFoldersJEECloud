package com.vidhyac.zipcode.dao;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.FormParam;

import com.vidhyac.zipcode.model.Info;

public class InfoDAO {
	
	
public Map<Long, Info> getInfo(){
		
		Map<Long, Info> map=new HashMap<Long, Info>();
		
		map.put(99501L, new Info("Ak", "ANCHORAGE", "US"));
		map.put(628002L, new Info("Tuticorin", "TamilNadu", "India"));
		
		return map;
		
	}
	
}
