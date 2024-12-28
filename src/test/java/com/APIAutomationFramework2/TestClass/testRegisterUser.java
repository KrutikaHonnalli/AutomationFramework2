package com.APIAutomationFramework2.TestClass;



import com.APIAutomationFramework2.APIEndPoint.Endpoints;
import com.APIAutomationFramework2.APIPOJO.RegisterUserResponse;
import com.APIAutomationFramework2.BaseAPI.BaseClassExecution;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;

import org.testng.annotations.Test;

public class testRegisterUser extends BaseClassExecution
{
    @Owner("Krutika Kudte")
    @Description("Register with Valid User Credential")
    @Test
    public void verifyRegisterUSer()
    {
      RequestBody.basePath(Endpoints.Register_URL);
      ResponseObject = RequestBody.when().body(PayloadObject.RegisterUserPayload()).post();
      ValidateDataValue = ResponseObject.then().log().all().statusCode(200);

        RegisterUserResponse Values = PayloadObject.responseValue(ResponseObject.asString());
        AssertObject.verifyStringKey(Values.getToken(),"QpwL5tke4Pnpja7X4");
        AssertObject.verifyIntgereID(Values.getId(),4);
    }


}
