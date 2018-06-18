package com.example.ssmspringboot2.util;

import java.net.InetAddress;

public class Util {
    public static String getIPAddress() throws Exception{
        InetAddress address = InetAddress.getLocalHost();
        String hostAddress = address.getHostAddress();
        return "http://"+hostAddress + ':' + Constant.port;
    }

    public static String parseUrl(String tag, String id) throws Exception {
        return getIPAddress()+"/api/"+tag+"/"+id;
    }
}
