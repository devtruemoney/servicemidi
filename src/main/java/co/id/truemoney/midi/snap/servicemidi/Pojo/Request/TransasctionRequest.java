package co.id.truemoney.midi.snap.servicemidi.Pojo.Request;

import lombok.Data;

@Data
public class TransasctionRequest {
    private String partnerId;
    private String externalIdChannel;
    private String endpoint;
    private String serviceCode;

}
