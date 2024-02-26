package com.Rest_API_SB.Rest_API_SB.control;

import com.Rest_API_SB.Rest_API_SB.model.CloudVendor;
import com.Rest_API_SB.Rest_API_SB.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVenderController {
    CloudVendorService cloudVendorService;
    public CloudVenderController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }
    //    CloudVendor cloudVendor;
    //For specific Cloud vendor
    @GetMapping("{vendorID}")
    public CloudVendor getCloudvendeordetails(@PathVariable("vendorID") String vendorID) {
        return cloudVendorService.getCloudVendor(vendorID);
//          return new CloudVendor("C1","Vendor1","VendorAD1", "VendorPhnNum");
    }
    //For All Cloud vendor
    @GetMapping()
    public List<CloudVendor> getAllCloudvendeordetails() {
        return cloudVendorService.getAllCloudVendors();
//          return new CloudVendor("C1","Vendor1","VendorAD1", "VendorPhnNum");
    }
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor Created Successfully";
    }
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor Updated Success";
    }
    @DeleteMapping("{vendorID}")
    public String deleteCloudVendorDetails(@PathVariable("vendorID") String vendorID){
        cloudVendorService.deleteCloudVendor(vendorID);
        return "Cloud Vendor Deleted Success";
    }
}
