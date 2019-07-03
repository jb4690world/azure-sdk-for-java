/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Discover protectable item properties.
 */
public class DiscoverProtectableItemRequestProperties {
    /**
     * The friendly name of the physical machine.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /**
     * The IP address of the physical machine to be discovered.
     */
    @JsonProperty(value = "ipAddress")
    private String ipAddress;

    /**
     * The OS type on the physical machine.
     */
    @JsonProperty(value = "osType")
    private String osType;

    /**
     * Get the friendly name of the physical machine.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendly name of the physical machine.
     *
     * @param friendlyName the friendlyName value to set
     * @return the DiscoverProtectableItemRequestProperties object itself.
     */
    public DiscoverProtectableItemRequestProperties withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the IP address of the physical machine to be discovered.
     *
     * @return the ipAddress value
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the IP address of the physical machine to be discovered.
     *
     * @param ipAddress the ipAddress value to set
     * @return the DiscoverProtectableItemRequestProperties object itself.
     */
    public DiscoverProtectableItemRequestProperties withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the OS type on the physical machine.
     *
     * @return the osType value
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Set the OS type on the physical machine.
     *
     * @param osType the osType value to set
     * @return the DiscoverProtectableItemRequestProperties object itself.
     */
    public DiscoverProtectableItemRequestProperties withOsType(String osType) {
        this.osType = osType;
        return this;
    }

}