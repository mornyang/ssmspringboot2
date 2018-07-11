package com.example.ssmspringboot2.domain.pokemon;

import com.example.ssmspringboot2.util.Constant;
import com.example.ssmspringboot2.util.Util;

import java.util.List;

public class Item {
    private String name;
    private String url;
    private List<VersionDetail> versionDetails;

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
        this.url = Util.parseUrl(Constant.pokemonItem, url);
    }

    public List<VersionDetail> getVersionDetails() {
        return versionDetails;
    }

    public void setVersionDetails(List<VersionDetail> versionDetails) {
        this.versionDetails = versionDetails;
    }

    @Override
    public String toString() {
        return "item{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", versionDetails=" + versionDetails +
                '}';
    }
}
