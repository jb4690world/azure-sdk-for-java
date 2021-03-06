// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents service-level resource counters and quotas.
 */
@Fluent
public final class ServiceCounters {
    /*
     * Total number of documents across all indexes in the service.
     */
    @JsonProperty(value = "documentCount", required = true)
    private ResourceCounter documentCounter;

    /*
     * Total number of indexes.
     */
    @JsonProperty(value = "indexesCount", required = true)
    private ResourceCounter indexCounter;

    /*
     * Total number of indexers.
     */
    @JsonProperty(value = "indexersCount", required = true)
    private ResourceCounter indexerCounter;

    /*
     * Total number of data sources.
     */
    @JsonProperty(value = "dataSourcesCount", required = true)
    private ResourceCounter dataSourceCounter;

    /*
     * Total size of used storage in bytes.
     */
    @JsonProperty(value = "storageSize", required = true)
    private ResourceCounter storageSizeCounter;

    /*
     * Total number of synonym maps.
     */
    @JsonProperty(value = "synonymMaps", required = true)
    private ResourceCounter synonymMapCounter;

    /*
     * Total number of skillsets.
     */
    @JsonProperty(value = "skillsetCount", required = true)
    private ResourceCounter skillsetCounter;

    /**
     * Get the documentCounter property: Total number of documents across all
     * indexes in the service.
     *
     * @return the documentCounter value.
     */
    public ResourceCounter getDocumentCounter() {
        return this.documentCounter;
    }

    /**
     * Set the documentCounter property: Total number of documents across all
     * indexes in the service.
     *
     * @param documentCounter the documentCounter value to set.
     * @return the ServiceCounters object itself.
     */
    public ServiceCounters setDocumentCounter(ResourceCounter documentCounter) {
        this.documentCounter = documentCounter;
        return this;
    }

    /**
     * Get the indexCounter property: Total number of indexes.
     *
     * @return the indexCounter value.
     */
    public ResourceCounter getIndexCounter() {
        return this.indexCounter;
    }

    /**
     * Set the indexCounter property: Total number of indexes.
     *
     * @param indexCounter the indexCounter value to set.
     * @return the ServiceCounters object itself.
     */
    public ServiceCounters setIndexCounter(ResourceCounter indexCounter) {
        this.indexCounter = indexCounter;
        return this;
    }

    /**
     * Get the indexerCounter property: Total number of indexers.
     *
     * @return the indexerCounter value.
     */
    public ResourceCounter getIndexerCounter() {
        return this.indexerCounter;
    }

    /**
     * Set the indexerCounter property: Total number of indexers.
     *
     * @param indexerCounter the indexerCounter value to set.
     * @return the ServiceCounters object itself.
     */
    public ServiceCounters setIndexerCounter(ResourceCounter indexerCounter) {
        this.indexerCounter = indexerCounter;
        return this;
    }

    /**
     * Get the dataSourceCounter property: Total number of data sources.
     *
     * @return the dataSourceCounter value.
     */
    public ResourceCounter getDataSourceCounter() {
        return this.dataSourceCounter;
    }

    /**
     * Set the dataSourceCounter property: Total number of data sources.
     *
     * @param dataSourceCounter the dataSourceCounter value to set.
     * @return the ServiceCounters object itself.
     */
    public ServiceCounters setDataSourceCounter(ResourceCounter dataSourceCounter) {
        this.dataSourceCounter = dataSourceCounter;
        return this;
    }

    /**
     * Get the storageSizeCounter property: Total size of used storage in
     * bytes.
     *
     * @return the storageSizeCounter value.
     */
    public ResourceCounter getStorageSizeCounter() {
        return this.storageSizeCounter;
    }

    /**
     * Set the storageSizeCounter property: Total size of used storage in
     * bytes.
     *
     * @param storageSizeCounter the storageSizeCounter value to set.
     * @return the ServiceCounters object itself.
     */
    public ServiceCounters setStorageSizeCounter(ResourceCounter storageSizeCounter) {
        this.storageSizeCounter = storageSizeCounter;
        return this;
    }

    /**
     * Get the synonymMapCounter property: Total number of synonym maps.
     *
     * @return the synonymMapCounter value.
     */
    public ResourceCounter getSynonymMapCounter() {
        return this.synonymMapCounter;
    }

    /**
     * Set the synonymMapCounter property: Total number of synonym maps.
     *
     * @param synonymMapCounter the synonymMapCounter value to set.
     * @return the ServiceCounters object itself.
     */
    public ServiceCounters setSynonymMapCounter(ResourceCounter synonymMapCounter) {
        this.synonymMapCounter = synonymMapCounter;
        return this;
    }

    /**
     * Get the skillsetCounter property: Total number of skillsets.
     *
     * @return the skillsetCounter value.
     */
    public ResourceCounter getSkillsetCounter() {
        return this.skillsetCounter;
    }

    /**
     * Set the skillsetCounter property: Total number of skillsets.
     *
     * @param skillsetCounter the skillsetCounter value to set.
     * @return the ServiceCounters object itself.
     */
    public ServiceCounters setSkillsetCounter(ResourceCounter skillsetCounter) {
        this.skillsetCounter = skillsetCounter;
        return this;
    }
}
