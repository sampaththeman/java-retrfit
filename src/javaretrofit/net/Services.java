/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaretrofit.net;

import java.util.List;
import javaretrofit.net.models.LoginResponses;
import okhttp3.MultipartBody;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.Part;

/**
 *
 * @author Ezequiel
 */
public interface Services {
    @FormUrlEncoded
    @POST("signin")
    Call<LoginResponses> login(@Field("email") String email, @Field("password") String password);
    
    
    @Multipart
    @POST("using/model/simple")
    Call<GlobalResponse> sendImageTest(@Part List<MultipartBody.Part> Somefile,@Part("Id") int id, @Part("Name") String name);
    
    
}
