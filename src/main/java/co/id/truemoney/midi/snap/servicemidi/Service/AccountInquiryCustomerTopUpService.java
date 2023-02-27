package co.id.truemoney.midi.snap.servicemidi.Service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.validation.BindingResult;

//import co.id.truemoney.midi.snap.servicemidi.Pojo.response.AccountInquiryCustomerTopUpResponse;
import co.id.truemoney.midi.snap.servicemidi.Pojo.response.ServiceResponseAccountInquiryCustomerTopUp;
import co.id.truemoney.midi.snap.servicemidi.Validation.AccountInquiryCustomerTopUp.AccountInquiryCustomerTopUpValidation;

public interface AccountInquiryCustomerTopUpService {
    public ServiceResponseAccountInquiryCustomerTopUp inquiry(AccountInquiryCustomerTopUpValidation req,
            HttpServletRequest httpServletRequest, BindingResult bind, String codeService);

}
