package pojoClasses.userPojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserPojo {
    /**@Author
     * Rim Gammoudi
     */

    // Properties for userPojo
    @JsonProperty("email")
    private String email;
    @JsonProperty("password")
    private String password;


    public UserPojo(String email, String password) {
        this.email = email;
        this.password = password;

    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    /**
     * Setters of Registartaion pojo
     *
     */

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
