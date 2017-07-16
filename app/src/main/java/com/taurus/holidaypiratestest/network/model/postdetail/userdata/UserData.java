
package com.taurus.holidaypiratestest.network.model.postdetail.userdata;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.taurus.holidaypiratestest.R;
import com.taurus.holidaypiratestest.network.model.postdetail.userdata.Address;
import com.taurus.holidaypiratestest.network.model.postdetail.userdata.Company;
import com.taurus.holidaypiratestest.network.model.userpost.UserPost;
import com.taurus.holidaypiratestest.postdetail.adapter.model.UserDataUIModel;
import com.taurus.holidaypiratestest.userpost.adapter.UserPostUIModel;
import com.taurus.holidaypiratestest.util.ListConverter;
import java.util.List;
import retrofit2.Response;

public class UserData {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("website")
    @Expose
    private String website;
    @SerializedName("company")
    @Expose
    private Company company;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }


    public static List<UserDataUIModel> createList(List<UserData> userDataList) {
        return ListConverter.convert(userDataList, item -> create(item));
    }

    private static UserDataUIModel create(UserData item) {

        final UserDataUIModel model = new UserDataUIModel();

        model.setName(item.getName());
        model.setUsername(item.getUsername());
        model.setAddress(item.getAddress().getStreet() + ", " + item.getAddress().getCity());
        model.setEmail(item.getEmail());
        model.setPhone(item.getPhone());
        model.setWebsite(item.getWebsite());
        model.setCompany(item.getCompany().getName());

        return model;
    }


}
