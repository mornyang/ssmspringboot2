package com.example.ssmspringboot2.dao.service;

import com.example.ssmspringboot2.domain.VersionGroupDetail.VersionGroupDetail;

public interface VersionGroupService {
    VersionGroupDetail findVersionGroupByID(int id);
}
