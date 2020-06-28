package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Beckn response specific errors. Extension NOT ALLOWED
 */
@ApiModel(description = "Beckn response specific errors. Extension NOT ALLOWED")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-28T18:48:29.471+05:30[Asia/Calcutta]")
public class ErrorRError   {
  @JsonProperty("rcode")
  private String rcode = null;

  @JsonProperty("rmessage")
  private String rmessage = null;

  public ErrorRError rcode(String rcode) {
    this.rcode = rcode;
    return this;
  }

  /**
   * Get rcode
   * @return rcode
  **/
  @ApiModelProperty(value = "")
  
    public String getRcode() {
    return rcode;
  }

  public void setRcode(String rcode) {
    this.rcode = rcode;
  }

  public ErrorRError rmessage(String rmessage) {
    this.rmessage = rmessage;
    return this;
  }

  /**
   * Get rmessage
   * @return rmessage
  **/
  @ApiModelProperty(value = "")
  
    public String getRmessage() {
    return rmessage;
  }

  public void setRmessage(String rmessage) {
    this.rmessage = rmessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorRError errorRError = (ErrorRError) o;
    return Objects.equals(this.rcode, errorRError.rcode) &&
        Objects.equals(this.rmessage, errorRError.rmessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rcode, rmessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorRError {\n");
    
    sb.append("    rcode: ").append(toIndentedString(rcode)).append("\n");
    sb.append("    rmessage: ").append(toIndentedString(rmessage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
