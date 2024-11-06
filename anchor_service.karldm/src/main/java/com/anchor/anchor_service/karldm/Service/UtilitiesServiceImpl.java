package com.anchor.anchor_service.karldm.Service;

import com.anchor.anchor_service.karldm.Entity.Utilities;
import com.anchor.anchor_service.karldm.Repository.UtilitiesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilitiesServiceImpl {

    private final UtilitiesRepository utilitiesRepository;

    public UtilitiesServiceImpl(UtilitiesRepository utilitiesRepository) {
        this.utilitiesRepository = utilitiesRepository;
    }

    public List<Utilities> getUtilities(){
        return utilitiesRepository.findAll();
    }

    public void updateUtilities(List<Utilities> utilities){
        utilitiesRepository.saveAll(utilities);
    }

}
