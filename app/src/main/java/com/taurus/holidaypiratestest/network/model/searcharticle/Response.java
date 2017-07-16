package com.taurus.holidaypiratestest.network.model.searcharticle;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by eminuluyol on 09/07/2017.
 */

public class Response {

  @SerializedName("docs")
  @Expose
  private List<Doc> docs = null;

  public List<Doc> getDocs() {
    return docs;
  }

  public void setDocs(List<Doc> docs) {
    this.docs = docs;
  }

}
