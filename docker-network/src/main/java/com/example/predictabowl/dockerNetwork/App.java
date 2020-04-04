package com.example.predictabowl.dockerNetwork;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String mongoHost = "localhost";
		if (args.length > 0)
			mongoHost = args[0];
		// default port for MongoDB is 27107
		MongoClient mongoClient = new MongoClient(mongoHost);
		MongoDatabase mDB = mongoClient.getDatabase("mydb");
		MongoCollection<Document> collection = mDB.getCollection("examples");
		Document doc = new Document("name", "Greeting").append("type", "Hello World!");
		collection.insertOne(doc);
		System.out.println(collection.find().first().get("type"));
		mongoClient.close();
	}
}
