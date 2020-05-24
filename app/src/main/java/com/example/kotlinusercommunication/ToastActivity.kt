package com.example.kotlinusercommunication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View

class ToastActivity() : AppCompatActivity(), Parcelable {

    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ToastActivity> {
        override fun createFromParcel(parcel: Parcel): ToastActivity {
            return ToastActivity(parcel)
        }

        override fun newArray(size: Int): Array<ToastActivity?> {
            return arrayOfNulls(size)
        }
    }
}
