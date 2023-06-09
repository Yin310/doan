package com.itsol.recruit.web.vm;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class LoginVM {
    //    @Scha(description = "User name of the User.", example = Constants.Api.FieldExample.USER_NAME, required = true)

  /*  @NotNull(message = Constants.ValidationMessage.FIELD_IS_REQUIRED)
=======
   /* @NotNull(message = Constants.ValidationMessage.FIELD_IS_REQUIRED)

    @Pattern(regexp = "^[\\w\\d]{5,20}$", message = Constants.ValidationMessage.INVALID_USER_NAME)*/
    private String userName;

    //    @Schema(description = "Password of the User.", example = Constants.Api.FieldExample.PASSWORD, required = true)

/*    @NotNull
=======
  /*  @NotNull

    @Size(min = 6, max = 32, message = Constants.ValidationMessage.INVALID_SIZE_VALUE)
   @Pattern(regexp = "^[\\w\\d$&+,:;=?@#|'<>.^*()%!-]*", message = Constants.ValidationMessage.INVALID_PASSWORD)*/
    private String password;

    @NotNull
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private Boolean rememberMe=true;
}
