package com.bookstore.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by z00382545 on 12/31/16.
 */

@Entity
public class UserShipping implements Serializable {

    private static final long serialVersionUID = 8677843208804579382L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userShippingName;
    private String userShippingStreet1;
    private String userShippingStreet2;
    private String userShippingCity;
    private String userShippingState;
    private String userShippingCountry;
    private String userShippingZipcode;
    private boolean userShippingDefault;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserShippingStreet1() {
        return userShippingStreet1;
    }

    public void setUserShippingStreet1(String userShippingStreet1) {
        this.userShippingStreet1 = userShippingStreet1;
    }

    public String getUserShippingStreet2() {
        return userShippingStreet2;
    }

    public void setUserShippingStreet2(String userShippingStreet2) {
        this.userShippingStreet2 = userShippingStreet2;
    }

    public String getUserShippingCity() {
        return userShippingCity;
    }

    public void setUserShippingCity(String userShippingCity) {
        this.userShippingCity = userShippingCity;
    }

    public String getUserShippingState() {
        return userShippingState;
    }

    public void setUserShippingState(String userShippingState) {
        this.userShippingState = userShippingState;
    }

    public String getUserShippingCountry() {
        return userShippingCountry;
    }

    public void setUserShippingCountry(String userShippingCountry) {
        this.userShippingCountry = userShippingCountry;
    }

    public String getUserShippingZipcode() {
        return userShippingZipcode;
    }

    public void setUserShippingZipcode(String userShippingZipcode) {
        this.userShippingZipcode = userShippingZipcode;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isUserShippingDefault() {
        return userShippingDefault;
    }

    public void setUserShippingDefault(boolean userShippingDefault) {
        this.userShippingDefault = userShippingDefault;
    }

    public String getUserShippingName() {
        return userShippingName;
    }

    public void setUserShippingName(String userShippingName) {
        this.userShippingName = userShippingName;
    }
}
