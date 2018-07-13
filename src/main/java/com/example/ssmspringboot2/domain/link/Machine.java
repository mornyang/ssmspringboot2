package com.example.ssmspringboot2.domain.link;

import com.example.ssmspringboot2.util.Constant;
import com.example.ssmspringboot2.util.Util;

public class Machine {
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) throws Exception{
        this.url = Util.parseUrl(Constant.machine, url);
    }

    @Override
    public String toString() {
        return "Machine{" +
                "url='" + url + '\'' +
                '}';
    }
}
