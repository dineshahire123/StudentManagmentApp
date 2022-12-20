package com.masai.Entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;

@Entity
public class StudentAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String pincode;
	
	@NotNull(message = "{notNull}")
	private String area;
	@NotNull(message = "{notNull}")
	private String state;
	@NotNull(message = "{notNull}")
    private String district;
	@NotNull(message = "{notNull}")
    private String addressType;
	
	public StudentAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentAddress(String pincode, @NotNull(message = "{notNull}") String area,
			@NotNull(message = "{notNull}") String state, @NotNull(message = "{notNull}") String district,
			@NotNull(message = "{notNull}") String addressType) {
		super();
		this.pincode = pincode;
		this.area = area;
		this.state = state;
		this.district = district;
		this.addressType = addressType;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	@Override
	public String toString() {
		return "StudentAddress [pincode=" + pincode + ", area=" + area + ", state=" + state + ", district=" + district
				+ ", addressType=" + addressType + "]";
	}

	
    
	
}
