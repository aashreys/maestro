package com.aashreys.maestro;

import com.sun.istack.internal.Nullable;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

/**
 * Created by aashreys on 08/04/17.
 */

public class ViewModelStore {

    private final Map<String, ViewModel> viewModelMap;

    @Inject
    public ViewModelStore() {
        this.viewModelMap = Collections.synchronizedMap(new HashMap<String, ViewModel>());
    }

    public void put(String viewId, ViewModel model) {
        viewModelMap.put(viewId, model);
    }

    @Nullable
    public ViewModel get(String viewId) {
        return viewModelMap.get(viewId);
    }

}
