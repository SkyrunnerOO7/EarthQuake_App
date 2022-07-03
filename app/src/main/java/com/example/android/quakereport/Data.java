package com.example.android.quakereport;

public class Data {
    // magnitude
    private String mMagnitude;

    // City names
    private String mCity;

    // Date and time
    private String mDate;


    public Data(String magnitude, String city, String date)
    {
        mMagnitude = magnitude;
        mCity = city;
        mDate = date;
    }

    /**
     * Get the magnitude
     */
    public String getMagnitude() {
        return mMagnitude;
    }

    /**
     * Get the City name
     */
    public String getCity() {
        return mCity;
    }

    /**
     * Get the date
     */
    public String getDate() {
        return mDate;
    }
}
