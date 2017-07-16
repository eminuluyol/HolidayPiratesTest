package com.taurus.holidaypiratestest.network.retrofit;

import com.taurus.holidaypiratestest.network.HolidayPiratesApi;
import com.taurus.holidaypiratestest.network.model.postdetail.comment.CommentData;
import com.taurus.holidaypiratestest.network.model.postdetail.comment.CommentRequest;
import com.taurus.holidaypiratestest.network.model.postdetail.photo.PhotoData;
import com.taurus.holidaypiratestest.network.model.postdetail.photo.PhotoRequest;
import com.taurus.holidaypiratestest.network.model.postdetail.userdata.UserData;
import com.taurus.holidaypiratestest.network.model.postdetail.userdata.UserDataRequest;
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

    @Override
    public Flowable<List<UserData>> getUserData(UserDataRequest request) {
        HolidayPiratesService endpoints = APIRestClient.getInstanceRx().create(HolidayPiratesService.class);
        return endpoints.getUserData(request.getUserId());
    }

    @Override
    public Flowable<List<PhotoData>> getPhotos(PhotoRequest request) {
        HolidayPiratesService endpoints = APIRestClient.getInstanceRx().create(HolidayPiratesService.class);
        return endpoints.getPhotos(request.getPage(), request.getLimit());
    }

    @Override
    public Flowable<Response<List<CommentData>>> getComments(CommentRequest request) {
        HolidayPiratesService endpoints = APIRestClient.getInstanceRx().create(HolidayPiratesService.class);
        return endpoints.getComments(request.getPostId() ,request.getPage(), request.getLimit());
    }
}
