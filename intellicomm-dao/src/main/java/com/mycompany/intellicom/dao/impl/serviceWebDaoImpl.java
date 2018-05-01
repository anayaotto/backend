/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.intellicom.dao.impl;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mycompany.intellicom.dao.serviceWebDao;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author Otto
 */
public class serviceWebDaoImpl implements serviceWebDao {
    private MongoClient mongoClient;
    private MongoDatabase db;  
    private DB db1;
    
     public serviceWebDaoImpl(){
        
        mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
        db = mongoClient.getDatabase("locationpoint");
    }
     @Override
     public void getData(){
         MongoDatabase database = mongoClient.getDatabase("locationpoint");
        /*DBCollection collection = db1.getCollection("movie");
         DBObject dbo = collection.findOne();
        String name = (String) dbo.get("name");
        String age = (String) dbo.get("code");*/
        MongoCollection<Document> collection = database.getCollection("movie");
 
		List<Document> documents = (List<Document>) collection.find().into(
				new ArrayList<Document>());
 
               for(Document document : documents){
                   System.out.println(document);
                   System.out.println("NAME: "+ document.get("name")+" "+ document.get("code"));
                   
                   try{
                       List<String> temporadas = (ArrayList) document.get("temporadas");
                       if(temporadas!=null){
                       for(String t : temporadas){
                           System.out.println("Temporada: "+t);
                       }
                       }else{
                           System.err.println("Lo sentimos la pelicula tiene temporada unica");
                       }
                   }catch(Exception e){
                       e.printStackTrace();
                   }
               }
               
      
}
     
     
     
}
