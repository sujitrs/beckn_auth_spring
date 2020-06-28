package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Context;
import io.swagger.model.Error;
import io.swagger.model.InlineResponse200Message;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse200
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-28T18:48:29.471+05:30[Asia/Calcutta]")
public class InlineResponse200   {
  @JsonProperty("context")
  private Context context = null;

  @JsonProperty("message")
  private InlineResponse200Message message = null;

  @JsonProperty("error")
  private Error error = null;

  public InlineResponse200 context(Context context) {
    this.context = context;
    return this;
  }

  /**
   * Get context
   * @return context
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Context getContext() {
    return context;
  }

  public void setContext(Context context) {
    this.context = context;
  }

  public InlineResponse200 message(InlineResponse200Message message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public InlineResponse200Message getMessage() {
    return message;
  }

  public void setMessage(InlineResponse200Message message) {
    this.message = message;
  }

  public InlineResponse200 error(Error error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Error getError() {
    return error;
  }

  public void setError(Error error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.context, inlineResponse200.context) &&
        Objects.equals(this.message, inlineResponse200.message) &&
        Objects.equals(this.error, inlineResponse200.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, message, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
