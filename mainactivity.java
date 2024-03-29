<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <EditText
        android:id="@+id/guessingNumber"
        android:layout_width="match_parent"
        android:layout_height="56dp"
        android:layout_marginTop="40dp"
        android:ems="10"
        android:hint="Guess the number"
        android:inputType="phone"
        android:textColor="#651FFF"
        android:textColorHint="#00B0FF"
        android:textSize="20sp"
        android:textStyle="bold" />

    <Button
        android:id="@+id/selectNumber"
        android:layout_width="338dp"
        android:layout_height="66dp"
        android:layout_gravity="center"
        android:layout_marginTop="20dp"
        android:text="Select Number"
        android:textColor="#FFEA00"
        android:textStyle="bold|italic" />

    <Button
        android:id="@+id/changeNumber"
        android:layout_width="338dp"
        android:layout_height="66dp"
        android:layout_gravity="center"
        android:layout_marginTop="20dp"
        android:gravity="center"
        android:text="Change Random Number"
        android:textColor="#FFEA00"
        android:textStyle="bold|italic" />

    <TextView
        android:id="@+id/result"
        android:layout_width="match_parent"
        android:layout_height="67dp"
        android:layout_marginTop="30dp"
        android:gravity="center"
        android:textColor="#F50057"
        android:textSize="20sp"
        android:textStyle="bold" />
</LinearLayout>
