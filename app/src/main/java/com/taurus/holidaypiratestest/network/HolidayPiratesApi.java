package com.taurus.holidaypiratestest.network;

import com.taurus.holidaypiratestest.network.model.userpost.UserPost;
import com.taurus.holidaypiratestest.network.model.userpost.UserPostRequest;
import io.reactivex.Flowable;
import java.util.List;
import retrofit2.Response;

public interface HolidayPiratesApi {

  Flowable<Response<List<UserPost>>> getUserPosts(UserPostRequest request);

}
