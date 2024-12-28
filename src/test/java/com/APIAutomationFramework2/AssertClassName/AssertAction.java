package com.APIAutomationFramework2.AssertClassName;


import io.restassured.response.Response;

import static org.assertj.core.api.Assertions.*;
import static org.testng.Assert.assertEquals;

public class AssertAction
{

    public void verifyStringKey(String KeyExcept,String KeyActual)
    {
        assertThat(KeyExcept).isEqualTo(KeyActual);
    }
    public void verifyIntgereID(Integer IDExcept,Integer IDActual)
    {
        assertThat(IDExcept).isEqualTo(IDActual);
    }
}
