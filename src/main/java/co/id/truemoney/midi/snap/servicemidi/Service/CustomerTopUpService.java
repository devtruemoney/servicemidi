package co.id.truemoney.midi.snap.servicemidi.Service;

import co.id.truemoney.midi.snap.servicemidi.Pojo.response.CustomerTopUpResponse;
import co.id.truemoney.midi.snap.servicemidi.Validation.CustomerTopUp.CustomerTopUpValidation;

public interface CustomerTopUpService {
    public CustomerTopUpResponse topup(CustomerTopUpValidation req);

}
