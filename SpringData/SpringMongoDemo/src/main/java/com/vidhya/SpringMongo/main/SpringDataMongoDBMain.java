package com.vidhya.SpringMongo.main;

import java.net.UnknownHostException;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.mongodb.MongoClient;
import com.vidhya.SpringMongo.model.Person;

public class SpringDataMongoDBMain {
	public static final String DB_NAME = "vidhya";
	public static final String PERSON_COLLECTION = "person";
	public static final String MONGO_HOST = "localhost";
	public static final int MONGO_PORT = 27017;
	
	public static void main(String[] args) {
		try {
			
			MongoClient mongo = new MongoClient(
					MONGO_HOST, MONGO_PORT);
			MongoOperations mongoOps = new MongoTemplate(mongo, DB_NAME);
			Person p1 = new Person("2", "Poojitha", "Hyderabad, India");
			Person p2 = new Person("3", "Mallika", "Tirupathi, India");
			Person p3 = new Person("4", "Suraj", "Odisha, India");
			Person p4 = new Person("5", "Suraj", "Odisha, India");
			mongoOps.insert(p1, PERSON_COLLECTION);
			mongoOps.insert(p2, PERSON_COLLECTION);
			mongoOps.insert(p3, PERSON_COLLECTION);
			mongoOps.insert(p4, PERSON_COLLECTION);
			
			//findOne
			Query q=new Query(Criteria.where("name").is("Vidhya"));
			Person pqueryobj = mongoOps.findOne(q,Person.class, PERSON_COLLECTION);//Person.class is the return type
			System.err.println(pqueryobj);
			
			//
			
			
			
			
			
			
			
			mongo.close();
			
			
			
		}catch (UnknownHostException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	
	
}
