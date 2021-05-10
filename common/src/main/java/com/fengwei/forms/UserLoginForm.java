package com.fengwei.forms;

import javax.validation.constraints.NotBlank;
import java.util.Objects;

public class UserLoginForm {

    @NotBlank
    private String username;

    @NotBlank
    private String password;

    public UserLoginForm() {
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UserLoginForm)) return false;
        final UserLoginForm other = (UserLoginForm) o;
        if (!other.canEqual(this)) return false;
        final Object this$username = this.getUsername();
        final Object other$username = other.getUsername();
        if (!Objects.equals(this$username,other$username)) return false;
        final Object this$password = this.getPassword();
        final Object other$password = other.getPassword();
        return Objects.equals(this$password,other$password);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserLoginForm;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $username = this.getUsername();
        result = result * PRIME + ($username == null ? 43 : $username.hashCode());
        final Object $password = this.getPassword();
        result = result * PRIME + ($password == null ? 43 : $password.hashCode());
        return result;
    }

    public String toString() {
        return "UserLoginForm(username=" + this.getUsername() + ", password=" + this.getPassword() + ")";
    }
}
