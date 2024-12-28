package com.APIAutomationFramework2.APIPayload;


import com.APIAutomationFramework2.APIPOJO.*;
import com.google.gson.Gson;

import java.lang.management.GarbageCollectorMXBean;

public class PayloadClass
{

    public String RegisterUserPayload()
    {
        Gson gsonObject = new Gson();
        RegisterUser RegisterUserObject = new RegisterUser();
        RegisterUserObject.setEmail("eve.holt@reqres.in");
        RegisterUserObject.setPassword("pistol");
        String UserJsonPayload = gsonObject.toJson(RegisterUserObject);
        return  UserJsonPayload;

    }
        public RegisterUserResponse responseValue(String ResponseData)
        {
            Gson gsonObject = new Gson();
            RegisterUserResponse uservalue = gsonObject.fromJson(ResponseData,RegisterUserResponse.class);
            return  uservalue;
        }

        public String LoginPayload()
        {
            Gson gsonUser = new Gson();
            LoginSuccessful LoginObject = new LoginSuccessful();
            LoginObject.setEmail("eve.holt@reqres.in");
            LoginObject.setPassword("cityslicka");
            String UserJosn = gsonUser.toJson(LoginObject);
            return UserJosn;
        }

        public LoginSuccessfulResponse userresponse(String responseUser)
        {
            Gson usergson = new Gson();
            LoginSuccessfulResponse object = usergson.fromJson(responseUser,LoginSuccessfulResponse.class);
            return object;
        }

        public String CreateUserPayload()
        {
            CreateUser CreateUserObject = new CreateUser();
            CreateUserObject.setName("Sachin");
            CreateUserObject.setJob("leader");
            Gson CreateUserGson = new Gson();
            String CreateUserValue = CreateUserGson.toJson(CreateUserObject);
            return CreateUserValue;
        }

        public CreateUserResponse CresponseData(String Cresponse){

            Gson CreateResponse = new Gson();
            CreateUserResponse CObject = CreateResponse.fromJson(Cresponse,CreateUserResponse.class);
            return CObject;

        }


}
