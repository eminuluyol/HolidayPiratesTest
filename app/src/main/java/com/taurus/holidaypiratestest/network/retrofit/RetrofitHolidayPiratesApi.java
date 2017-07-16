package com.taurus.holidaypiratestest.network.retrofit;

import com.taurus.holidaypiratestest.network.HolidayPiratesApi;
import com.taurus.holidaypiratestest.network.model.userpost.UserPost;
import com.taurus.holidaypiratestest.network.model.userpost.UserPostRequest;
import io.reactivex.Flowable;
import java.util.List;
import retrofit2.Response;

public class RetrofitHolidayPiratesApi implements HolidayPiratesApi {

    public RetrofitHolidayPiratesApi() {
    }

    @Override
    public Flowable<Response<List<UserPost>>> getUserPosts(UserPostRequest request) {
        HolidayPiratesService endpoints = APIRestClient.getInstanceRx().create(HolidayPiratesService.class);
        return endpoints.getUserPosts(request.getPage(), request.getLimit());
    }
}
