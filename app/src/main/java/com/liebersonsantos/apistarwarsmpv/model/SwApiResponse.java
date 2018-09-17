package com.liebersonsantos.apistarwarsmpv.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SwApiResponse implements Parcelable{

    @SerializedName("count")
    private int count;
    @SerializedName("next")
    private String next;
    @SerializedName("previous")
    private String previous;
    @SerializedName("result")
    private List<SwApiResult> swApiResults;

    public SwApiResponse() {
    }

    public SwApiResponse(int count, String next, String previous, List<SwApiResult> swApiResults) {
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.swApiResults = swApiResults;
    }

    protected SwApiResponse(Parcel in) {
        count = in.readInt();
        next = in.readString();
        previous = in.readString();
    }

    public static final Creator<SwApiResponse> CREATOR = new Creator<SwApiResponse>() {
        @Override
        public SwApiResponse createFromParcel(Parcel in) {
            return new SwApiResponse(in);
        }

        @Override
        public SwApiResponse[] newArray(int size) {
            return new SwApiResponse[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(count);
        dest.writeString(next);
        dest.writeString(previous);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public List<SwApiResult> getSwApiResults() {
        return swApiResults;
    }

    public void setSwApiResults(List<SwApiResult> swApiResults) {
        this.swApiResults = swApiResults;
    }
}
