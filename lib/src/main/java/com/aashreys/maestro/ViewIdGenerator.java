package com.aashreys.maestro;

/**
 * Created by aashreys on 08/04/17.
 */

public class ViewIdGenerator {

    public String generateId(View view) {
        return view.getClass().getSimpleName() + view.hashCode();
    }

}
