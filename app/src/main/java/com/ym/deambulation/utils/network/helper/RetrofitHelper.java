package com.ym.deambulation.utils.network.helper;

import com.ym.deambulation.DeambulationApplication;
import com.ym.deambulation.bean.FutureWeatherBean;
import com.ym.deambulation.bean.LocalWeatherBean;
import com.ym.deambulation.utils.network.api.ApiService;
import com.ym.deambulation.utils.network.api.WeatherService;

import io.reactivex.Flowable;

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/9/12
 * desc: RetrofitHelper
 */
public class RetrofitHelper {
    private final ApiService mApiService;
    private final WeatherService mWeatherService;

    public RetrofitHelper(ApiService httpApi, WeatherService weatherService) {
        this.mApiService = httpApi;
        this.mWeatherService = weatherService;
    }

    /*******************************ApiService*******************************/

    /*****************************WeatherService*****************************/

    //获取当地天气状况
    public Flowable<LocalWeatherBean> getLocalWeather(String latitude, String longitude) {
        return mWeatherService.getLocalWeather(DeambulationApplication.token, latitude, longitude);
    }

    //获取当地未来天气状况
    public Flowable<FutureWeatherBean> getFutureWeather(String latitude, String longitude) {
        return mWeatherService.getFutureWeather(DeambulationApplication.token, latitude, longitude);
    }
}
