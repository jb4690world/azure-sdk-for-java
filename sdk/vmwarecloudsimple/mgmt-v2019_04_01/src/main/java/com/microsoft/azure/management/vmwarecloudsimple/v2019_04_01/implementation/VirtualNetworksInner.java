/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.CSRPErrorException;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in VirtualNetworks.
 */
public class VirtualNetworksInner {
    /** The Retrofit service to perform REST calls. */
    private VirtualNetworksService service;
    /** The service client containing this operation class. */
    private VMwareCloudSimpleClientImpl client;

    /**
     * Initializes an instance of VirtualNetworksInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public VirtualNetworksInner(Retrofit retrofit, VMwareCloudSimpleClientImpl client) {
        this.service = retrofit.create(VirtualNetworksService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for VirtualNetworks to be
     * used by Retrofit to perform actually REST calls.
     */
    interface VirtualNetworksService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.VirtualNetworks list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.VMwareCloudSimple/locations/{regionId}/privateClouds/{pcName}/virtualNetworks")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Path("regionId") String regionId, @Path("pcName") String pcName, @Query("api-version") String apiVersion, @Query("resourcePoolName") String resourcePoolName, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.VirtualNetworks get" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.VMwareCloudSimple/locations/{regionId}/privateClouds/{pcName}/virtualNetworks/{virtualNetworkName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("regionId") String regionId, @Path("pcName") String pcName, @Path("virtualNetworkName") String virtualNetworkName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.VirtualNetworks listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Implements list available virtual networks within a subscription method.
     * Return list of virtual networks in location for private cloud.
     *
     * @param regionId The region Id (westus, eastus)
     * @param pcName The private cloud name
     * @param resourcePoolName Resource pool used to derive vSphere cluster which contains virtual networks
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CSRPErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;VirtualNetworkInner&gt; object if successful.
     */
    public PagedList<VirtualNetworkInner> list(final String regionId, final String pcName, final String resourcePoolName) {
        ServiceResponse<Page<VirtualNetworkInner>> response = listSinglePageAsync(regionId, pcName, resourcePoolName).toBlocking().single();
        return new PagedList<VirtualNetworkInner>(response.body()) {
            @Override
            public Page<VirtualNetworkInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Implements list available virtual networks within a subscription method.
     * Return list of virtual networks in location for private cloud.
     *
     * @param regionId The region Id (westus, eastus)
     * @param pcName The private cloud name
     * @param resourcePoolName Resource pool used to derive vSphere cluster which contains virtual networks
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<VirtualNetworkInner>> listAsync(final String regionId, final String pcName, final String resourcePoolName, final ListOperationCallback<VirtualNetworkInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(regionId, pcName, resourcePoolName),
            new Func1<String, Observable<ServiceResponse<Page<VirtualNetworkInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<VirtualNetworkInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Implements list available virtual networks within a subscription method.
     * Return list of virtual networks in location for private cloud.
     *
     * @param regionId The region Id (westus, eastus)
     * @param pcName The private cloud name
     * @param resourcePoolName Resource pool used to derive vSphere cluster which contains virtual networks
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;VirtualNetworkInner&gt; object
     */
    public Observable<Page<VirtualNetworkInner>> listAsync(final String regionId, final String pcName, final String resourcePoolName) {
        return listWithServiceResponseAsync(regionId, pcName, resourcePoolName)
            .map(new Func1<ServiceResponse<Page<VirtualNetworkInner>>, Page<VirtualNetworkInner>>() {
                @Override
                public Page<VirtualNetworkInner> call(ServiceResponse<Page<VirtualNetworkInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Implements list available virtual networks within a subscription method.
     * Return list of virtual networks in location for private cloud.
     *
     * @param regionId The region Id (westus, eastus)
     * @param pcName The private cloud name
     * @param resourcePoolName Resource pool used to derive vSphere cluster which contains virtual networks
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;VirtualNetworkInner&gt; object
     */
    public Observable<ServiceResponse<Page<VirtualNetworkInner>>> listWithServiceResponseAsync(final String regionId, final String pcName, final String resourcePoolName) {
        return listSinglePageAsync(regionId, pcName, resourcePoolName)
            .concatMap(new Func1<ServiceResponse<Page<VirtualNetworkInner>>, Observable<ServiceResponse<Page<VirtualNetworkInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<VirtualNetworkInner>>> call(ServiceResponse<Page<VirtualNetworkInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Implements list available virtual networks within a subscription method.
     * Return list of virtual networks in location for private cloud.
     *
    ServiceResponse<PageImpl<VirtualNetworkInner>> * @param regionId The region Id (westus, eastus)
    ServiceResponse<PageImpl<VirtualNetworkInner>> * @param pcName The private cloud name
    ServiceResponse<PageImpl<VirtualNetworkInner>> * @param resourcePoolName Resource pool used to derive vSphere cluster which contains virtual networks
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;VirtualNetworkInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<VirtualNetworkInner>>> listSinglePageAsync(final String regionId, final String pcName, final String resourcePoolName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (regionId == null) {
            throw new IllegalArgumentException("Parameter regionId is required and cannot be null.");
        }
        if (pcName == null) {
            throw new IllegalArgumentException("Parameter pcName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (resourcePoolName == null) {
            throw new IllegalArgumentException("Parameter resourcePoolName is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), regionId, pcName, this.client.apiVersion(), resourcePoolName, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<VirtualNetworkInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<VirtualNetworkInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<VirtualNetworkInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<VirtualNetworkInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<VirtualNetworkInner>> listDelegate(Response<ResponseBody> response) throws CSRPErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<VirtualNetworkInner>, CSRPErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<VirtualNetworkInner>>() { }.getType())
                .registerError(CSRPErrorException.class)
                .build(response);
    }

    /**
     * Implements virtual network GET method.
     * Return virtual network by its name.
     *
     * @param regionId The region Id (westus, eastus)
     * @param pcName The private cloud name
     * @param virtualNetworkName virtual network id (vsphereId)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CSRPErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VirtualNetworkInner object if successful.
     */
    public VirtualNetworkInner get(String regionId, String pcName, String virtualNetworkName) {
        return getWithServiceResponseAsync(regionId, pcName, virtualNetworkName).toBlocking().single().body();
    }

    /**
     * Implements virtual network GET method.
     * Return virtual network by its name.
     *
     * @param regionId The region Id (westus, eastus)
     * @param pcName The private cloud name
     * @param virtualNetworkName virtual network id (vsphereId)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VirtualNetworkInner> getAsync(String regionId, String pcName, String virtualNetworkName, final ServiceCallback<VirtualNetworkInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(regionId, pcName, virtualNetworkName), serviceCallback);
    }

    /**
     * Implements virtual network GET method.
     * Return virtual network by its name.
     *
     * @param regionId The region Id (westus, eastus)
     * @param pcName The private cloud name
     * @param virtualNetworkName virtual network id (vsphereId)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VirtualNetworkInner object
     */
    public Observable<VirtualNetworkInner> getAsync(String regionId, String pcName, String virtualNetworkName) {
        return getWithServiceResponseAsync(regionId, pcName, virtualNetworkName).map(new Func1<ServiceResponse<VirtualNetworkInner>, VirtualNetworkInner>() {
            @Override
            public VirtualNetworkInner call(ServiceResponse<VirtualNetworkInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Implements virtual network GET method.
     * Return virtual network by its name.
     *
     * @param regionId The region Id (westus, eastus)
     * @param pcName The private cloud name
     * @param virtualNetworkName virtual network id (vsphereId)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VirtualNetworkInner object
     */
    public Observable<ServiceResponse<VirtualNetworkInner>> getWithServiceResponseAsync(String regionId, String pcName, String virtualNetworkName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (regionId == null) {
            throw new IllegalArgumentException("Parameter regionId is required and cannot be null.");
        }
        if (pcName == null) {
            throw new IllegalArgumentException("Parameter pcName is required and cannot be null.");
        }
        if (virtualNetworkName == null) {
            throw new IllegalArgumentException("Parameter virtualNetworkName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), regionId, pcName, virtualNetworkName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VirtualNetworkInner>>>() {
                @Override
                public Observable<ServiceResponse<VirtualNetworkInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VirtualNetworkInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<VirtualNetworkInner> getDelegate(Response<ResponseBody> response) throws CSRPErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<VirtualNetworkInner, CSRPErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<VirtualNetworkInner>() { }.getType())
                .registerError(CSRPErrorException.class)
                .build(response);
    }

    /**
     * Implements list available virtual networks within a subscription method.
     * Return list of virtual networks in location for private cloud.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CSRPErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;VirtualNetworkInner&gt; object if successful.
     */
    public PagedList<VirtualNetworkInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<VirtualNetworkInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<VirtualNetworkInner>(response.body()) {
            @Override
            public Page<VirtualNetworkInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Implements list available virtual networks within a subscription method.
     * Return list of virtual networks in location for private cloud.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<VirtualNetworkInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<VirtualNetworkInner>> serviceFuture, final ListOperationCallback<VirtualNetworkInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<VirtualNetworkInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<VirtualNetworkInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Implements list available virtual networks within a subscription method.
     * Return list of virtual networks in location for private cloud.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;VirtualNetworkInner&gt; object
     */
    public Observable<Page<VirtualNetworkInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<VirtualNetworkInner>>, Page<VirtualNetworkInner>>() {
                @Override
                public Page<VirtualNetworkInner> call(ServiceResponse<Page<VirtualNetworkInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Implements list available virtual networks within a subscription method.
     * Return list of virtual networks in location for private cloud.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;VirtualNetworkInner&gt; object
     */
    public Observable<ServiceResponse<Page<VirtualNetworkInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<VirtualNetworkInner>>, Observable<ServiceResponse<Page<VirtualNetworkInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<VirtualNetworkInner>>> call(ServiceResponse<Page<VirtualNetworkInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Implements list available virtual networks within a subscription method.
     * Return list of virtual networks in location for private cloud.
     *
    ServiceResponse<PageImpl<VirtualNetworkInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;VirtualNetworkInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<VirtualNetworkInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<VirtualNetworkInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<VirtualNetworkInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<VirtualNetworkInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<VirtualNetworkInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<VirtualNetworkInner>> listNextDelegate(Response<ResponseBody> response) throws CSRPErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<VirtualNetworkInner>, CSRPErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<VirtualNetworkInner>>() { }.getType())
                .registerError(CSRPErrorException.class)
                .build(response);
    }

}
