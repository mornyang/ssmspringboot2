package com.example.ssmspringboot2.util;

import java.net.InetAddress;

public class Util {
    public static String getIPAddress() throws Exception{
        InetAddress address = InetAddress.getLocalHost();
        String hostAddress = address.getHostAddress();
        return "http://"+hostAddress + ':' + Constant.port;
    }
}
