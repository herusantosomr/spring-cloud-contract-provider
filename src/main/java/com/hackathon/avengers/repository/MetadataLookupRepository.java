package com.hackathon.avengers.repository;

import com.hackathon.avengers.entity.MetaLookup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MetadataLookupRepository extends JpaRepository<MetaLookup, String> {

    List<MetaLookup> findByLookupNameAndRecordStatusIDIsNotOrderByDisplayOrderAsc(String lookupName,
            int recordStatusId);

}
