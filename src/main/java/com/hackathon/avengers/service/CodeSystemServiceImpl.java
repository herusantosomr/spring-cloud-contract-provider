package com.hackathon.avengers.service;

import com.hackathon.avengers.common.MRConstantsIntf;
import com.hackathon.avengers.entity.MetaLookup;
import com.hackathon.avengers.repository.MetadataLookupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeSystemServiceImpl implements CodeSystemService {

    @Autowired
    private MetadataLookupRepository metadataLookupRepository;

    @Override
    public List<MetaLookup> findMetaLookups(String lookupName) {
        return metadataLookupRepository.findByLookupNameAndRecordStatusIDIsNotOrderByDisplayOrderAsc(lookupName,
                MRConstantsIntf.RECORD_STATUS_ID_DELETED);
    }
}
