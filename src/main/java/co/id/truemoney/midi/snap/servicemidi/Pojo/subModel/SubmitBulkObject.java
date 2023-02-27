package co.id.truemoney.midi.snap.servicemidi.Pojo.subModel;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Data
@JsonInclude(Include.NON_EMPTY)
public class SubmitBulkObject {

    private String accountNumber;

    private String accountName;

    private Amount amount;

    private String partnerReferenceNo;

    private AdditionalInfo additionalInfo;

}
