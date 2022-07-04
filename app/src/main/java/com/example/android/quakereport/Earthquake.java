package com.example.android.quakereport;

public class Earthquake {
    // magnitude
    private double mMagnitude;

    // City names
    private String mLocation;

    // Date and time
    private long mDate;

    // Url of the earthquake
    private String mUrl;


    public Earthquake(Double magnitude, String location, long date, String url)
    {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
        mUrl = url;
    }

    /**
     * Get the magnitude
     */
    public double getMagnitude() {
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

    public String getUrl() {
        return mUrl;
    }
}
