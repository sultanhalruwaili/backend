package com.example.lawyers.model.Services;

import com.example.lawyers.model.Entities.Services;
import com.example.lawyers.model.Repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceServices {


    //Object For Repository Class To Take All Information From DB
    private ServiceRepository serviceRepository;



    //Autowiring feature of spring framework To enables you to inject the object dependency implicitly.
    @Autowired
    public ServiceServices(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    public List<Services> getServices() {
        return serviceRepository.findAll();
    }

    public Optional<Services> getService(Integer service_ID) {
        return serviceRepository.findById(service_ID);
    }

    public void addNewService(Services services) {
        serviceRepository.save(services);
    }

}