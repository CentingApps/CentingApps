package com.c241ps220.centingapps.data.retrofit

import com.c241ps220.centingapps.data.pref.LoginResponse
import com.c241ps220.centingapps.data.pref.RegisterResponse
import com.c241ps220.centingapps.data.retrofit.UserLoginAuth.UserLoginRequest
import com.c241ps220.centingapps.data.retrofit.UserLoginAuth.UserLoginResponse
import com.c241ps220.centingapps.data.retrofit.UserRegisterAuth.UserRegisterRequest
import com.c241ps220.centingapps.data.retrofit.UserRegisterAuth.UserRegisterResponse
import com.c241ps220.centingapps.data.retrofit.UserUpdatePasswordAuth.UserUpdatePasswordRequest
import com.c241ps220.centingapps.data.retrofit.UserUpdatePasswordAuth.UserUpdatePasswordResponse
import com.c241ps220.centingapps.data.retrofit.UserUpdateProfileAuth.UserUpdateProfileRequest
import com.c241ps220.centingapps.data.retrofit.UserUpdateProfileAuth.UserUpdateProfileResponse
import retrofit2.Call
import retrofit2.http.*


interface ApiService {
    @FormUrlEncoded
    @POST("register")
    suspend fun register(
        @Field("name") name: String,
        @Field("email") email: String,
        @Field("password") password: String
    ): RegisterResponse

    @FormUrlEncoded
    @POST("login")
    suspend fun login(
        @Field("email") email: String,
        @Field("password") password: String
    ): LoginResponse

    @POST("auth/login")
    fun loginUser(@Body userLoginRequest: UserLoginRequest): Call<UserLoginResponse>

    @POST("auth/register")
    fun registerUser(@Body userRegisterRequest: UserRegisterRequest): Call<UserRegisterResponse>

    @POST("auth/update/profile")
    fun updateProfile(@Body userUpdateProfileRequest: UserUpdateProfileRequest): Call<UserUpdateProfileResponse>

    @POST("auth/update/password")
    fun updatePassword(@Body userUpdatePasswordRequest: UserUpdatePasswordRequest): Call<UserUpdatePasswordResponse>
}
