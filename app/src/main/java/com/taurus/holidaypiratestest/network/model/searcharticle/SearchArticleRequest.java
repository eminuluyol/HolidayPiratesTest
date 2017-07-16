package com.taurus.holidaypiratestest.network.model.searcharticle;

import com.taurus.trivagotest.network.model.BaseRequest;

/**
 * Created by eminuluyol on 09/07/2017.
 */

public class SearchArticleRequest extends BaseRequest{

  private String keyword;
  private int page;

  public SearchArticleRequest(String keyword, int page) {
    this.keyword = keyword;
    this.page = page;
  }

  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public int getPage() {
    return page;
  }

  public void setPage(int page) {
    this.page = page;
  }
}
