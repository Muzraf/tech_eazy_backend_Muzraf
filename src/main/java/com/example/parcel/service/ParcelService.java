package com.example.parcel;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.Optional;
import java.util.List;
import java.util.ArrayList;


@Service

public class ParcelService {
	@Autowired
  private ParcelRepo parcelRepo;
  public ResponseEntity<List<Parcel>> getAllParcels() {
    List<Parcel> parcelList = new ArrayList<>();
    parcelRepo.findAll().forEach(parcelList::add);
    if (parcelList.isEmpty()) {
      return new ResponseEntity<>(parcelList, HttpStatus.NO_CONTENT);
    }
    return new ResponseEntity<>(parcelList, HttpStatus.OK);
  }
  public ResponseEntity<Parcel> getParcelById(Long parcelId){
    Optional<Parcel> parcelData = parcelRepo.findById(parcelId);
    if (parcelData.isPresent()) {
      return new ResponseEntity<>(parcelData.get(), HttpStatus.OK);
    }
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }
  public ResponseEntity<Parcel> postParcel(Parcel parcel) {
    Parcel parcelObj = parcelRepo.save(parcel);
    return new ResponseEntity<>(parcelObj, HttpStatus.OK);
  }
  public ResponseEntity<Parcel> putParcelById(Parcel parcel, Long parcelId) {
    Optional<Parcel> oldParcelData = parcelRepo.findById(parcelId);
    if (oldParcelData.isPresent()) {
      Parcel updatedParcelData = oldParcelData.get();
      updatedParcelData.setCustomerName(parcel.getCustomerName());
      updatedParcelData.setParcelDeliveryAddress(parcel.getParcelDeliveryAddress());
      updatedParcelData.setCustomerContactNumber(parcel.getCustomerContactNumber());
      updatedParcelData.setParcelWeight(parcel.getParcelWeight());
      updatedParcelData.setParcelWidth(parcel.getParcelWidth());
      updatedParcelData.setParcelHeight(parcel.getParcelHeight());
      
      Parcel parcelObj = parcelRepo.save(updatedParcelData);
      return new ResponseEntity<>(parcelObj, HttpStatus.OK);
      
    }
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }

  public ResponseEntity<Parcel> deleteParcelById(Long parcelId) {
    parcelRepo.deleteById(parcelId);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
