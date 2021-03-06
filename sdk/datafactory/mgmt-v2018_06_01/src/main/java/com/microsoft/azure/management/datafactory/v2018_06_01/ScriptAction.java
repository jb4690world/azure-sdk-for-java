/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Custom script action to run on HDI ondemand cluster once it's up.
 */
public class ScriptAction {
    /**
     * The user provided name of the script action.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The URI for the script action.
     */
    @JsonProperty(value = "uri", required = true)
    private String uri;

    /**
     * The node types on which the script action should be executed.
     */
    @JsonProperty(value = "roles", required = true)
    private Object roles;

    /**
     * The parameters for the script action.
     */
    @JsonProperty(value = "parameters")
    private String parameters;

    /**
     * Get the user provided name of the script action.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the user provided name of the script action.
     *
     * @param name the name value to set
     * @return the ScriptAction object itself.
     */
    public ScriptAction withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the URI for the script action.
     *
     * @return the uri value
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the URI for the script action.
     *
     * @param uri the uri value to set
     * @return the ScriptAction object itself.
     */
    public ScriptAction withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the node types on which the script action should be executed.
     *
     * @return the roles value
     */
    public Object roles() {
        return this.roles;
    }

    /**
     * Set the node types on which the script action should be executed.
     *
     * @param roles the roles value to set
     * @return the ScriptAction object itself.
     */
    public ScriptAction withRoles(Object roles) {
        this.roles = roles;
        return this;
    }

    /**
     * Get the parameters for the script action.
     *
     * @return the parameters value
     */
    public String parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters for the script action.
     *
     * @param parameters the parameters value to set
     * @return the ScriptAction object itself.
     */
    public ScriptAction withParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }

}
