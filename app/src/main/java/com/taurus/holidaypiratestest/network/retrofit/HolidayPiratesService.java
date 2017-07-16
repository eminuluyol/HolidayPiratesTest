package com.taurus.holidaypiratestest.network.retrofit;

import com.taurus.holidaypiratestest.network.model.userpost.UserPost;
import io.reactivex.Flowable;
import java.util.List;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface HolidayPiratesService {

  @GET("posts")
  Flowable<Response<List<UserPost>>> getUserPosts(
      @Query("_start") int page,
      @Query("_limit") int limit
  );

}
