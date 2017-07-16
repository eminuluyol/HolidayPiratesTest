package com.taurus.holidaypiratestest.network.model.userpost;

import com.taurus.holidaypiratestest.network.model.BaseRequest;

/**
 * Created by eminuluyol on 16/07/2017.
 */

public class UserPostRequest extends BaseRequest {

  private int page;
  private int limit;

  public UserPostRequest(int page, int limit) {
    this.page = page;
    this.limit = limit;
  }

  public int getPage() {
    return page;
  }

  public void setPage(int page) {
    this.page = page;
  }

  public int getLimit() {
    return limit;
  }

  public void setLimit(int limit) {
    this.limit = limit;
  }

}
