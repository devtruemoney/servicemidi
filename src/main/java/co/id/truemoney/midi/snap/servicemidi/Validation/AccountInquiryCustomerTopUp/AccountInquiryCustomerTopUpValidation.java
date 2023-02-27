package co.id.truemoney.midi.snap.servicemidi.Validation.AccountInquiryCustomerTopUp;

import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import co.id.truemoney.midi.snap.servicemidi.Config.Enum.MessageConstant;
import co.id.truemoney.midi.snap.servicemidi.Pojo.Interface.AccountInquiryCustomerTopUpInterface;
import co.id.truemoney.midi.snap.servicemidi.Pojo.subModel.AdditionalInfo;
import co.id.truemoney.midi.snap.servicemidi.Pojo.subModel.Amount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountInquiryCustomerTopUpValidation {

    private Optional<@Size(max = 64, message = MessageConstant.MESSAGE_INVALID_FORMAT + "#"
            + MessageConstant.INVALID_FIELD_FORMAT, groups = AccountInquiryCustomerTopUpInterface.class) String> partnerReferenceNo;

    /// private String partnerReferenceNo;

    private String customerNumber; // cari contoh conditional

    // private Amount amount;

    private Optional<@Valid Amount> amount;

    private String transactionDate; // validasi type data date

    // private AdditionalInfo additionalInfo;

    private Optional<@Valid AdditionalInfo> additionalInfo;

}
