package com.Rest_API_SB.Rest_API_SB.service;

import com.Rest_API_SB.Rest_API_SB.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public  String deleteCloudVendor(String cloudVendorID);
    public  CloudVendor getCloudVendor(String cloudVendorID);
    public List<CloudVendor> getAllCloudVendors();
}
