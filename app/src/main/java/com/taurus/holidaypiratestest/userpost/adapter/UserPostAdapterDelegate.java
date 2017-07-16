package com.taurus.holidaypiratestest.userpost.adapter;

import android.support.annotation.NonNull;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.taurus.holidaypiratestest.R;
import com.taurus.holidaypiratestest.baseadapter.BaseAdapterDelegate;
import com.taurus.holidaypiratestest.baseadapter.model.GenericItem;
import com.taurus.holidaypiratestest.listener.OnItemClickListener;
import java.util.List;

/**
 * Created by eminuluyol on 16/07/2017.
 */

public class UserPostAdapterDelegate
    extends BaseAdapterDelegate<UserPostUIModel, GenericItem, UserPostViewHolder> {

  public UserPostAdapterDelegate(OnItemClickListener listener) {
    setOnItemClickListener(listener);
  }

  @Override
  protected boolean isForViewType(@NonNull GenericItem item, @NonNull List<GenericItem> items,
      int position) {
    return item instanceof UserPostUIModel;
  }

  @NonNull @Override protected UserPostViewHolder onCreateViewHolder(@NonNull ViewGroup parent) {
    return new UserPostViewHolder(parent, R.layout.list_item_user_posts, getOnItemClickListener());
  }

  @Override protected void onBindViewHolder(@NonNull UserPostUIModel item,
      @NonNull UserPostViewHolder viewHolder, @NonNull List<Object> payloads) {
    viewHolder.bind(item);
  }

}
