package com.example.ssmspringboot2.domain.link;

import com.example.ssmspringboot2.util.Constant;
import com.example.ssmspringboot2.util.Util;

public class ContestEffect {
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) throws Exception{
        this.url = Util.parseUrl(Constant.contestEffect, url);
    }

    @Override
    public String toString() {
        return "ContestEffect{" +
                "url='" + url + '\'' +
                '}';
    }
}
