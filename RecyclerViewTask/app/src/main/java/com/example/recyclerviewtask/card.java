package com.example.recyclerviewtask;

import android.os.Parcel;
import android.os.Parcelable;

public class card implements Parcelable {
    int image;
    String name;

    public card(int image, String name) {
        this.image = image;
        this.name = name;
    }

    protected card(Parcel in) {
        image = in.readInt();
        name = in.readString();
    }

    public static final Creator<card> CREATOR = new Creator<card>() {
        @Override
        public card createFromParcel(Parcel in) {
            return new card(in);
        }

        @Override
        public card[] newArray(int size) {
            return new card[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(image);
        parcel.writeString(name);
    }
}
