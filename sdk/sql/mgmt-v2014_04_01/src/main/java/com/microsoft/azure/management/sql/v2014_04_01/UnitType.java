/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for UnitType.
 */
public final class UnitType extends ExpandableStringEnum<UnitType> {
    /** Static value count for UnitType. */
    public static final UnitType COUNT = fromString("count");

    /** Static value bytes for UnitType. */
    public static final UnitType BYTES = fromString("bytes");

    /** Static value seconds for UnitType. */
    public static final UnitType SECONDS = fromString("seconds");

    /** Static value percent for UnitType. */
    public static final UnitType PERCENT = fromString("percent");

    /** Static value countPerSecond for UnitType. */
    public static final UnitType COUNT_PER_SECOND = fromString("countPerSecond");

    /** Static value bytesPerSecond for UnitType. */
    public static final UnitType BYTES_PER_SECOND = fromString("bytesPerSecond");

    /**
     * Creates or finds a UnitType from its string representation.
     * @param name a name to look for
     * @return the corresponding UnitType
     */
    @JsonCreator
    public static UnitType fromString(String name) {
        return fromString(name, UnitType.class);
    }

    /**
     * @return known UnitType values
     */
    public static Collection<UnitType> values() {
        return values(UnitType.class);
    }
}
