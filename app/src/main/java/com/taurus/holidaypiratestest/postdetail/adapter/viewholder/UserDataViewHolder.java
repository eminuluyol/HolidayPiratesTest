package com.taurus.holidaypiratestest.postdetail.adapter.viewholder;

import android.support.annotation.NonNull;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import com.taurus.holidaypiratestest.R;
import com.taurus.holidaypiratestest.baseadapter.viewholder.BaseViewHolder;
import com.taurus.holidaypiratestest.postdetail.adapter.model.UserDataUIModel;

/**
 * Created by eminuluyol on 16/07/2017.
 */

public class UserDataViewHolder extends BaseViewHolder {

  @BindView(R.id.userTextViewName)
  TextView textViewName;

  @BindView(R.id.userTextViewUserName)
  TextView textViewUserName;

  @BindView(R.id.userTextViewEmail)
  TextView textViewEmail;

  @BindView(R.id.userTextViewAddress)
  TextView textViewAddress;

  @BindView(R.id.userTextViewPhone)
  TextView textViewPhone;

  @BindView(R.id.userTextWebsite)
  TextView textViewWebsite;

  @BindView(R.id.userTextViewCompany)
  TextView textViewCompany;

  public UserDataViewHolder(@NonNull ViewGroup parentView, int layoutId) {
    super(parentView, layoutId);
  }

  public void bind(UserDataUIModel item) {

     textViewName.setText(item.getName());
     textViewUserName.setText(item.getUsername());
     textViewEmail.setText(item.getEmail());
     textViewAddress.setText(item.getAddress());
     textViewPhone.setText(item.getPhone());
     textViewWebsite.setText(item.getWebsite());
     textViewCompany.setText(item.getCompany());

  }
}
