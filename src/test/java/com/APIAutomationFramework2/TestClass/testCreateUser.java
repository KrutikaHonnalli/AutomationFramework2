package com.APIAutomationFramework2.TestClass;

import com.APIAutomationFramework2.APIEndPoint.Endpoints;
import com.APIAutomationFramework2.APIPOJO.CreateUserResponse;
import com.APIAutomationFramework2.BaseAPI.BaseClassExecution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCreateUser extends BaseClassExecution
{
    public CreateUserResponse responseC;
    @Test
    public void verifyCreateUeer()
    {
        RequestBody.basePath(Endpoints.CreateUser_Login);
        ResponseObject = RequestBody.when().body(PayloadObject.CreateUserPayload()).post();
        ValidateDataValue = ResponseObject.then().log().all().statusCode(201);

        responseC = PayloadObject.CresponseData(ResponseObject.asString());
        AssertObject.verifyStringKey(responseC.getName(),"Sachin");
        AssertObject.verifyStringKey(responseC.getJob(),"leader");

    }
}
