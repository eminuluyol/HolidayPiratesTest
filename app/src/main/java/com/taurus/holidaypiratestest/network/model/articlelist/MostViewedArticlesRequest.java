package com.taurus.holidaypiratestest.network.model.articlelist;

import com.taurus.trivagotest.network.model.BaseRequest;

/**
 * Created by eminuluyol on 09/07/2017.
 */

public class MostViewedArticlesRequest extends BaseRequest {

  private String section;
  private String timePeriod;

  public MostViewedArticlesRequest(String section, String timePeriod) {
    this.section = section;
    this.timePeriod = timePeriod;
  }

  public String getSection() {
    return section;
  }

  public void setSection(String section) {
    this.section = section;
  }

  public String getTimePeriod() {
    return timePeriod;
  }

  public void setTimePeriod(String timePeriod) {
    this.timePeriod = timePeriod;
  }

}
