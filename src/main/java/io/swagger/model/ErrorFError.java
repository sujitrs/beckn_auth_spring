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
 * ErrorFError
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-28T18:48:29.471+05:30[Asia/Calcutta]")
public class ErrorFError   {
  @JsonProperty("fpath")
  private String fpath = null;

  @JsonProperty("fcode")
  private String fcode = null;

  @JsonProperty("fmessage")
  private String fmessage = null;

  public ErrorFError fpath(String fpath) {
    this.fpath = fpath;
    return this;
  }

  /**
   * path to the specified field
   * @return fpath
  **/
  @ApiModelProperty(value = "path to the specified field")
  
    public String getFpath() {
    return fpath;
  }

  public void setFpath(String fpath) {
    this.fpath = fpath;
  }

  public ErrorFError fcode(String fcode) {
    this.fcode = fcode;
    return this;
  }

  /**
   * Field specific error code. For full list of error codes, refer to error_codes.md in the root folder of this repo.
   * @return fcode
  **/
  @ApiModelProperty(value = "Field specific error code. For full list of error codes, refer to error_codes.md in the root folder of this repo.")
  
    public String getFcode() {
    return fcode;
  }

  public void setFcode(String fcode) {
    this.fcode = fcode;
  }

  public ErrorFError fmessage(String fmessage) {
    this.fmessage = fmessage;
    return this;
  }

  /**
   * Get fmessage
   * @return fmessage
  **/
  @ApiModelProperty(value = "")
  
    public String getFmessage() {
    return fmessage;
  }

  public void setFmessage(String fmessage) {
    this.fmessage = fmessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorFError errorFError = (ErrorFError) o;
    return Objects.equals(this.fpath, errorFError.fpath) &&
        Objects.equals(this.fcode, errorFError.fcode) &&
        Objects.equals(this.fmessage, errorFError.fmessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fpath, fcode, fmessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorFError {\n");
    
    sb.append("    fpath: ").append(toIndentedString(fpath)).append("\n");
    sb.append("    fcode: ").append(toIndentedString(fcode)).append("\n");
    sb.append("    fmessage: ").append(toIndentedString(fmessage)).append("\n");
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
