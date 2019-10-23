package com.gavin.common

import com.gavin.framework.network.AbsNetManager
import okhttp3.OkHttpClient
import retrofit2.Retrofit

/**
 * @author lyg
 * @data 2019-10-22 20:29
 */
class NetManager:AbsNetManager() {

    companion object{
        @JvmStatic
        val mInstance :NetManager by lazy (mode =LazyThreadSafetyMode.SYNCHRONIZED){ NetManager() }
    }

    override fun configBaseUrl(): String {
        return "http://www.baidu.com/"
    }

}