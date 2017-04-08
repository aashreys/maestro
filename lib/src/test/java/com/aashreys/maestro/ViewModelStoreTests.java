package com.aashreys.maestro;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by aashreys on 08/04/17.
 */

public class ViewModelStoreTests {

    private ViewModelStore viewModelStore;

    private ViewIdGenerator viewIdGenerator;

    @Before
    public void setUp() {
        viewModelStore = new ViewModelStore();
        viewIdGenerator = new ViewIdGenerator();
    }

    @Test
    public void test_model_storage_retrieval_removal() {
        TestView view = new TestView();
        TestViewModel viewModel = new TestViewModel();

        String viewId = viewIdGenerator.generateId(view);

        viewModelStore.put(viewId, viewModel);
        Assert.assertEquals(viewModel, viewModelStore.get(viewId));

        viewModelStore.remove(viewId);
        Assert.assertEquals(null, viewModelStore.get(viewId));
    }

}
