package co.id.truemoney.midi.snap.servicemidi.Pojo.response;

import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import co.id.truemoney.midi.snap.servicemidi.Pojo.Interface.AccountInquiryCustomerTopUpInterface;
import co.id.truemoney.midi.snap.servicemidi.Pojo.subModel.AdditionalInfo;
import co.id.truemoney.midi.snap.servicemidi.Pojo.subModel.Amount;
import co.id.truemoney.midi.snap.servicemidi.Pojo.subModel.FeeAmount;
import co.id.truemoney.midi.snap.servicemidi.Pojo.subModel.MaxAmount;
import co.id.truemoney.midi.snap.servicemidi.Pojo.subModel.MinAmount;

// @JsonInclude(Include.NON_EMPTY)
@Data
public class AccountInquiryCustomerTopUpResponse {
    private String responseCode;
    private String responseMessage;
    private String referenceNo;
    private String partnerReferenceNo;
    private String sessionId;
    private String customerNumber;
    private String customerName;
    private String customerMonthlyInLimit;
    private MinAmount minAmount;
    private MaxAmount maxAmount;
    private Amount amount;
    private FeeAmount feeAmount;
    private String feeType;
    private AdditionalInfo additionalInfo;

}
