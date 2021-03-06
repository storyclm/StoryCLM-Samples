/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Mon Mar 20 15:58:02 MSK 2017
 */
package ru.breffi.EntityTypeConverterServiceImpl.territory;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.apache.camel.component.salesforce.api.dto.Attributes;
import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Salesforce DTO for SObject BF_Territory__c
 */
@XStreamAlias("BF_Territory__c")
public class BF_Territory__c extends AbstractSObjectBase 
{

    // RecordTypeId
    private String RecordTypeId;

    @JsonProperty("RecordTypeId")
    public String getRecordTypeId() {
        return this.RecordTypeId;
    }

    @JsonProperty("RecordTypeId")
    public void setRecordTypeId(String RecordTypeId) {
        this.RecordTypeId = RecordTypeId;
    }

    // ConnectionReceivedId
    private String ConnectionReceivedId;

    @JsonProperty("ConnectionReceivedId")
    public String getConnectionReceivedId() {
        return this.ConnectionReceivedId;
    }

    @JsonProperty("ConnectionReceivedId")
    public void setConnectionReceivedId(String ConnectionReceivedId) {
        this.ConnectionReceivedId = ConnectionReceivedId;
    }

    // ConnectionSentId
    private String ConnectionSentId;

    @JsonProperty("ConnectionSentId")
    public String getConnectionSentId() {
        return this.ConnectionSentId;
    }

    @JsonProperty("ConnectionSentId")
    public void setConnectionSentId(String ConnectionSentId) {
        this.ConnectionSentId = ConnectionSentId;
    }

    // BF_Territory_Parent__c
    private String BF_Territory_Parent__c;

    @JsonProperty("BF_Territory_Parent__c")
    public String getBF_Territory_Parent__c() {
        return this.BF_Territory_Parent__c;
    }

    @JsonProperty("BF_Territory_Parent__c")
    public void setBF_Territory_Parent__c(String BF_Territory_Parent__c) {
        this.BF_Territory_Parent__c = BF_Territory_Parent__c;
    }

}
