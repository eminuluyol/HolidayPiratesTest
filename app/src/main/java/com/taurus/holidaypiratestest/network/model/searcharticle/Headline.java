package com.taurus.holidaypiratestest.network.model.searcharticle;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by eminuluyol on 09/07/2017.
 */

public class Headline {

  @SerializedName("main")
  @Expose
  private String main;
  @SerializedName("print_headline")
  @Expose
  private String printHeadline;
  @SerializedName("kicker")
  @Expose
  private String kicker;
  @SerializedName("content_kicker")
  @Expose
  private String contentKicker;

  public String getMain() {
    return main;
  }

  public void setMain(String main) {
    this.main = main;
  }

  public String getPrintHeadline() {
    return printHeadline;
  }

  public void setPrintHeadline(String printHeadline) {
    this.printHeadline = printHeadline;
  }

  public String getKicker() {
    return kicker;
  }

  public void setKicker(String kicker) {
    this.kicker = kicker;
  }

  public String getContentKicker() {
    return contentKicker;
  }

  public void setContentKicker(String contentKicker) {
    this.contentKicker = contentKicker;
  }

}
