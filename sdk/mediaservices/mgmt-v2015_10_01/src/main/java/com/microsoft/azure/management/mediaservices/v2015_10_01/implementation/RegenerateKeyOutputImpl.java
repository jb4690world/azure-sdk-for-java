/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2015_10_01.implementation;

import com.microsoft.azure.management.mediaservices.v2015_10_01.RegenerateKeyOutput;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class RegenerateKeyOutputImpl extends WrapperImpl<RegenerateKeyOutputInner> implements RegenerateKeyOutput {
    private final MediaManager manager;
    RegenerateKeyOutputImpl(RegenerateKeyOutputInner inner, MediaManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public MediaManager manager() {
        return this.manager;
    }

    @Override
    public String keyVal() {
        return this.inner().key();
    }

}
