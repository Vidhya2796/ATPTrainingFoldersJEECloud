package com.vidhyac.zipcode.resource;

import java.util.Map;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vidhyac.zipcode.dao.InfoDAO;
import com.vidhyac.zipcode.model.Info;

@Path("zipcode")
public class ZipCode {
	
	InfoDAO dao=new InfoDAO();
	@Path("{zipcode}")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Info showInfo(@PathParam("zipcode") long zipcode){
		
		 for (Map.Entry<Long,Info> entry : dao.getInfo().entrySet())  {
			 
			 if (zipcode==entry.getKey()) {
				  Info info=entry.getValue();
				  return info;
			}  
	            
		 }//for loop ends here
	          
	 return null;
	}
	
}