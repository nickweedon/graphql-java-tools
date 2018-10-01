package com.coxautodev.graphql.tools;

/**
 * @author Nick Weedon
 *
 * This resolver allows for a direct registration of a schema type with a POJO type, thus allowing the
 * resolver POJO graph to contain properties/geters/property map values that are of type Object since
 * in this case the real POJO would be otherwise undiscoverable when building the schema.
 */
public interface GraphQLTypeNameResolver<DataClass> extends GraphQLResolver<DataClass> {
    String getTargetType();
}
