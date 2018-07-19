package com.example.ssmspringboot2.dao.service;

import com.example.ssmspringboot2.domain.region.RegionDetail;

public interface RegionService {
    RegionDetail findRegionByID(int id);
}
