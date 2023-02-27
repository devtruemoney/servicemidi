package co.id.truemoney.midi.snap.servicemidi.Pojo.subModel;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Data
@JsonInclude(Include.NON_EMPTY)
public class NotifyBulkObject {

    private String customerNumber;

    private String customerName;

    private Amount amount;

    private AdditionalInfo additionalInfo;

    private String referenceNo;

    private String partnerReferenceNo;

    private String responseCode;

    private String responseMessage;

}
