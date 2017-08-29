package com.bartech.cart.models;

import java.sql.Timestamp;

public class Product {
	
	int id;
	String Manufacturer;
	String Name;
	String Description;
	long EAN;
	long GTIN;
	long UOM;
	Timestamp CreatedTime;
	String CreatedBy;
	Timestamp UpdatedTime;
	String UpdatedBy;
	char IsActive;
	
public Product() {
	}	

public Product( int id, String Manufacturer, String Name, String Description,long EAN,long GTIN,long UOM,
		Timestamp CreatedTime,String CreatedBy, Timestamp UpdatedTime, String UpdatedBy,char IsActive )
{
	super();
	this.id=id;
	Manufacturer = Manufacturer;
	Name = Name;
	Description = Description;
	EAN = EAN;
	GTIN = GTIN;
	UOM = UOM;
	CreatedTime = CreatedTime;
	CreatedBy = CreatedBy;
	UpdatedTime = UpdatedTime;
	UpdatedBy = UpdatedBy;
	IsActive = IsActive;	
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getManufacturer() {
	return Manufacturer;
}

public void setManufacturer(String manufacturer) {
	Manufacturer = manufacturer;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public String getDescription() {
	return Description;
}

public void setDescription(String description) {
	Description = description;
}

public long getEAN() {
	return EAN;
}

public void setEAN(long eAN) {
	EAN = eAN;
}

public long getGTIN() {
	return GTIN;
}

public void setGTIN(long gTIN) {
	GTIN = gTIN;
}

public long getUOM() {
	return UOM;
}

public void setUOM(long uOM) {
	UOM = uOM;
}

public Timestamp getCreatedTime() {
	return CreatedTime;
}

public void setCreatedTime(Timestamp createdTime) {
	CreatedTime = createdTime;
}

public String getCreatedBy() {
	return CreatedBy;
}

public void setCreatedBy(String createdBy) {
	CreatedBy = createdBy;
}

public Timestamp getUpdatedTime() {
	return UpdatedTime;
}

public void setUpdatedTime(Timestamp updatedTime) {
	UpdatedTime = updatedTime;
}

public String getUpdatedBy() {
	return UpdatedBy;
}

public void setUpdatedBy(String updatedBy) {
	UpdatedBy = updatedBy;
}

public char getIsActive() {
	return IsActive;
}

public void setIsActive(char isActive) {
	IsActive = isActive;
}


public String tostring() {
	return id+"\t"+Manufacturer+"\t"+Name+"\t"+Description+"\t"+EAN+"\t"+GTIN+"\t"+UOM+"\t"+CreatedTime+"\t"+ CreatedBy+"\t"+UpdatedTime+"\t"+UpdatedBy+"\t"
			+IsActive;
	
}


}
