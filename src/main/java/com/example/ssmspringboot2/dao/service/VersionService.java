package com.example.ssmspringboot2.dao.service;

import com.example.ssmspringboot2.domain.version.VersionInfo;

public interface VersionService {
    VersionInfo findVersionByID(int id);
}
