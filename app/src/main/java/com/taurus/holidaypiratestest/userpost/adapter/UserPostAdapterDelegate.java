package com.taurus.holidaypiratestest.userpost.adapter;

import android.support.annotation.NonNull;
import android.view.ViewGroup;
import com.taurus.holidaypiratestest.R;
import com.taurus.holidaypiratestest.baseadapter.model.GenericItem;
import com.taurus.holidaypiratestest.listener.OnItemClickListener;
import java.util.List;

/**
 * Created by eminuluyol on 16/07/2017.
 */

public class UserPostAdapterDelegate extends BaseAdapterDelegate<UserPostUIModel, GenericItem, UserPostViewHolder> {

  public UserPostAdapterDelegate(OnItemClickListener listener) {
    set
  }

  @Override
  protected boolean isForViewType(@NonNull GenericItem item, @NonNull List<GenericItem> items,
      int position) {
    return item instanceof UserPostUIModel;
  }

  @NonNull
  @Override
  protected UserPostViewHolder onCreateViewHolder(@NonNull ViewGroup parent) {
    return new UserPostViewHolder(parent, R.layout.list_item_user_posts);
  }

  @Override
  protected void onBindViewHolder(@NonNull UserPostUIModel item,
      @NonNull UserPostViewHolder viewHolder, @NonNull List<Object> payloads) {
    viewHolder.bind(item);
  }
}
