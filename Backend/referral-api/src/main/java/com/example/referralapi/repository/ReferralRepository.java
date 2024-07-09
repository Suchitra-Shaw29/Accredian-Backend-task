package com.example.referralapi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ReferralRepository extends JpaRepository<Referral, Long>{

    private Referral referral;

    public ReferralRepository() {
    }

    public List<com.example.referralapi.repository.Referral> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

	public Optional<com.example.referralapi.service.Referral> findById(Long id) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'findById'");
	}

    
    

    public void deleteById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    public com.example.referralapi.service.Referral save(Referral referral) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    

    @Override
    public String toString() {
        return "ReferralRepository []";
    }

    public void delete(Referral referral) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    public com.example.referralapi.service.Referral save(com.example.referralapi.service.Referral referral) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    public void delete(com.example.referralapi.service.Referral referral) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    public Referral getReferral() {
        return referral;
    }

    public void setReferral(Referral referral) {
        this.referral = referral;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((referral == null) ? 0 : referral.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ReferralRepository other = (ReferralRepository) obj;
        if (referral == null) {
            if (other.referral != null)
                return false;
        } else if (!referral.equals(other.referral))
            return false;
        return true;
    }
    
}
