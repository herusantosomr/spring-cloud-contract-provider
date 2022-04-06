package com.hackathon.avengers.controller;

import com.hackathon.avengers.ProducerApplication;
import com.hackathon.avengers.common.MRConstantsIntf;
import com.hackathon.avengers.entity.MetaLookup;
import com.hackathon.avengers.service.CodeSystemService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProducerApplication.class)
public abstract class CodeSystemBaseTestClass {

    @Autowired
    private CodeSystemController codeSystemController;

    @MockBean
    private CodeSystemService codeSystemService;

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(codeSystemController);

        Mockito.when(codeSystemService.findMetaLookups(
                MRConstantsIntf.LOOKUP_NAME_DOCUMENT_FORMAT_TYPE_ID)).thenReturn(getDocumentFormatTypeID());
    }

    private List<MetaLookup> getDocumentFormatTypeID(){
        List<MetaLookup> metaLookups = new ArrayList<>();

        MetaLookup metaLookup = new MetaLookup();
        metaLookup.setCode("test");
        metaLookup.setLookupText("12345");

        MetaLookup metaLookup2 = new MetaLookup();
        metaLookup2.setCode("test2");
        metaLookup2.setLookupText("123457");

        metaLookups.add(metaLookup);
        metaLookups.add(metaLookup2);

        return metaLookups;
    }
}
