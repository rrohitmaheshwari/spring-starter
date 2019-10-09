package com.example.starter.project;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SimpleProjectApplicationTests {
    @Mock
    SortAlgorithm sortAlgorithm;

    @InjectMocks
    BinarySearchImpl binarySearch;


    @Test
    public void initialTest() {
        when(sortAlgorithm.sort(Mockito.any())).thenReturn(new int[] { 4,6,12});
        assertEquals(3, binarySearch.binarySearch(new int[] { 12, 4, 6 },3));
    }

}
