package co.id.truemoney.midi.snap.servicemidi.Pojo.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import co.id.truemoney.midi.snap.servicemidi.Pojo.subModel.AdditionalInfo;
import co.id.truemoney.midi.snap.servicemidi.Pojo.subModel.Amount;
import lombok.Data;

@JsonInclude(Include.NON_EMPTY)
@Data
public class CustomerTopUpResponse {

    private String responseCode;
    private String responseMessage;
    private String referenceNo;
    private String partnerReferenceNo;
    private String sessionId;
    private String customerNumber;
    private String referenceNumber;
    private Amount amount;
    private AdditionalInfo additionalInfo;

}
