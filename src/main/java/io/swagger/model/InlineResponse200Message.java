package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse200Message
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-28T18:48:29.471+05:30[Asia/Calcutta]")
public class InlineResponse200Message   {
  @JsonProperty("tokens")
  @Valid
  private List<Object> tokens = null;

  public InlineResponse200Message tokens(List<Object> tokens) {
    this.tokens = tokens;
    return this;
  }

  public InlineResponse200Message addTokensItem(Object tokensItem) {
    if (this.tokens == null) {
      this.tokens = new ArrayList<Object>();
    }
    this.tokens.add(tokensItem);
    return this;
  }

  /**
   * Get tokens
   * @return tokens
  **/
  @ApiModelProperty(value = "")
  
    public List<Object> getTokens() {
    return tokens;
  }

  public void setTokens(List<Object> tokens) {
    this.tokens = tokens;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200Message inlineResponse200Message = (InlineResponse200Message) o;
    return Objects.equals(this.tokens, inlineResponse200Message.tokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200Message {\n");
    
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
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
