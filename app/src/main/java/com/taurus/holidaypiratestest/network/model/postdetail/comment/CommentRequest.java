package com.taurus.holidaypiratestest.network.model.postdetail.comment;

/**
 * Created by eminuluyol on 16/07/2017.
 */

public class CommentRequest {

  private int page;
  private int limit;
  private int postId;

  public CommentRequest(int page, int limit, int postId) {
    this.page = page;
    this.limit = limit;
    this.postId = postId;
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

  public int getPostId() {
    return postId;
  }

  public void setPostId(int postId) {
    this.postId = postId;
  }

}
