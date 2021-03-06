/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Mon Mar 20 15:58:02 MSK 2017
 */
package ru.breffi.entityTypeConverterImpl.territoryUserConverter.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Salesforce DTO for SObject BF_TerritoryUser__c
 */
@XStreamAlias("BF_TerritoryUser__c")
public class BF_TerritoryUser__c extends AbstractSObjectBase {

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

    // BF_Territory__c
    private String BF_Territory__c;

    @JsonProperty("BF_Territory__c")
    public String getBF_Territory__c() {
        return this.BF_Territory__c;
    }

    @JsonProperty("BF_Territory__c")
    public void setBF_Territory__c(String BF_Territory__c) {
        this.BF_Territory__c = BF_Territory__c;
    }

    // BF_User__c
    private String BF_User__c;

    @JsonProperty("BF_User__c")
    public String getBF_User__c() {
        return this.BF_User__c;
    }

    @JsonProperty("BF_User__c")
    public void setBF_User__c(String BF_User__c) {
        this.BF_User__c = BF_User__c;
    }

}
