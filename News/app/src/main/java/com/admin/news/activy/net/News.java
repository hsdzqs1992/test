package com.admin.news.activy.net;

import com.admin.news.activy.bean.HealethNews;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by admin on 2017/3/19.
 */

public interface News {

    @GET("version")
    Observable<HealethNews> GetNews();
}
