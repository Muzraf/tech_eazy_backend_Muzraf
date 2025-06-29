package com.example.parcel;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ParcelController {
  @Autowired private ParcelService parcelService;

  @GetMapping("/")
  public String hey() {
    return "hey!";
  }

  @GetMapping("/parcels")
  public ResponseEntity<List<Parcel>> getAllParcels() { 
    return parcelService.getAllParcels();
  }

  @GetMapping("/parcels/{id}")
  public ResponseEntity<Parcel> getParcelById(@PathVariable("id") Long parcelId) {
    return parcelService.getParcelById(parcelId);
  }

  @PostMapping("/parcels")
  public ResponseEntity<Parcel> postParcel(@RequestBody Parcel parcel) {
    return parcelService.postParcel(parcel);
  }

  @PutMapping("/parcels/{id}")
  public ResponseEntity<Parcel> putParcelById(@RequestBody Parcel parcel, @PathVariable("id") Long parcelId) {
    return parcelService.putParcelById(parcel, parcelId);
  }

  @DeleteMapping("/parcels/{id}")
  public ResponseEntity<Parcel> deleteParcelById(@PathVariable("id") Long parcelId) {
    return parcelService.deleteParcelById(parcelId);
  }
}
