package com.example.christiancarl.recyclingview;

/**
 * Created by Christian Carl on 14/09/2017.
 */

public class AndroidVersion {
    int logo;
    String codeName, version, api, date;

    public AndroidVersion(int logo, String codeName
            , String version, String api, String date){
        this.logo = logo;
        this.codeName = codeName;
        this.version = version;
        this.api = api;
        this.date = date;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
