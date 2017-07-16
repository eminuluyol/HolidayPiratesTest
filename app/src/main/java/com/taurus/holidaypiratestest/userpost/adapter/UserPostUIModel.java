package com.taurus.holidaypiratestest.userpost.adapter;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.taurus.holidaypiratestest.baseadapter.model.GenericItem;

/**
 * Created by eminuluyol on 16/07/2017.
 */

public class UserPostUIModel extends GenericItem {

    private int userId;

    private int id;

    private String title;

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
