package com.taurus.holidaypiratestest.network.retrofit;

import com.taurus.holidaypiratestest.network.model.postdetail.comment.CommentData;
import com.taurus.holidaypiratestest.network.model.postdetail.photo.PhotoData;
import com.taurus.holidaypiratestest.network.model.postdetail.userdata.UserData;
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

  @GET("users")
  Flowable<List<UserData>> getUserData(
      @Query("id") int id
  );

  @GET("photos")
  Flowable<List<PhotoData>> getPhotos(
      @Query("_start") int page,
      @Query("_limit") int limit
  );

  @GET("posts/{postId}/comments")
  Flowable<Response<List<CommentData>>> getComments(
      @Path("postId") int postId,
      @Query("_start") int page,
      @Query("_limit") int limit
  );

}
