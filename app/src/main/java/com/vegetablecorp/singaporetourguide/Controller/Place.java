package com.vegetablecorp.singaporetourguide.Controller;

public class Place {

    /** Constant value that represents no image was provided for this place */
    private static final int NO_IMAGE_PROVIDED = -1;

    private String mName;
    private String mLocation;
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    // Constructor for Location and address
    public Place(String mName, String mLocation) {
        this.mName = mName;
        this.mLocation = mLocation;
    }

    // Constructor for Location and address and image
    public Place(String mName, String mLocation, int mImageResourceID) {
        this.mName = mName;
        this.mLocation = mLocation;
        this.mImageResourceID = mImageResourceID;
    }

    public String getmName() {
        return mName;
    }

    public String getmLocation() {
        return mLocation;
    }

    public int getmImageResourceID() {
        return mImageResourceID;
    }

    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Place{" +
                "mName='" + mName + '\'' +
                ", mLocation='" + mLocation + '\'' +
                ", mImageResourceID='" + mImageResourceID + '\'' +
                '}';
    }
}
