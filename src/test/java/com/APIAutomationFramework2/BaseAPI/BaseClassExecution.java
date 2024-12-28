package com.APIAutomationFramework2.BaseAPI;

import com.APIAutomationFramework2.APIEndPoint.Endpoints;
import com.APIAutomationFramework2.APIPayload.PayloadClass;
import com.APIAutomationFramework2.AssertClassName.AssertAction;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseClassExecution
{
    public RequestSpecification RequestBody;
    public Response ResponseObject;
    public ValidatableResponse ValidateDataValue;
    public Endpoints EndpointObject;
    public PayloadClass PayloadObject;
    public Endpoints EObject;
    public AssertAction AssertObject;

    @BeforeClass
    public void SetUp()
    {
       PayloadObject =new PayloadClass();
       EObject = new Endpoints();
        AssertObject = new AssertAction();
        RequestBody = RestAssured
                .given().baseUri(Endpoints.BaseUrl).contentType(ContentType.JSON);
    }
}
