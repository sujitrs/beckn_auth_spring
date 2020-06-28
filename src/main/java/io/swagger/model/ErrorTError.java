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
 * ErrorTError
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-28T18:48:29.471+05:30[Asia/Calcutta]")
public class ErrorTError   {
  @JsonProperty("t_protocol")
  private String tProtocol = null;

  @JsonProperty("t_version")
  private String tVersion = null;

  @JsonProperty("t_code")
  private String tCode = null;

  public ErrorTError tProtocol(String tProtocol) {
    this.tProtocol = tProtocol;
    return this;
  }

  /**
   * Get tProtocol
   * @return tProtocol
  **/
  @ApiModelProperty(value = "")
  
    public String getTProtocol() {
    return tProtocol;
  }

  public void setTProtocol(String tProtocol) {
    this.tProtocol = tProtocol;
  }

  public ErrorTError tVersion(String tVersion) {
    this.tVersion = tVersion;
    return this;
  }

  /**
   * Get tVersion
   * @return tVersion
  **/
  @ApiModelProperty(value = "")
  
    public String getTVersion() {
    return tVersion;
  }

  public void setTVersion(String tVersion) {
    this.tVersion = tVersion;
  }

  public ErrorTError tCode(String tCode) {
    this.tCode = tCode;
    return this;
  }

  /**
   * Get tCode
   * @return tCode
  **/
  @ApiModelProperty(value = "")
  
    public String getTCode() {
    return tCode;
  }

  public void setTCode(String tCode) {
    this.tCode = tCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorTError errorTError = (ErrorTError) o;
    return Objects.equals(this.tProtocol, errorTError.tProtocol) &&
        Objects.equals(this.tVersion, errorTError.tVersion) &&
        Objects.equals(this.tCode, errorTError.tCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tProtocol, tVersion, tCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorTError {\n");
    
    sb.append("    tProtocol: ").append(toIndentedString(tProtocol)).append("\n");
    sb.append("    tVersion: ").append(toIndentedString(tVersion)).append("\n");
    sb.append("    tCode: ").append(toIndentedString(tCode)).append("\n");
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
