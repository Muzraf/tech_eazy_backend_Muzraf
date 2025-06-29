package com.example.parcel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Parcel {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long parcelId;
  private String customerName;
  private String parcelDeliveryAddress;
  private String customerContactNumber;
  private Double parcelWeight;
  private Double parcelWidth;
  private Double parcelHeight;
  
  protected Parcel() {}

  public Parcel(String customerName, String parcelDeliveryAddress, String customerContactNumber, Double parcelWeight, Double paarcelWidth, Double parcelHeight) {
    this.customerName = customerName;
    this.parcelDeliveryAddress = parcelDeliveryAddress;
    this.customerContactNumber = customerContactNumber;

    this.parcelWeight= parcelWeight;
    this.parcelWidth = parcelWidth;
    this.parcelHeight = parcelHeight;
  }
  /*@Override
  public String toString() {
    return parcelId + ", " + customerName + ", " +
      parcelDeliveryAddress + ", " + customerContactNumber + ", " +
      parcelWeight + ", " + parcelWidth + " x " + parcelHeight;
  }*/
  public Long getParcelId() {
    return parcelId;
  }

  public String getCustomerName() {
    return customerName;
  }
  public String getParcelDeliveryAddress() {
    return parcelDeliveryAddress;
  }
  public String getCustomerContactNumber() {
    return customerContactNumber;
  }
  public Double getParcelWidth() {
    return parcelWidth;
  }
  public Double getParcelHeight() {
    return parcelHeight;
  }
  public Double getParcelWeight() {
    return parcelWeight;
  }
  
  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }
  public void setParcelDeliveryAddress(String parcelDeliveryAddress) {
    this.parcelDeliveryAddress = parcelDeliveryAddress;
  }
  public void setCustomerContactNumber(String customerContactNumber) {
    this.customerContactNumber = customerContactNumber;
  }
  public void setParcelWeight(Double parcelWeight) {
    this.parcelWeight= parcelWeight;
  } 
  
  public void setParcelWidth(Double parcelWidth) {
    this.parcelWidth = parcelWidth;
  } 

  public void setParcelHeight(Double parcelHeight) {
    this.parcelHeight = parcelHeight;
  } 
}
