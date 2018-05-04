/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.programmatic.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Intent Classifier.
 */
public class IntentClassifier extends ModelInfo {
    /**
     * The domain name.
     */
    @JsonProperty(value = "customPrebuiltDomainName")
    private String customPrebuiltDomainName;

    /**
     * The intent name or entity name.
     */
    @JsonProperty(value = "customPrebuiltModelName")
    private String customPrebuiltModelName;

    /**
     * Get the customPrebuiltDomainName value.
     *
     * @return the customPrebuiltDomainName value
     */
    public String customPrebuiltDomainName() {
        return this.customPrebuiltDomainName;
    }

    /**
     * Set the customPrebuiltDomainName value.
     *
     * @param customPrebuiltDomainName the customPrebuiltDomainName value to set
     * @return the IntentClassifier object itself.
     */
    public IntentClassifier withCustomPrebuiltDomainName(String customPrebuiltDomainName) {
        this.customPrebuiltDomainName = customPrebuiltDomainName;
        return this;
    }

    /**
     * Get the customPrebuiltModelName value.
     *
     * @return the customPrebuiltModelName value
     */
    public String customPrebuiltModelName() {
        return this.customPrebuiltModelName;
    }

    /**
     * Set the customPrebuiltModelName value.
     *
     * @param customPrebuiltModelName the customPrebuiltModelName value to set
     * @return the IntentClassifier object itself.
     */
    public IntentClassifier withCustomPrebuiltModelName(String customPrebuiltModelName) {
        this.customPrebuiltModelName = customPrebuiltModelName;
        return this;
    }

}