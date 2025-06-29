package com.example.parcel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ParcelRepo extends CrudRepository<Parcel, Long>{

}
