package com.example.android.quakereport;

public class Earthquake {
    // magnitude
    private String mMagnitude;

    // City names
    private String mLocation;

    // Date and time
    private long mDate;


    public Earthquake(String magnitude, String location, long date)
    {
        mMagnitude = magnitude;
        mLocation = location;
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
    public String getLocation() {
        return mLocation;
    }

    /**
     * Get the date
     */
    public long getTimeInMilliseconds() {
        return mDate;
    }
}
