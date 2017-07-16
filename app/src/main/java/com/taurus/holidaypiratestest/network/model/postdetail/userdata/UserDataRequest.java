package com.taurus.holidaypiratestest.network.model.postdetail.userdata;

/**
 * Created by eminuluyol on 16/07/2017.
 */

public class UserDataRequest {

  private int userId;

  public UserDataRequest(int userId) {
    this.userId = userId;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

}
