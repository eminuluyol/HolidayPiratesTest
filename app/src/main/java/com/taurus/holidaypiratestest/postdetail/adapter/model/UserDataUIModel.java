package com.taurus.holidaypiratestest.postdetail.adapter.model;

import com.taurus.holidaypiratestest.baseadapter.model.GenericItem;

/**
 * Created by eminuluyol on 16/07/2017.
 */

public class UserDataUIModel extends GenericItem {

  private String name;
  private String username;
  private String email;
  private String address;
  private String phone;
  private String website;
  private String company;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }
}
