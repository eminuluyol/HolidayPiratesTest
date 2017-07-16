package com.taurus.holidaypiratestest.postdetail.adapter.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.taurus.holidaypiratestest.baseadapter.model.GenericItem;

/**
 * Created by eminuluyol on 16/07/2017.
 */

public class CommentsUIModel extends GenericItem {

  private String name;
  private String email;
  private String body;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }
}
