package co.id.truemoney.midi.snap.servicemidi.Utils;

import lombok.Data;
import lombok.ToString;

import org.springframework.http.HttpStatus;

import co.id.truemoney.midi.snap.servicemidi.Config.Enum.MessageConstant;

@Data
@ToString
public class ResponseErrorException {
    private final String code;
    private final String message;
    private final HttpStatus httpCode;

    public ResponseErrorException() {
        this.code = MessageConstant.ISE_CODE + "any" + MessageConstant.SUCCESSFUL;
        this.message = MessageConstant.GE;
        this.httpCode = HttpStatus.BAD_REQUEST;
    }

    public ResponseErrorException(String message) {
        // super(message);
        this.httpCode = HttpStatus.BAD_REQUEST;
        this.message = message;
        this.code = MessageConstant.ISE_CODE + "any" + MessageConstant.SUCCESSFUL;
    }

    public ResponseErrorException(String code, String message, HttpStatus httpStatus) {
        this.message = message;
        this.code = code;
        this.httpCode = httpStatus;
    }

}
