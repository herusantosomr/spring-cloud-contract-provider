package com.hackathon.avengers.service;

import com.hackathon.avengers.entity.MetaLookup;

import java.util.List;

public interface CodeSystemService {

    List<MetaLookup> findMetaLookups(String lookupName);

}
