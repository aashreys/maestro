package com.aashreys.maestro;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by aashreys on 08/04/17.
 */

public class ViewModelStore {

    private final Map<String, ViewModel> viewModelMap;

    public ViewModelStore() {
        this.viewModelMap = Collections.synchronizedMap(new HashMap<String, ViewModel>());
    }

    public void put(String viewId, ViewModel model) {
        viewModelMap.put(viewId, model);
    }

    public ViewModel get(String viewId) {
        return viewModelMap.get(viewId);
    }

    public ViewModel remove(String viewId) {
        return viewModelMap.remove(viewId);
    }

}
