package com.back4app.main;

import java.util.ArrayList;

import org.bson.Document;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.back4app.entities.Client;
import com.back4app.mongo.MongoDAO;
import com.back4app.mongoOperation.MongoOp;
import com.hibernate.factory.BuildFactory;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

public class Common {

	public void createClient(){
		
		ArrayList<Document> getClients = MongoOp.getClientData(1);
		
		System.out.println(getClients.size());
		
		if(getClients.size() > 0){
		
			SessionFactory factory = BuildFactory.getFactory();	
			
			System.out.println(factory);
			
			Session sessionTruncate = BuildFactory.getFactory().openSession();
			sessionTruncate.beginTransaction();
			sessionTruncate.createSQLQuery("TRUNCATE TABLE api_data.parse_client_data;").executeUpdate();
			sessionTruncate.getTransaction().commit();
			sessionTruncate.close();
			
			for(Document client : getClients){
				
				Client sqlClient = new Client();
				
				System.out.println("The client object id outside is : "+client.getString("_id"));
				
				if(client.containsKey("ad_account")){
					
					sqlClient.setAd_account(client.getString("ad_account"));
					
				}else{
					sqlClient.setAd_account(null);
				}
				
				if(client.containsKey("address")){
					
					sqlClient.setAddress(client.getString("address"));
					
				}else{
					sqlClient.setAddress(null);
				}
			
				if(client.containsKey("available_budget")){
					
					try{
						sqlClient.setAvailable_budget(client.getDouble("available_budget"));
					}catch(Exception e){
						sqlClient.setAvailable_budget(client.getLong("available_budget").doubleValue());
					}
					
				}else{
					sqlClient.setAvailable_budget(null);
				}
				
				if(client.containsKey("business_category")){
					
					try{
						sqlClient.setBusiness_category(client.getLong("business_category").intValue());
					}catch(Exception e){
						sqlClient.setBusiness_category(client.getInteger("business_category"));
					}
					
				}else{
					sqlClient.setBusiness_category(0);
				}
				
				if(client.containsKey("business_logo_url")){
					
					sqlClient.setBusiness_logo_url(client.getString("business_logo_url"));
					
				}else{
					sqlClient.setBusiness_logo_url(null);
				}
				
				if(client.containsKey("business_name")){
					
					sqlClient.setBusiness_name(client.getString("business_name"));
					
				}else{
					sqlClient.setBusiness_name(null);
				}
				
				if(client.containsKey("city")){
					
					Document cityDoc = (Document) client.get("city");
					
					sqlClient.setCity(cityDoc.toJson());
					
				}else{
					sqlClient.setCity(null);
				}
				
				if(client.containsKey("contact")){
					
					sqlClient.setContact(client.getString("contact"));
					
				}else{
					sqlClient.setCity(null);
				}
				
				if(client.containsKey("_created_at")){
					
					sqlClient.setCreatedAt(client.getDate("_created_at"));
					
				}else{
					sqlClient.setCreatedAt(null);
				}
				
				if(client.containsKey("email")){
					
					sqlClient.setEmail(client.getString("email"));
					
				}else{
					sqlClient.setEmail(null);
				}
				
				if(client.containsKey("ext_id")){
					
					sqlClient.setExt_id(client.getString("ext_id"));
					
				}else{
					sqlClient.setExt_id(null);
				}
				
				if(client.containsKey("fb_page_access")){
					
						sqlClient.setFb_page_access(client.getString("fb_page_access"));
					
				}else{
					sqlClient.setFb_page_access(null);
				}
				
				if(client.containsKey("fb_page_id")){
					
					sqlClient.setFb_page_id(client.getString("fb_page_id"));
					
				}else{
					sqlClient.setFb_page_id(null);
				}
				
				if(client.containsKey("fb_page_url")){
					
					sqlClient.setFb_page_url(client.getString("fb_page_url"));
					
				}else{
					sqlClient.setFb_page_url(null);
				}
				
				if(client.containsKey("gender")){
					
					sqlClient.setGender(client.getString("gender"));
					
				}else{
					sqlClient.setGender(null);
				}
				
				if(client.containsKey("instagram_id")){
					
					sqlClient.setInstagram_id(client.getString("instagram_id"));
					
				}else{
					sqlClient.setInstagram_id(null);
				}
				
				if(client.containsKey("is_responsive")){
					
					try{
						sqlClient.setIs_responsive(client.getInteger("is_responsive"));
					}catch(Exception e){
						sqlClient.setIs_responsive(client.getLong("is_responsive").intValue());
					}
					
				}else{
					sqlClient.setIs_responsive(0);
				}
				
				if(client.containsKey("is_ssl_enabled")){
					
					try{
						sqlClient.setIs_ssl_enabled(client.getInteger("is_ssl_enabled"));
					}catch(Exception e){
						sqlClient.setIs_ssl_enabled(client.getLong("is_ssl_enabled").intValue());
					}
					
				}else{
					sqlClient.setIs_ssl_enabled(0);
				}
				
				if(client.containsKey("max_age")){
					
					sqlClient.setMax_age(client.getInteger("max_age"));
					
				}else{
					sqlClient.setMax_age(0);
				}
				
				if(client.containsKey("min_age")){
					
					sqlClient.setMin_age(client.getInteger("min_age"));
					
				}else{
					sqlClient.setMin_age(0);
				}
				
				if(client.containsKey("meta_data")){
					
					sqlClient.setMeta_data(client.getString("meta_data"));
					
				}else{
					sqlClient.setMeta_data(null);
				}
				
				if(client.containsKey("name")){
					
					sqlClient.setName(client.getString("name"));
					
				}else{
					sqlClient.setName(null);
				}
				
				if(client.containsKey("_id")){
					sqlClient.setObjectID(client.getString("_id"));
				}else{
					sqlClient.setObjectID(null);
				}
				
				if(client.containsKey("partner")){
					
					sqlClient.setPartner(client.getString("partner"));
					
				}else{
					sqlClient.setPartner(null);
				}
				
				if(client.containsKey("pixel_install")){
					
					sqlClient.setPixel_install(client.getString("pixel_install"));
					
				}else{
					sqlClient.setPixel_install(null);
				}
				
				if(client.containsKey("referrer")){
					
					sqlClient.setReferrer(client.getString("referrer"));
					
				}else{
					sqlClient.setReferrer(null);
				}
				
				if(client.containsKey("status")){
					
					try{
						sqlClient.setStatus(client.getInteger("status"));
					}catch(Exception e){
						sqlClient.setStatus(client.getLong("status").intValue());
					}
					
				}else{
					sqlClient.setStatus(0);
				}
				
				if(client.containsKey("tier")){
					
					sqlClient.setTier(client.getString("tier"));
					
				}else{
					sqlClient.setTier(null);
				}
				
				if(client.containsKey("website")){
					
					sqlClient.setWebsite(client.getString("website"));
					
				}else{
					sqlClient.setWebsite(null);
				}
				
				if(client.containsKey("_updated_at")){
					
					sqlClient.setUpdatedAt(client.getDate("_updated_at"));
					
				}else{
					sqlClient.setUpdatedAt(null);
				}
				
				Session session = BuildFactory.getFactory().openSession();
				session.beginTransaction();
		
				System.out.println("Session Value is : " + session);
				
				int client_id = (Integer) session.save(sqlClient);
				
				System.out.println("Client ID created is : "+client_id);
				
				session.getTransaction().commit();
				session.close();
							
			}
			
		}else{
			System.out.println("No Creation is requested in Parse.");
		}
			
	}
	
}