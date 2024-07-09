import axios from 'axios';

const API_URL = 'http://localhost:8080/api/v1/referrals';

class ReferralService {
    getAllReferrals() {
        return axios.get(API_URL);
    }

    createReferral(referral) {
        return axios.post(API_URL, referral);
    }

    getReferralById(id) {
        return axios.get(`${API_URL}/${id}`);
    }

    updateReferral(id, referral) {
        return axios.put(`${API_URL}/${id}`, referral);
    }

    deleteReferral(id) {
        return axios.delete(`${API_URL}/${id}`);
    }
}

export default new ReferralService();