package io.streamzi.ev.operator;

import io.fabric8.kubernetes.api.model.ConfigMap;
import io.fabric8.openshift.api.model.DeploymentConfig;
import io.streamzi.ev.NoLabelException;

/**
 * EnvironmentVariableOperator for dealing with changes to ConfigMaps
 * TODO: Does this exist with OpenShift / k8s already?
 */
public interface EnvironmentVariableOperator<T> {

    void onAdded(T t) throws NoLabelException;

    void onModified(T t) throws NoLabelException;

    void onDeleted(T t) throws NoLabelException;
}
