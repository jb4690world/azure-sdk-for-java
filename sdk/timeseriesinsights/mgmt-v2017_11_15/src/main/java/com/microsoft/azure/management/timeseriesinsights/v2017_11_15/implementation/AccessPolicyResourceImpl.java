/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.timeseriesinsights.v2017_11_15.implementation;

import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.AccessPolicyResource;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.AccessPolicyUpdateParameters;
import java.util.List;
import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.AccessPolicyCreateOrUpdateParameters;
import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.AccessPolicyRole;
import rx.functions.Func1;

class AccessPolicyResourceImpl extends CreatableUpdatableImpl<AccessPolicyResource, AccessPolicyResourceInner, AccessPolicyResourceImpl> implements AccessPolicyResource, AccessPolicyResource.Definition, AccessPolicyResource.Update {
    private final TimeSeriesInsightsManager manager;
    private String resourceGroupName;
    private String environmentName;
    private String accessPolicyName;
    private AccessPolicyCreateOrUpdateParameters createParameter;
    private AccessPolicyUpdateParameters updateParameter;

    AccessPolicyResourceImpl(String name, TimeSeriesInsightsManager manager) {
        super(name, new AccessPolicyResourceInner());
        this.manager = manager;
        // Set resource name
        this.accessPolicyName = name;
        //
        this.createParameter = new AccessPolicyCreateOrUpdateParameters();
        this.updateParameter = new AccessPolicyUpdateParameters();
    }

    AccessPolicyResourceImpl(AccessPolicyResourceInner inner, TimeSeriesInsightsManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.accessPolicyName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.environmentName = IdParsingUtils.getValueFromIdByName(inner.id(), "environments");
        this.accessPolicyName = IdParsingUtils.getValueFromIdByName(inner.id(), "accessPolicies");
        //
        this.createParameter = new AccessPolicyCreateOrUpdateParameters();
        this.updateParameter = new AccessPolicyUpdateParameters();
    }

    @Override
    public TimeSeriesInsightsManager manager() {
        return this.manager;
    }

    @Override
    public Observable<AccessPolicyResource> createResourceAsync() {
        AccessPoliciesInner client = this.manager().inner().accessPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName, this.environmentName, this.accessPolicyName, this.createParameter)
            .map(new Func1<AccessPolicyResourceInner, AccessPolicyResourceInner>() {
               @Override
               public AccessPolicyResourceInner call(AccessPolicyResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<AccessPolicyResource> updateResourceAsync() {
        AccessPoliciesInner client = this.manager().inner().accessPolicies();
        return client.updateAsync(this.resourceGroupName, this.environmentName, this.accessPolicyName, this.updateParameter)
            .map(new Func1<AccessPolicyResourceInner, AccessPolicyResourceInner>() {
               @Override
               public AccessPolicyResourceInner call(AccessPolicyResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<AccessPolicyResourceInner> getInnerAsync() {
        AccessPoliciesInner client = this.manager().inner().accessPolicies();
        return client.getAsync(this.resourceGroupName, this.environmentName, this.accessPolicyName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createParameter = new AccessPolicyCreateOrUpdateParameters();
        this.updateParameter = new AccessPolicyUpdateParameters();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String principalObjectId() {
        return this.inner().principalObjectId();
    }

    @Override
    public List<AccessPolicyRole> roles() {
        return this.inner().roles();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public AccessPolicyResourceImpl withExistingEnvironment(String resourceGroupName, String environmentName) {
        this.resourceGroupName = resourceGroupName;
        this.environmentName = environmentName;
        return this;
    }

    @Override
    public AccessPolicyResourceImpl withPrincipalObjectId(String principalObjectId) {
        this.createParameter.withPrincipalObjectId(principalObjectId);
        return this;
    }

    @Override
    public AccessPolicyResourceImpl withDescription(String description) {
        if (isInCreateMode()) {
            this.createParameter.withDescription(description);
        } else {
            this.updateParameter.withDescription(description);
        }
        return this;
    }

    @Override
    public AccessPolicyResourceImpl withRoles(List<AccessPolicyRole> roles) {
        if (isInCreateMode()) {
            this.createParameter.withRoles(roles);
        } else {
            this.updateParameter.withRoles(roles);
        }
        return this;
    }

}
