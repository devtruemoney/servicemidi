package co.id.truemoney.midi.snap.servicemidi.Pojo.subModel;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Data;

@Data
@JsonInclude(Include.NON_EMPTY)
public class FeeAmount {
    private String value;
    private String currency;

}
