package com.moon.booklove_android.service

import com.moon.booklove_android.data.dto.*
import com.moon.booklove_android.config.util.RetrofitCallback
import com.moon.booklove_android.config.util.RetrofitUtil
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UserService {

    fun normalSignUp(normalSignUpReqDTO: NormalSignUpReqDTO, callback: RetrofitCallback<SingleResult<Any>>) {
        RetrofitUtil.userService.normalSignUp(normalSignUpReqDTO)
            .enqueue(object : Callback<SingleResult<Any>> {
            override fun onResponse(call: Call<SingleResult<Any>>, response: Response<SingleResult<Any>>) {
                val res = response.body()
                if (response.code() == 200) {
                    if (res != null) {
                        callback.onSuccess(response.code(), res)
                    }
                } else if(response.code() == 403){
                    callback.onExpired(response.code())
                }else {
                    callback.onFailure(response.code())
                }
            }

            override fun onFailure(call: Call<SingleResult<Any>>, t: Throwable) {
                callback.onError(t)
            }
        })
    }

    fun normalLogin(id:String, password:String, callback: RetrofitCallback<SingleResult<LoginResDTO>>) {
        RetrofitUtil.userService.normalLogin(id, password)
            .enqueue(object : Callback<SingleResult<LoginResDTO>> {
                override fun onResponse(call: Call<SingleResult<LoginResDTO>>, response: Response<SingleResult<LoginResDTO>>) {
                    val res = response.body()
                    if (response.code() == 200) {
                        if (res != null) {
                            callback.onSuccess(response.code(), res)
                        }
                    } else if(response.code() == 403){
                        callback.onExpired(response.code())
                    }else {
                        callback.onFailure(response.code())
                    }
                }

                override fun onFailure(call: Call<SingleResult<LoginResDTO>>, t: Throwable) {
                    callback.onError(t)
                }
            })
    }

    fun socialSignUp(callback: RetrofitCallback<SingleResult<LoginResDTO>>) {
        RetrofitUtil.userService.socialSignUp()
            .enqueue(object : Callback<SingleResult<LoginResDTO>> {
                override fun onResponse(call: Call<SingleResult<LoginResDTO>>, response: Response<SingleResult<LoginResDTO>>) {
                    val res = response.body()
                    if (response.code() == 200) {
                        if (res != null) {
                            callback.onSuccess(response.code(), res)
                        }
                    } else if(response.code() == 403){
                        callback.onExpired(response.code())
                    }else {
                        callback.onFailure(response.code())
                    }
                }

                override fun onFailure(call: Call<SingleResult<LoginResDTO>>, t: Throwable) {
                    callback.onError(t)
                }
            })
    }

    fun checkID(userId: String, callback: RetrofitCallback<SingleResult<Boolean>>) {
        RetrofitUtil.userService.checkID(userId)
            .enqueue(object : Callback<SingleResult<Boolean>> {
                override fun onResponse(call: Call<SingleResult<Boolean>>, response: Response<SingleResult<Boolean>>) {
                    val res = response.body()
                    if (response.code() == 200) {
                        if (res != null) {
                            callback.onSuccess(response.code(), res)
                        }
                    } else if(response.code() == 403){
                        callback.onExpired(response.code())
                    } else{
                        callback.onFailure(response.code())
                    }
                }

                override fun onFailure(call: Call<SingleResult<Boolean>>, t: Throwable) {
                    callback.onError(t)
                }
            })
    }

    fun userInputInfo(userInputInfoReqDTO: UserInputInfoReqDTO, callback: RetrofitCallback<SingleResult<Any>>) {
        RetrofitUtil.userService.userInputInfo(userInputInfoReqDTO).enqueue(object : Callback<SingleResult<Any>> {
            override fun onResponse(call: Call<SingleResult<Any>>, response: Response<SingleResult<Any>>) {
                val res = response.body()
                if (response.code() == 200) {
                    if (res != null) {
                        callback.onSuccess(response.code(), res)
                    }
                } else if(response.code() == 403){
                    callback.onExpired(response.code())
                }else {
                    callback.onFailure(response.code())
                }
            }

            override fun onFailure(call: Call<SingleResult<Any>>, t: Throwable) {
                callback.onError(t)
            }
        })
    }

    fun userUpdateNickName(userUpdateInfoReqDTO: UpdateNicknameReqDTO, callback: RetrofitCallback<SingleResult<Any>>) {
        RetrofitUtil.userService.userUpdateNickName(userUpdateInfoReqDTO)
            .enqueue(object : Callback<SingleResult<Any>> {
                override fun onResponse(call: Call<SingleResult<Any>>, response: Response<SingleResult<Any>>) {
                    val res = response.body()
                    if (response.code() == 200) {
                        if (res != null) {
                            callback.onSuccess(response.code(), res)
                        }
                    } else if(response.code() == 403){
                        callback.onExpired(response.code())
                    }else {
                        callback.onFailure(response.code())
                    }
                }

                override fun onFailure(call: Call<SingleResult<Any>>, t: Throwable) {
                    callback.onError(t)
                }
            })
    }

    fun userUpdatePassword(userUpdatePasswordReqDTO: UpdatePasswordReqDTO, callback: RetrofitCallback<SingleResult<Any>>) {
        RetrofitUtil.userService.userUpdatePassword(userUpdatePasswordReqDTO)
            .enqueue(object : Callback<SingleResult<Any>> {
                override fun onResponse(call: Call<SingleResult<Any>>, response: Response<SingleResult<Any>>) {
                    val res = response.body()
                    if (response.code() == 200) {
                        if (res != null) {
                            callback.onSuccess(response.code(), res)
                        }
                    } else if(response.code() == 403){
                        callback.onExpired(response.code())
                    }else {
                        callback.onFailure(response.code())
                    }
                }

                override fun onFailure(call: Call<SingleResult<Any>>, t: Throwable) {
                    callback.onError(t)
                }
            })
    }

    fun autoLogin(callback: RetrofitCallback<SingleResult<LoginResDTO>>) {
        RetrofitUtil.userService.autoLogin()
            .enqueue(object : Callback<SingleResult<LoginResDTO>> {
                override fun onResponse(call: Call<SingleResult<LoginResDTO>>, response: Response<SingleResult<LoginResDTO>>) {
                    val res = response.body()
                    if (response.code() == 200) {
                        if (res != null) {
                            callback.onSuccess(response.code(), res)
                        }
                    } else if(response.code() == 403){
                        callback.onExpired(response.code())
                    } else{
                        callback.onFailure(response.code())
                    }
                }

                override fun onFailure(call: Call<SingleResult<LoginResDTO>>, t: Throwable) {
                    callback.onError(t)
                }
            })
    }
}