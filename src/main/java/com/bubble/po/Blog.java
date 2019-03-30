package com.bubble.po;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "bubble_blog")
public class Blog {
	@Id
	@GeneratedValue
	@Column(name="blog_id")
	private int blogId;
	@Column(name="title")
	private String title;
	@Column(name="store_city")
	private String storeCity;
	@Column(name="store_district")
	private String storeDistrict;
	@Column(name="store_brand")
	private String storeBrand;
	@Column(name="store_address")
	private String storeAddress;
	@Column(name="content")
	private String content1;
	@Column(name="content2")
	private String content2;
	@Column(name="like")
	private int like;
	@Column(name="views")
	private int views;
	@Column(name="version")
	private int version;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="createdDtm")
	private Date createdDtm;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="lastModifiedDtm")
	private Date lastModifiedDtm;
	@Column(name="deleted")
	private int deleted;

	public int getBlogId() {
		return blogId;
	}

	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}

	public String getStoreCity() {
		return storeCity;
	}

	public void setStoreCity(String storeCity) {
		this.storeCity = storeCity;
	}

	public String getStoreDistrict() {
		return storeDistrict;
	}

	public void setStoreDistrict(String storeDistrict) {
		this.storeDistrict = storeDistrict;
	}

	public String getStoreBrand() {
		return storeBrand;
	}

	public void setStoreBrand(String storeBrand) {
		this.storeBrand = storeBrand;
	}

	public String getStoreAddress() {
		return storeAddress;
	}

	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	public String getContent1() {
		return content1;
	}

	public void setContent1(String content1) {
		this.content1 = content1;
	}

	public String getContent2() {
		return content2;
	}

	public void setContent2(String content2) {
		this.content2 = content2;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Date getCreatedDtm() {
		return createdDtm;
	}

	public void setCreatedDtm(Date createdDtm) {
		this.createdDtm = createdDtm;
	}

	public Date getLastModifiedDtm() {
		return lastModifiedDtm;
	}

	public void setLastModifiedDtm(Date lastModifiedDtm) {
		this.lastModifiedDtm = lastModifiedDtm;
	}

	public int getDeleted() {
		return deleted;
	}

	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
