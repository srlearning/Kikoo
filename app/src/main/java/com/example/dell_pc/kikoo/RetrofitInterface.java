package com.example.dell_pc.kikoo;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface RetrofitInterface {

    @POST("/signup")
    @FormUrlEncoded
    Observable<String> registerUser (@Field("RCode") String RCode,
                                     @Field("CName") String CName,
                                     @Field("PName") String PName,
                                     @Field("DOB") String DOB,
                                     @Field("Pincode") String Pincode,
                                     @Field("Email") String Email,
                                     @Field("Mobile") String Mobile,
                                     @Field("Password") String Password);

    @POST("/login")
    @FormUrlEncoded
    Observable<String> loginUser (   @Field("Email") String Email,
                                     @Field("Password") String Password);
}
