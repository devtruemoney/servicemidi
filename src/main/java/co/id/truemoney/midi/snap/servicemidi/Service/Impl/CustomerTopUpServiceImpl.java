package co.id.truemoney.midi.snap.servicemidi.Service.Impl;

import org.springframework.stereotype.Service;

import co.id.truemoney.midi.snap.servicemidi.Pojo.response.CustomerTopUpResponse;
import co.id.truemoney.midi.snap.servicemidi.Service.CustomerTopUpService;
import co.id.truemoney.midi.snap.servicemidi.Validation.CustomerTopUp.CustomerTopUpValidation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerTopUpServiceImpl implements CustomerTopUpService {

    @Override
    public CustomerTopUpResponse topup(CustomerTopUpValidation req) {
        // TODO Auto-generated method stub

        CustomerTopUpResponse response = new CustomerTopUpResponse();
        response.setResponseCode("");
        response.setResponseMessage("Request has been processed successfully");
        response.setReferenceNo("2020102977770000000009");
        response.setPartnerReferenceNo(req.getPartnerReferenceNo());
        response.setSessionId("883737GHY8839");
        response.setCustomerNumber(req.getCustomerNumber());
        response.setReferenceNumber("123");
        response.setAmount(req.getAmount());
        response.setAdditionalInfo(req.getAdditionalInfo());

        return response;
    }

}
