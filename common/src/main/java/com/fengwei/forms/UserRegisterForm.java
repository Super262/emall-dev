package com.fengwei.forms;

import javax.validation.constraints.NotBlank;
import java.util.Objects;

public class UserRegisterForm {

    //@NotBlank 用于 String 判断空格
    //@NotEmpty 用于集合
    //@NotNull
    @NotBlank
    private String username;

    @NotBlank
    private String password;

    @NotBlank
    private String email;

    public UserRegisterForm() {
    }

    public @NotBlank String getUsername() {
        return this.username;
    }

    public void setUsername(@NotBlank String username) {
        this.username = username;
    }

    public @NotBlank String getPassword() {
        return this.password;
    }

    public void setPassword(@NotBlank String password) {
        this.password = password;
    }

    public @NotBlank String getEmail() {
        return this.email;
    }

    public void setEmail(@NotBlank String email) {
        this.email = email;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UserRegisterForm)) return false;
        final UserRegisterForm other = (UserRegisterForm) o;
        if (!other.canEqual(this)) return false;
        final Object this$username = this.getUsername();
        final Object other$username = other.getUsername();
        if (!Objects.equals(this$username,other$username)) return false;
        final Object this$password = this.getPassword();
        final Object other$password = other.getPassword();
        if (!Objects.equals(this$password,other$password)) return false;
        final Object this$email = this.getEmail();
        final Object other$email = other.getEmail();
        return Objects.equals(this$email,other$email);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserRegisterForm;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $username = this.getUsername();
        result = result * PRIME + ($username == null ? 43 : $username.hashCode());
        final Object $password = this.getPassword();
        result = result * PRIME + ($password == null ? 43 : $password.hashCode());
        final Object $email = this.getEmail();
        result = result * PRIME + ($email == null ? 43 : $email.hashCode());
        return result;
    }

    public String toString() {
        return "UserRegisterForm(username=" + this.getUsername() + ", password=" + this.getPassword() + ", email=" + this.getEmail() + ")";
    }
}
