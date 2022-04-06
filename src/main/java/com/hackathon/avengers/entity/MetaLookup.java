package com.hackathon.avengers.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "Lookup")
public class MetaLookup {

    @JsonProperty("id")
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "LookupGuid")
    private String lookupGuid;

    @JsonProperty("application_id")
    @Column(name = "ApplicationGuid", nullable = false)
    private String applicationGuid;

    @JsonProperty("name")
    @Column(name = "LookUpName", nullable = false, length = 50)
    private String lookupName;

    @JsonProperty("value")
    @Column(name = "LookUpValue", nullable = false)
    private Integer lookupValue;

    @JsonProperty("text")
    @Column(name = "LookUpText", nullable = true, length = 200)
    private String lookupText;

    @JsonProperty("text1")
    @Column(name = "LookUpText1", nullable = true, length = 50)
    private String lookupText1;

    @JsonProperty("value1")
    @Column(name = "LookUpValue1", nullable = true, length = 100)
    private String lookupValue1;

    @JsonProperty("text2")
    @Column(name = "LookUpText2", nullable = true, length = 50)
    private String lookupText2;

    @JsonProperty("value2")
    @Column(name = "LookUpValue2", nullable = true, length = 100)
    private String lookupValue2;

    @JsonProperty("parent_id")
    @Column(name = "ParentLookupGUID", nullable = true)
    private String parentLookupGuid;

    @Column(name = "Code", nullable = true, length = 100)
    private String code;

    @Column(name = "DisplayOrder", nullable = false)
    private Integer displayOrder;

    @Column(name = "DefaultValue", nullable = true)
    private boolean defaultValue;

    @JsonProperty("language")
    @Column(name = "LangID", nullable = false, length = 2)
    private String langId;

    @Column(name = "TermValue", nullable = true, length = 100)
    private String termValue;

    @JsonProperty("row_status")
    @Column(name = "RecordStatusID", nullable = false)
    private int recordStatusID = 1;

    public String getApplicationGuid() {
        return applicationGuid;
    }

    public String getCode() {
        return code;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public String getLangId() {
        return langId;
    }

    public String getLookupGuid() {
        return lookupGuid;
    }

    public String getLookupName() {
        return lookupName;
    }

    public String getLookupText() {
        return lookupText;
    }

    public String getLookupText1() {
        return lookupText1;
    }

    public String getLookupText2() {
        return lookupText2;
    }

    public Integer getLookupValue() {
        return lookupValue;
    }

    public String getLookupValue1() {
        return lookupValue1;
    }

    public String getLookupValue2() {
        return lookupValue2;
    }

    public String getParentLookupGuid() {
        return parentLookupGuid;
    }

    public String getTermValue() {
        return termValue;
    }

    public void setApplicationGuid(String applicationGuid) {
        this.applicationGuid = applicationGuid;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public void setLangId(String langId) {
        this.langId = langId;
    }

    public void setLookupGuid(String lookupGuid) {
        this.lookupGuid = lookupGuid;
    }

    public void setLookupName(String lookupName) {
        this.lookupName = lookupName;
    }

    public void setLookupText(String lookupText) {
        this.lookupText = lookupText;
    }

    public void setLookupText1(String lookupText1) {
        this.lookupText1 = lookupText1;
    }

    public void setLookupText2(String lookupText2) {
        this.lookupText2 = lookupText2;
    }

    public void setLookupValue(Integer lookupValue) {
        this.lookupValue = lookupValue;
    }

    public void setLookupValue1(String lookupValue1) {
        this.lookupValue1 = lookupValue1;
    }

    public void setLookupValue2(String lookupValue2) {
        this.lookupValue2 = lookupValue2;
    }

    public void setParentLookupGuid(String parentLookupGuid) {
        this.parentLookupGuid = parentLookupGuid;
    }

    public void setTermValue(String termValue) {
        this.termValue = termValue;
    }

    public boolean getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(boolean defaultValue) {
        this.defaultValue = defaultValue;
    }

    public int getRecordStatusID() {
        return recordStatusID;
    }

    public void setRecordStatusID(int recordStatusID) {
        this.recordStatusID = recordStatusID;
    }
}
