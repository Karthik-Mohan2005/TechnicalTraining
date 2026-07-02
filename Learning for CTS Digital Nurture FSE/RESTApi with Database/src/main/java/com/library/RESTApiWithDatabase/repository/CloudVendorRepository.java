package com.library.RESTApiWithDatabase.repository;

import com.library.RESTApiWithDatabase.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor,String> {

}
