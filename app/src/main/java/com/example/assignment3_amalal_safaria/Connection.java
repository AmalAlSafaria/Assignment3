package com.example.assignment3_amalal_safaria;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;


public class Connection {

    public static NetworkInfo getNetworkInfo(Context context){
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo();
    }



    public static boolean isConnectedWifi(Context context){

        NetworkInfo info = Connection.getNetworkInfo(context);
        return (info != null && info.isConnected() && info.getType() == ConnectivityManager.TYPE_WIFI);
    }


}
