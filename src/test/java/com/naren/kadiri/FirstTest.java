package com.naren.kadiri;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(PowerMockRunner.class)
@PowerMockIgnore({"javax.management.*","javax.script.*"})
@PrepareForTest({List.class})
public class FirstTest {

    @SuppressWarnings("unchecked")
    @Test
    public void test1()  {
        //  create mock
        List<String> test = mock(List.class);
        // define return value for method getUniqueId()
        when(test.get(anyInt())).thenReturn("Narendra");
        // use mock in test....
        assertEquals(test.get(0), "Narendra");
    }
}
