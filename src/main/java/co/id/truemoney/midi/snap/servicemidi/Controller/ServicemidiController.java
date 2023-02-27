package co.id.truemoney.midi.snap.servicemidi.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.id.truemoney.midi.snap.servicemidi.Pojo.Interface.AccountInquiryCustomerTopUpInterface;
import co.id.truemoney.midi.snap.servicemidi.Pojo.response.AccountInquiryCustomerTopUpResponse;
import co.id.truemoney.midi.snap.servicemidi.Pojo.response.CustomerTopUpResponse;
import co.id.truemoney.midi.snap.servicemidi.Pojo.response.ServiceResponseAccountInquiryCustomerTopUp;
import co.id.truemoney.midi.snap.servicemidi.Service.AccountInquiryCustomerTopUpService;
import co.id.truemoney.midi.snap.servicemidi.Service.CustomerTopUpService;
import co.id.truemoney.midi.snap.servicemidi.Validation.AccountInquiryCustomerTopUp.AccountInquiryCustomerTopUpValidation;
import co.id.truemoney.midi.snap.servicemidi.Validation.CustomerTopUp.CustomerTopUpValidation;

@RestController
public class ServicemidiController {

    @Autowired
    AccountInquiryCustomerTopUpService accountInquiryCustomerTopUpService;

    @Autowired
    CustomerTopUpService customerTopUpService;

    @Autowired
    HttpServletRequest httpServletRequest;

    @Value("${service.code.inquiry}")
    String serviceInquiry;

    // @PostMapping("/addInquiryCustomerTopUp")
    // public AccountInquiryCustomerTopUpResponse saveInquiry(@RequestBody
    // AccountInquiryCustomerTopUpValidation request) {
    // return accountInquiryCustomerTopUpService.inquiry(request);
    // }

    @PostMapping("/addInquiryCustomerTopUp")
    // @CrossOrigin(allowedHeaders = "ACCESS_TOKEN,TIME_OF_CALL ,X_SIGNATURE, Host", origins = "*" )
    public ResponseEntity<?> saveInquiry (    //responentity mewakili seluruh respon http
        @Validated(AccountInquiryCustomerTopUpInterface.class) @RequestBody AccountInquiryCustomerTopUpValidation req,  //@validate untuk validasi grup  //@Requestbody hhtp requestdoamain
        BindingResult bind   //binding result menyimoan hasil validasi dan mengeluarkan pengecualian
    ) throws Exception{   //handling error
        ServiceResponseAccountInquiryCustomerTopUp result = AccountInquiryCustomerTopUpService.inquiry(req, httpServletRequest, bind, serviceInquiry); 
        return new ResponseEntity<>(result.getAccountInquiryCustomerTopUpResponse(), result.getHttpStatus());
    }

    @PostMapping("/addCustomerTopUp")
    public CustomerTopUpResponse saveTopUp(@RequestBody CustomerTopUpValidation request) {
        return customerTopUpService.topup(request);

    }

}
