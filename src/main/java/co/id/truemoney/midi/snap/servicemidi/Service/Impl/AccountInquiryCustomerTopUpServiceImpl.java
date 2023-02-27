package co.id.truemoney.midi.snap.servicemidi.Service.Impl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import co.id.truemoney.midi.snap.servicemidi.Pojo.response.AccountInquiryCustomerTopUpResponse;
import co.id.truemoney.midi.snap.servicemidi.Pojo.response.ServiceResponseAccountInquiryCustomerTopUp;
import co.id.truemoney.midi.snap.servicemidi.Pojo.subModel.FeeAmount;
import co.id.truemoney.midi.snap.servicemidi.Pojo.subModel.MaxAmount;
import co.id.truemoney.midi.snap.servicemidi.Pojo.subModel.MinAmount;
import co.id.truemoney.midi.snap.servicemidi.Service.AccountInquiryCustomerTopUpService;
import co.id.truemoney.midi.snap.servicemidi.Validation.AccountInquiryCustomerTopUp.AccountInquiryCustomerTopUpValidation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class AccountInquiryCustomerTopUpServiceImpl implements AccountInquiryCustomerTopUpService {

    @Override
    public AccountInquiryCustomerTopUpResponse inquiry(AccountInquiryCustomerTopUpValidation req,
            HttpServletRequest httpServletRequest, BindingResult bind, String codeService) {
        AccountInquiryCustomerTopUpResponse response = new AccountInquiryCustomerTopUpResponse();

        response.setResponseCode("2003700");
        response.setResponseMessage("Request has been processed successfully");
        response.setReferenceNo("2020102977770000000009");
        response.setPartnerReferenceNo(req.getPartnerReferenceNo().get());
        response.setSessionId("883737GHY8839");
        response.setCustomerNumber(req.getCustomerNumber());
        response.setCustomerName("fadli yandra");
        response.setCustomerMonthlyInLimit("100000");

        // req.setMinAmount(new MinAmount());
        // req.getMinAmount().setValue("1233");
        // req.getMinAmount().setCurrency("12");
        // response.setMinAmount(new MinAmount());

        // req.setAmount(new Amount());
        // req.getAmount().setValue("a");
        // req.getAmount().setCurrency("a");

        response.setMinAmount(new MinAmount());
        response.getMinAmount().setValue("a");
        response.getMinAmount().setCurrency("IDR");

        response.setMaxAmount(new MaxAmount());
        response.getMaxAmount().setValue("b");
        response.getMaxAmount().setCurrency("IDR");

        response.setAmount(req.getAmount().get());

        response.setFeeAmount(new FeeAmount());
        response.getFeeAmount().setValue("c");
        response.getFeeAmount().setCurrency("idr");

        // response.setCustomerName("fadli yandra");
        response.setFeeType("admin fee");

        response.setAdditionalInfo(req.getAdditionalInfo().get());

        // response.setId(bookModel.getId());
        // response.setAuthor(req.getAuthor());
        // response.setDescription(req.getDescription());
        // response.setTitle(req.getTitle());

        return response;
    }

}
