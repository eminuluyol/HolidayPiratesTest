package com.taurus.holidaypiratestest.network;

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

public interface HolidayPiratesApi {

  Flowable<Response<List<UserPost>>> getUserPosts(UserPostRequest request);

  Flowable<List<UserData>> getUserData(UserDataRequest request);

  Flowable<List<PhotoData>> getPhotos(PhotoRequest request);

  Flowable<Response<List<CommentData>>> getComments(CommentRequest request);

}
