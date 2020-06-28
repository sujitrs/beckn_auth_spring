package io.swagger.api;

import io.swagger.model.Body;
import io.swagger.model.InlineResponse200;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-28T18:48:29.471+05:30[Asia/Calcutta]")
@Controller
public class TokensApiController implements TokensApi {

    private static final Logger log = LoggerFactory.getLogger(TokensApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TokensApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse200> tokensPost(@ApiParam(value = ""  )  @Valid @RequestBody Body body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse200>(objectMapper.readValue("{\r\n  \"context\" : {\r\n    \"transaction_id\" : \"transaction_id\",\r\n    \"domain\" : \"MOBILITY\",\r\n    \"action\" : \"search\",\r\n    \"message_id\" : \"message_id\",\r\n    \"version\" : \"version\",\r\n    \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"\r\n  },\r\n  \"message\" : {\r\n    \"tokens\" : [ \"\", \"\" ]\r\n  },\r\n  \"error\" : {\r\n    \"f_error\" : [ {\r\n      \"fmessage\" : \"fmessage\",\r\n      \"fpath\" : \"fpath\",\r\n      \"fcode\" : \"fcode\"\r\n    }, {\r\n      \"fmessage\" : \"fmessage\",\r\n      \"fpath\" : \"fpath\",\r\n      \"fcode\" : \"fcode\"\r\n    } ],\r\n    \"t_error\" : {\r\n      \"t_code\" : \"t_code\",\r\n      \"t_protocol\" : \"t_protocol\",\r\n      \"t_version\" : \"t_version\"\r\n    },\r\n    \"r_error\" : {\r\n      \"rmessage\" : \"rmessage\",\r\n      \"rcode\" : \"rcode\"\r\n    },\r\n    \"d_error\" : { }\r\n  }\r\n}", InlineResponse200.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse200>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse200>(HttpStatus.NOT_IMPLEMENTED);
    }

}
