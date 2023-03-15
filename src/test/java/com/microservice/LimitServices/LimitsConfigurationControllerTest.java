package com.microservice.LimitServices;

import com.microservices.limitservice.bean.LimitConfiguration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class LimitsConfigurationControllerTest {

    @InjectMocks
    private LimitsConfigurationController limitsConfigurationController;

    @Mock
    private Configuration configuration;

    @Test
    @DisplayName("Test to verify if the limit configuration object is returned correctly")
    void retriveLimitConfigurationObject() {
        when(configuration.getMaximum()).thenReturn(9999);
        when(configuration.getMinimum()).thenReturn(99);

        LimitConfiguration limitConfiguration = limitsConfigurationController.retriveLimitsForm();

        assertEquals(9999, limitConfiguration.getMaximum());
        assertEquals(99, limitConfiguration.getMinimum());
    }

}