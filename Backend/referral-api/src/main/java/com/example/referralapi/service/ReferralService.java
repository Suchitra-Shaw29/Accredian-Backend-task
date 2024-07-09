package com.example.referralapi.service;

import com.example.referralapi.exception.ResourceNotFoundException;
import com.example.referralapi.repository.Referral;
import com.example.referralapi.repository.ReferralRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReferralService {
    
    @Autowired
    private ReferralRepository referralRepository;

    public com.example.referralapi.service.Referral createReferral(com.example.referralapi.repository.Referral referral) {
        return referralRepository.save(referral);
    }

    public ReferralService() {
    }

    public List<com.example.referralapi.repository.Referral> getAllReferrals() {
        return referralRepository.findAll();
    }

    public Optional<com.example.referralapi.service.Referral> getReferralById(Long id) {
        return referralRepository.findById(id);
    }

    public com.example.referralapi.service.Referral updateReferral(Long id, Referral referralDetails){
        com.example.referralapi.service.Referral referral = referralRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Referral not found for this id :: " + id));
        referral.setName(referralDetails.getName());
        referral.setEmail(referralDetails.getEmail());
        referral.setPhone(referralDetails.getPhone());
        referral.setReferredBy(referralDetails.getReferredBy());
        referral.setMessage(referralDetails.getMessage());
        return referralRepository.save(referral);
    }

    public void deleteReferral(Long id) {
        com.example.referralapi.service.Referral referral = referralRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Referral not found for this id :: " + id));
        referralRepository.delete(referral);
    }

    public ReferralRepository getReferralRepository() {
        return referralRepository;
    }

    public void setReferralRepository(ReferralRepository referralRepository) {
        this.referralRepository = referralRepository;
    }

    

    
}
