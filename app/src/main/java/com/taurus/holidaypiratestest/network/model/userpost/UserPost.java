package com.taurus.holidaypiratestest.network.model.userpost;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.taurus.holidaypiratestest.userpost.adapter.UserPostUIModel;
import com.taurus.holidaypiratestest.util.ListConverter;
import java.util.List;
import retrofit2.Response;

/**
 * Created by eminuluyol on 16/07/2017.
 */

public class UserPost {

  @SerializedName("userId")
  @Expose
  private int userId;

  @SerializedName("id")
  @Expose
  private int id;

  @SerializedName("title")
  @Expose
  private String title;

  @SerializedName("body")
  @Expose
  private String body;

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }


}
