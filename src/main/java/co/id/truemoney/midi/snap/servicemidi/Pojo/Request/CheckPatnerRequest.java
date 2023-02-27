package co.id.truemoney.midi.snap.servicemidi.Pojo.Request;

import lombok.Data;

@Data
public class CheckPatnerRequest {
    private String partnerId;
    private String externalIdChannel;
    private String endpoint;
    private String serviceCode;

}
