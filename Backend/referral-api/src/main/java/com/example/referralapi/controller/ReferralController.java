package com.example.referralapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.referralapi.repository.Referral;
import com.example.referralapi.service.ReferralService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/referrals")
public class ReferralController {

    @Autowired
    private ReferralService referralService;

    @PostMapping
    public com.example.referralapi.service.Referral createReferral(@Valid @RequestBody Referral referral) {
        return referralService.createReferral(referral);
    }

    @GetMapping
    public List<Referral> getAllReferrals() {
        return referralService.getAllReferrals();
    }

    @GetMapping("/{id}")
    public ResponseEntity<com.example.referralapi.service.Referral> getReferralById(@PathVariable Long id) {
        com.example.referralapi.service.Referral referral = referralService.getReferralById(id).orElseThrow();
        return ResponseEntity.ok(referral);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Referral> updateReferral(@PathVariable Long id, @Valid @RequestBody Referral referralDetails) {
        Referral updatedReferral = (Referral) referralService.updateReferral(id, referralDetails);
        return ResponseEntity.ok(updatedReferral);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReferral(@PathVariable Long id) {
        referralService.deleteReferral(id);
        return ResponseEntity.noContent().build();
    }

    public ReferralService getReferralService() {
        return referralService;
    }

    public void setReferralService(ReferralService referralService) {
        this.referralService = referralService;
    }
}
