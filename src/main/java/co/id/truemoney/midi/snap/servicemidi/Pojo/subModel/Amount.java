package co.id.truemoney.midi.snap.servicemidi.Pojo.subModel;

import com.fasterxml.jackson.annotation.JsonInclude.Include;

import co.id.truemoney.midi.snap.servicemidi.Config.Enum.MessageConstant;
import co.id.truemoney.midi.snap.servicemidi.Pojo.Interface.AccountInquiryCustomerTopUpInterface;
import co.id.truemoney.midi.snap.servicemidi.Utils.Constraint.LengthStringDoubleConstraint;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@JsonInclude(Include.NON_EMPTY)
@Data
public class Amount {

    // @LengthStingDoubleConstraint(
    // digit = 16,
    // desimal = 2,
    // message = MessageConstant.MESSAGE_INVALID_FORMAT + "#" +
    // MessageConstant.INVALID_FIELD_FORMAT,
    // groups = {InquiryInterface.class}
    // )
    // @NotBlank( // tidak boleh kosong
    // message = MessageConstant.MESSAGE_INVALID_MANDATORY + "#" +
    // MessageConstant.INVALID_MANDATORY_FIELD,
    // groups = {InquiryInterface.class}
    // )
    @LengthStringDoubleConstraint(digit = 16, desimal = 2, message = MessageConstant.MESSAGE_INVALID_FORMAT + "#"
            + MessageConstant.INVALID_FIELD_FORMAT, groups = { AccountInquiryCustomerTopUpInterface.class })
    @NotBlank(message = MessageConstant.MESSAGE_INVALID_MANDATORY + "#"
            + MessageConstant.INVALID_MANDATORY_FIELD, groups = { AccountInquiryCustomerTopUpInterface.class })
    private String value;

    @Size(min = 3, max = 3, message = MessageConstant.MESSAGE_INVALID_FORMAT + "#"
            + MessageConstant.INVALID_FIELD_FORMAT, groups = { AccountInquiryCustomerTopUpInterface.class })
    @NotBlank(message = MessageConstant.MESSAGE_INVALID_MANDATORY + "#"
            + MessageConstant.INVALID_MANDATORY_FIELD, groups = { AccountInquiryCustomerTopUpInterface.class })

    private String currency;
}
