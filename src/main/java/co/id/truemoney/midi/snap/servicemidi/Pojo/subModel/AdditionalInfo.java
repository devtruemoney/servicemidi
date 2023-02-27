package co.id.truemoney.midi.snap.servicemidi.Pojo.subModel;

import java.util.Optional;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import co.id.truemoney.midi.snap.servicemidi.Config.Enum.MessageConstant;
import co.id.truemoney.midi.snap.servicemidi.Pojo.Interface.AccountInquiryCustomerTopUpInterface;
import lombok.Data;

@Data
@JsonInclude(Include.NON_EMPTY)
public class AdditionalInfo {

    private Optional<@Size(max = 64, message = MessageConstant.MESSAGE_INVALID_FORMAT + "#"
            + MessageConstant.INVALID_FIELD_FORMAT, groups = {
                    AccountInquiryCustomerTopUpInterface.class }) String> deviceId;

    private Optional<@Size(max = 64, message = MessageConstant.MESSAGE_INVALID_FORMAT + "#"
            + MessageConstant.INVALID_FIELD_FORMAT, groups = {
                    AccountInquiryCustomerTopUpInterface.class }) String> channel;

}
