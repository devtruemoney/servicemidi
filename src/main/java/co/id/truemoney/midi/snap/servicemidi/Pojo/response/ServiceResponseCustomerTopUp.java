package co.id.truemoney.midi.snap.servicemidi.Pojo.response;

import org.springframework.http.HttpStatus;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ServiceResponseCustomerTopUp {

    private HttpStatus httpStatus;
    private CustomerTopUpResponse customerTopUpResponse;

}
