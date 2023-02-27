package co.id.truemoney.midi.snap.servicemidi.Validation.CustomerTopUp;

import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import co.id.truemoney.midi.snap.servicemidi.Config.Enum.MessageConstant;
import co.id.truemoney.midi.snap.servicemidi.Pojo.Interface.CustomerTopUpInterface;
import co.id.truemoney.midi.snap.servicemidi.Pojo.subModel.AdditionalInfo;
import co.id.truemoney.midi.snap.servicemidi.Pojo.subModel.Amount;
import co.id.truemoney.midi.snap.servicemidi.Pojo.subModel.FeeAmount;
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
public class CustomerTopUpValidation {

    // @Size(max = 64, message = MessageConstant.MESSAGE_INVALID_FORMAT + "#"
    // + MessageConstant.INVALID_FIELD_FORMAT, groups =
    // CustomerTopUpInterface.class)
    // @NotBlank( // mandatory
    // message = MessageConstant.MESSAGE_INVALID_MANDATORY + "#"
    // + MessageConstant.INVALID_MANDATORY_FIELD, groups =
    // CustomerTopUpInterface.class)

    private String partnerReferenceNo;

    // Optional<@Size(max = 32,
    // // min = 2,
    // message = MessageConstant.MESSAGE_INVALID_FORMAT + "#"
    // + MessageConstant.INVALID_FIELD_FORMAT, groups =
    // CustomerTopUpInterface.class) String> customerNumber;

    // Optional<@Size(max = 255,
    // // min = 2,
    // message = MessageConstant.MESSAGE_INVALID_FORMAT + "#"
    // + MessageConstant.INVALID_FIELD_FORMAT, groups =
    // CustomerTopUpInterface.class) String> customerName;

    private String customerNumber;
    private String customerName;

    private Amount amount;
    // private Optional<@Valid Amount> amount;

    private FeeAmount feeAmount;

    private String transactionDate;

    private String sessionId;

    private String categoryId;

    private String notes;

    private AdditionalInfo additionalInfo;

    // private Optional<@Valid AdditionalInfo> additionalInfo;

}
