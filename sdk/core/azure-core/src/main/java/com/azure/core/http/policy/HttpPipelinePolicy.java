// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.http.policy;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineCallContext;
import com.azure.core.http.HttpPipelineNextPolicy;
import com.azure.core.http.HttpResponse;
import reactor.core.publisher.Mono;

/**
 * A policy within the {@link HttpPipeline}.
 *
 * @see HttpPipeline
 */
@FunctionalInterface
public interface HttpPipelinePolicy {
    /**
     * Process provided request context and invokes the next policy.
     *
     * @param context request context
     * @param next The next policy to invoke.
     * @return A publisher that initiates the request upon subscription and emits a response on completion.
     */
    Mono<HttpResponse> process(HttpPipelineCallContext context, HttpPipelineNextPolicy next);
}
