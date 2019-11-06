/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.cosmosdb.v2019_08_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cosmosdb.v2019_08_01_preview.GremlinResources;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.cosmosdb.v2019_08_01_preview.GremlinDatabaseGetResults;
import java.util.List;
import rx.Completable;
import com.microsoft.azure.management.cosmosdb.v2019_08_01_preview.ThroughputSettingsGetResults;
import com.microsoft.azure.management.cosmosdb.v2019_08_01_preview.ThroughputSettingsUpdateParameters;
import com.microsoft.azure.management.cosmosdb.v2019_08_01_preview.GremlinGraphGetResults;

class GremlinResourcesImpl extends WrapperImpl<GremlinResourcesInner> implements GremlinResources {
    private final CosmosDBManager manager;

    GremlinResourcesImpl(CosmosDBManager manager) {
        super(manager.inner().gremlinResources());
        this.manager = manager;
    }

    public CosmosDBManager manager() {
        return this.manager;
    }

    @Override
    public GremlinDatabaseGetResultsImpl defineGremlinDatabasis(String name) {
        return wrapGremlinDatabasisModel(name);
    }

    @Override
    public GremlinGraphGetResultsImpl defineGraph(String name) {
        return wrapGraphModel(name);
    }

    private GremlinDatabaseGetResultsImpl wrapGremlinDatabasisModel(String name) {
        return new GremlinDatabaseGetResultsImpl(name, this.manager());
    }

    private GremlinGraphGetResultsImpl wrapGraphModel(String name) {
        return new GremlinGraphGetResultsImpl(name, this.manager());
    }

    private GremlinDatabaseGetResultsImpl wrapGremlinDatabaseGetResultsModel(GremlinDatabaseGetResultsInner inner) {
        return  new GremlinDatabaseGetResultsImpl(inner, manager());
    }

    private GremlinGraphGetResultsImpl wrapGremlinGraphGetResultsModel(GremlinGraphGetResultsInner inner) {
        return  new GremlinGraphGetResultsImpl(inner, manager());
    }

    private Observable<GremlinDatabaseGetResultsInner> getGremlinDatabaseGetResultsInnerUsingGremlinResourcesInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String accountName = IdParsingUtils.getValueFromIdByName(id, "databaseAccounts");
        String databaseName = IdParsingUtils.getValueFromIdByName(id, "gremlinDatabases");
        GremlinResourcesInner client = this.inner();
        return client.getGremlinDatabaseAsync(resourceGroupName, accountName, databaseName);
    }

    private Observable<GremlinGraphGetResultsInner> getGremlinGraphGetResultsInnerUsingGremlinResourcesInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String accountName = IdParsingUtils.getValueFromIdByName(id, "databaseAccounts");
        String databaseName = IdParsingUtils.getValueFromIdByName(id, "gremlinDatabases");
        String graphName = IdParsingUtils.getValueFromIdByName(id, "graphs");
        GremlinResourcesInner client = this.inner();
        return client.getGremlinGraphAsync(resourceGroupName, accountName, databaseName, graphName);
    }

    @Override
    public Observable<GremlinDatabaseGetResults> getGremlinDatabaseAsync(String resourceGroupName, String accountName, String databaseName) {
        GremlinResourcesInner client = this.inner();
        return client.getGremlinDatabaseAsync(resourceGroupName, accountName, databaseName)
        .flatMap(new Func1<GremlinDatabaseGetResultsInner, Observable<GremlinDatabaseGetResults>>() {
            @Override
            public Observable<GremlinDatabaseGetResults> call(GremlinDatabaseGetResultsInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((GremlinDatabaseGetResults)wrapGremlinDatabaseGetResultsModel(inner));
                }
            }
       });
    }

    @Override
    public Observable<GremlinDatabaseGetResults> listGremlinDatabasesAsync(String resourceGroupName, String accountName) {
        GremlinResourcesInner client = this.inner();
        return client.listGremlinDatabasesAsync(resourceGroupName, accountName)
        .flatMap(new Func1<List<GremlinDatabaseGetResultsInner>, Observable<GremlinDatabaseGetResultsInner>>() {
            @Override
            public Observable<GremlinDatabaseGetResultsInner> call(List<GremlinDatabaseGetResultsInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<GremlinDatabaseGetResultsInner, GremlinDatabaseGetResults>() {
            @Override
            public GremlinDatabaseGetResults call(GremlinDatabaseGetResultsInner inner) {
                return wrapGremlinDatabaseGetResultsModel(inner);
            }
        });
    }

    @Override
    public Completable deleteGremlinDatabaseAsync(String resourceGroupName, String accountName, String databaseName) {
        GremlinResourcesInner client = this.inner();
        return client.deleteGremlinDatabaseAsync(resourceGroupName, accountName, databaseName).toCompletable();
    }

    @Override
    public Observable<ThroughputSettingsGetResults> getGremlinDatabaseThroughputAsync(String resourceGroupName, String accountName, String databaseName) {
        GremlinResourcesInner client = this.inner();
        return client.getGremlinDatabaseThroughputAsync(resourceGroupName, accountName, databaseName)
        .map(new Func1<ThroughputSettingsGetResultsInner, ThroughputSettingsGetResults>() {
            @Override
            public ThroughputSettingsGetResults call(ThroughputSettingsGetResultsInner inner) {
                return new ThroughputSettingsGetResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ThroughputSettingsGetResults> updateGremlinDatabaseThroughputAsync(String resourceGroupName, String accountName, String databaseName, ThroughputSettingsUpdateParameters updateThroughputParameters) {
        GremlinResourcesInner client = this.inner();
        return client.updateGremlinDatabaseThroughputAsync(resourceGroupName, accountName, databaseName, updateThroughputParameters)
        .map(new Func1<ThroughputSettingsGetResultsInner, ThroughputSettingsGetResults>() {
            @Override
            public ThroughputSettingsGetResults call(ThroughputSettingsGetResultsInner inner) {
                return new ThroughputSettingsGetResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ThroughputSettingsGetResults> getGremlinGraphThroughputAsync(String resourceGroupName, String accountName, String databaseName, String graphName) {
        GremlinResourcesInner client = this.inner();
        return client.getGremlinGraphThroughputAsync(resourceGroupName, accountName, databaseName, graphName)
        .map(new Func1<ThroughputSettingsGetResultsInner, ThroughputSettingsGetResults>() {
            @Override
            public ThroughputSettingsGetResults call(ThroughputSettingsGetResultsInner inner) {
                return new ThroughputSettingsGetResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ThroughputSettingsGetResults> updateGremlinGraphThroughputAsync(String resourceGroupName, String accountName, String databaseName, String graphName, ThroughputSettingsUpdateParameters updateThroughputParameters) {
        GremlinResourcesInner client = this.inner();
        return client.updateGremlinGraphThroughputAsync(resourceGroupName, accountName, databaseName, graphName, updateThroughputParameters)
        .map(new Func1<ThroughputSettingsGetResultsInner, ThroughputSettingsGetResults>() {
            @Override
            public ThroughputSettingsGetResults call(ThroughputSettingsGetResultsInner inner) {
                return new ThroughputSettingsGetResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<GremlinGraphGetResults> getGremlinGraphAsync(String resourceGroupName, String accountName, String databaseName, String graphName) {
        GremlinResourcesInner client = this.inner();
        return client.getGremlinGraphAsync(resourceGroupName, accountName, databaseName, graphName)
        .flatMap(new Func1<GremlinGraphGetResultsInner, Observable<GremlinGraphGetResults>>() {
            @Override
            public Observable<GremlinGraphGetResults> call(GremlinGraphGetResultsInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((GremlinGraphGetResults)wrapGremlinGraphGetResultsModel(inner));
                }
            }
       });
    }

    @Override
    public Observable<GremlinGraphGetResults> listGremlinGraphsAsync(String resourceGroupName, String accountName, String databaseName) {
        GremlinResourcesInner client = this.inner();
        return client.listGremlinGraphsAsync(resourceGroupName, accountName, databaseName)
        .flatMap(new Func1<List<GremlinGraphGetResultsInner>, Observable<GremlinGraphGetResultsInner>>() {
            @Override
            public Observable<GremlinGraphGetResultsInner> call(List<GremlinGraphGetResultsInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<GremlinGraphGetResultsInner, GremlinGraphGetResults>() {
            @Override
            public GremlinGraphGetResults call(GremlinGraphGetResultsInner inner) {
                return wrapGremlinGraphGetResultsModel(inner);
            }
        });
    }

    @Override
    public Completable deleteGremlinGraphAsync(String resourceGroupName, String accountName, String databaseName, String graphName) {
        GremlinResourcesInner client = this.inner();
        return client.deleteGremlinGraphAsync(resourceGroupName, accountName, databaseName, graphName).toCompletable();
    }

}
