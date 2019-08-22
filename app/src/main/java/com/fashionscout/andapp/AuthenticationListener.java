package com.fashionscout.andapp;

/**
 * Created by riemann on 7/12/19.
 */

public interface AuthenticationListener {
    void onTokenReceived(String auth_token);
}

