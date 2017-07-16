package com.taurus.holidaypiratestest.network.model.postdetail.photo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by eminuluyol on 16/07/2017.
 */

public class PhotoData {

  @SerializedName("albumId")
  @Expose
  private int albumId;
  @SerializedName("id")
  @Expose
  private int id;
  @SerializedName("title")
  @Expose
  private String title;
  @SerializedName("url")
  @Expose
  private String url;
  @SerializedName("thumbnailUrl")
  @Expose
  private String thumbnailUrl;

  public int getAlbumId() {
    return albumId;
  }

  public void setAlbumId(int albumId) {
    this.albumId = albumId;
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

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getThumbnailUrl() {
    return thumbnailUrl;
  }

  public void setThumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
  }

}
