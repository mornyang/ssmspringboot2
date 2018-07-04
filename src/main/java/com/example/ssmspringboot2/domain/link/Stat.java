package com.example.ssmspringboot2.domain.link;

import com.example.ssmspringboot2.util.Constant;
import com.example.ssmspringboot2.util.Util;

public class Stat {
    private String name;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) throws Exception{
        this.url = Util.parseUrl(Constant.pokemonStat, url);
    }

    @Override
    public String toString(){
        return "Stat{" +
                "name=" + name +
                ", url=" + url +
                "}";
    }
}
