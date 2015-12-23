package com.podraza.android.habit.habitbuilder;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by adampodraza on 12/23/15.
 */
public class Habit implements Parcelable, Serializable {

    private int hour;
    private int minute;

    public Habit(int hour, int minute) {

        this.hour = hour;
        this.minute = minute;
    }


    protected Habit(Parcel in) {
        hour = in.readInt();
        minute = in.readInt();
    }

    public static final Creator<Habit> CREATOR = new Creator<Habit>() {
        @Override
        public Habit createFromParcel(Parcel in) {
            return new Habit(in);
        }

        @Override
        public Habit[] newArray(int size) {
            return new Habit[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeInt(hour);
        dest.writeInt(minute);
    }


}
