package com.back4app.entities;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "parse_client_data")
public class Client {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;

	@Column(name = "objectID")
	private String objectID;
	
	@Column(name = "contact")
	private String contact;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "pixel_install")
	private String pixel_install;
	
	@Column(name = "tier")
	private String tier;
	
	@Column(name = "fb_page_url")
	private String fb_page_url;
	
	@Column(name = "meta_data")
	private String meta_data;
	
	@Column(name = "max_age")
	private int max_age;
	
	@Column(name = "fb_page_id")
	private String fb_page_id;
	
	@Column(name = "partner")
	private String partner;
	
	@Column(name = "instagram_id")
	private String instagram_id;
	
	@Column(name = "is_responsive")
	private int is_responsive;
	
	@Column(name = "business_name")
	private String business_name;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "campaign_name") 
	private String name;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updatedAt")
	private Date updatedAt;
	
	@Column(name = "fb_page_access")
	private String fb_page_access;
	
	@Column(name = "ad_account")
	private String ad_account;
	
	@Column(name = "min_age")
	private int min_age;
	
	@Column(name = "status")
	private int status;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "conversion")
	private int conversion;
	
	@Column(name = "is_ssl_enabled")
	private int is_ssl_enabled;
	
	@Column(name = "ext_id")
	private String ext_id;
	
	@Column(name = "business_logo_url")
	private String business_logo_url;
	
	@Column(name = "website")
	private String website;
	
	@Column(name = "createdAt")
	private Date createdAt;
	
	@Column(name = "available_budget")
	private Double available_budget;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "business_category")
	private int business_category;
	
	@Column(name = "spend")
	private int spend;
	
	@Column(name = "referrer")
	private String referrer;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getObjectID() {
		return objectID;
	}

	public void setObjectID(String objectID) {
		this.objectID = objectID;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPixel_install() {
		return pixel_install;
	}

	public void setPixel_install(String pixel_install) {
		this.pixel_install = pixel_install;
	}

	public String getTier() {
		return tier;
	}

	public void setTier(String tier) {
		this.tier = tier;
	}

	public String getFb_page_url() {
		return fb_page_url;
	}

	public void setFb_page_url(String fb_page_url) {
		this.fb_page_url = fb_page_url;
	}

	public String getMeta_data() {
		return meta_data;
	}

	public void setMeta_data(String meta_data) {
		this.meta_data = meta_data;
	}

	public int getMax_age() {
		return max_age;
	}

	public void setMax_age(int max_age) {
		this.max_age = max_age;
	}

	public String getFb_page_id() {
		return fb_page_id;
	}

	public void setFb_page_id(String fb_page_id) {
		this.fb_page_id = fb_page_id;
	}

	public String getPartner() {
		return partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

	public String getInstagram_id() {
		return instagram_id;
	}

	public void setInstagram_id(String instagram_id) {
		this.instagram_id = instagram_id;
	}

	public int getIs_responsive() {
		return is_responsive;
	}

	public void setIs_responsive(int is_responsive) {
		this.is_responsive = is_responsive;
	}

	public String getBusiness_name() {
		return business_name;
	}

	public void setBusiness_name(String business_name) {
		this.business_name = business_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getFb_page_access() {
		return fb_page_access;
	}

	public void setFb_page_access(String fb_page_access) {
		this.fb_page_access = fb_page_access;
	}

	public String getAd_account() {
		return ad_account;
	}

	public void setAd_account(String ad_account) {
		this.ad_account = ad_account;
	}

	public int getMin_age() {
		return min_age;
	}

	public void setMin_age(int min_age) {
		this.min_age = min_age;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getConversion() {
		return conversion;
	}

	public void setConversion(int conversion) {
		this.conversion = conversion;
	}

	public int getIs_ssl_enabled() {
		return is_ssl_enabled;
	}

	public void setIs_ssl_enabled(int is_ssl_enabled) {
		this.is_ssl_enabled = is_ssl_enabled;
	}

	public String getExt_id() {
		return ext_id;
	}

	public void setExt_id(String ext_id) {
		this.ext_id = ext_id;
	}

	public String getBusiness_logo_url() {
		return business_logo_url;
	}

	public void setBusiness_logo_url(String business_logo_url) {
		this.business_logo_url = business_logo_url;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Double getAvailable_budget() {
		return available_budget;
	}

	public void setAvailable_budget(Double available_budget) {
		this.available_budget = available_budget;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getBusiness_category() {
		return business_category;
	}

	public void setBusiness_category(int business_category) {
		this.business_category = business_category;
	}

	public int getSpend() {
		return spend;
	}

	public void setSpend(int spend) {
		this.spend = spend;
	}

	public String getReferrer() {
		return referrer;
	}

	public void setReferrer(String referrer) {
		this.referrer = referrer;
	}

	public String getString() {
		return "Client [id=" + id + ", objectID=" + objectID + ", contact=" + contact + ", gender=" + gender
				+ ", pixel_install=" + pixel_install + ", tier=" + tier + ", fb_page_url=" + fb_page_url
				+ ", meta_data=" + meta_data + ", max_age=" + max_age + ", fb_page_id=" + fb_page_id + ", partner="
				+ partner + ", instagram_id=" + instagram_id + ", is_responsive=" + is_responsive + ", business_name="
				+ business_name + ", city=" + city + ", name=" + name + ", updatedAt=" + updatedAt + ", fb_page_access="
				+ fb_page_access + ", ad_account=" + ad_account + ", min_age=" + min_age + ", status=" + status
				+ ", address=" + address + ", conversion=" + conversion + ", is_ssl_enabled=" + is_ssl_enabled
				+ ", ext_id=" + ext_id + ", business_logo_url=" + business_logo_url + ", website=" + website
				+ ", createdAt=" + createdAt + ", available_budget=" + available_budget + ", email=" + email
				+ ", business_category=" + business_category + ", spend=" + spend + ", referrer=" + referrer + "]";
	}
	
}