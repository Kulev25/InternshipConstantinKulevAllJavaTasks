package com.endava.restAssured;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;

public class BaseTest {

    void setUpRestAssured(){
        RequestSpecBuilder specBuilder = new RequestSpecBuilder()
                .setBaseUri("https://reqres.in/")
                .setContentType(ContentType.JSON)
                .setAccept(ContentType.JSON)
                .addFilter(new RequestLoggingFilter(LogDetail.ALL, true, System.out))
                .addFilter(new ResponseLoggingFilter(LogDetail.ALL, true, System.out));

        RestAssured.requestSpecification = specBuilder.build();
    }
}
