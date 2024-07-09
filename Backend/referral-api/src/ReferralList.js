import React, { Component } from 'react';
import ReferralService from './ReferralService';

class ReferralList extends Component {
    constructor(props) {
        super(props);
        this.state = {
            referrals: []
        };
    }

    componentDidMount() {
        ReferralService.getAllReferrals().then((response) => {
            this.setState({ referrals: response.data });
        });
    }

    render() {
        return (
            <div>
                <h2 className="text-center">Referral List</h2>
                <table className="table table-striped">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Email</th>
                            <th>Phone</th>
                            <th>Referred By</th>
                            <th>Message</th>
                        </tr>
                    </thead>
                    <tbody>
                        {this.state.referrals.map((referral) => (
                            <tr key={referral.id}>
                                <td>{referral.id}</td>
                                <td>{referral.name}</td>
                                <td>{referral.email}</td>
                                <td>{referral.phone}</td>
                                <td>{referral.referredBy}</td>
                                <td>{referral.message}</td>
                            </tr>
                        ))}
                    </tbody>
                </table>
            </div>
        );
    }
}

export default ReferralList;