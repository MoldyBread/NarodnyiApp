package com.company.narodnyiapp.login;

import android.content.Context;

import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserPool;
import com.amazonaws.regions.Regions;

public class CognitoSettings {
    private String userPoolId="eu-central-1_0Hg3PEcYt";
    private String clientId="4qa6v6h7li2uh4ccqmtcp39m9t";
    private String clientSecret = "g6jijldunijcvm4mcg774gbqe537oup4na7kncjvnlq515q15fp";
    private Regions cognitoRegion = Regions.EU_CENTRAL_1;

    private Context context;

    public CognitoSettings(Context context) {
        this.context = context;
    }

    public String getUserPoolId() {
        return userPoolId;
    }

    public String getClientId() {
        return clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public Regions getCognitoRegion() {
        return cognitoRegion;
    }

    public CognitoUserPool getUserPool(){
        return new CognitoUserPool(context,userPoolId,clientId,clientSecret,cognitoRegion);
    }
}
