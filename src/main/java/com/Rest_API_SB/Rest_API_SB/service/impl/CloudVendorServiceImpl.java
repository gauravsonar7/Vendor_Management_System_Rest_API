package com.Rest_API_SB.Rest_API_SB.service.impl;

import com.Rest_API_SB.Rest_API_SB.exception.CloudVendorNotFound;
import com.Rest_API_SB.Rest_API_SB.model.CloudVendor;
import com.Rest_API_SB.Rest_API_SB.repository.CloudVendorRepository;
import com.Rest_API_SB.Rest_API_SB.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CloudVendorServiceImpl implements CloudVendorService {
    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorID) {
        cloudVendorRepository.deleteById(cloudVendorID);
        return "Success";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorID) {
//        cloudVendorRepository.findById(cloudVendorID).get();
        if (cloudVendorRepository.findById(cloudVendorID).isEmpty())
            throw new CloudVendorNotFound("Vendor Does not exists");
        return cloudVendorRepository.findById(cloudVendorID).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }
}
