package com.APIAutomationFramework2.TestClass;

import com.APIAutomationFramework2.APIEndPoint.Endpoints;
import com.APIAutomationFramework2.APIPOJO.CreateUserResponse;
import com.APIAutomationFramework2.APIPOJO.LoginSuccessfulResponse;
import com.APIAutomationFramework2.APIPOJO.RegisterUserResponse;
import com.APIAutomationFramework2.BaseAPI.BaseClassExecution;
import org.testng.annotations.Test;

public class testLoginUser extends BaseClassExecution
{
    @Test
    public void verifyTestLogin()
    {
        //System.out.println("LoginSuccessful");
        RequestBody.basePath(Endpoints.Login_URL).log().all();
        ResponseObject = RequestBody.when().log().all().body(PayloadObject.LoginPayload()).post();
        ValidateDataValue =ResponseObject.then().log().all().statusCode(200);


    }
}
