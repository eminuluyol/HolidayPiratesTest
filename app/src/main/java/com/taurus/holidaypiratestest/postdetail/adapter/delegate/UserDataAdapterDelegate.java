package com.taurus.holidaypiratestest.postdetail.adapter.delegate;

import android.support.annotation.NonNull;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import com.taurus.holidaypiratestest.R;
import com.taurus.holidaypiratestest.baseadapter.BaseAdapterDelegate;
import com.taurus.holidaypiratestest.baseadapter.model.GenericItem;
import com.taurus.holidaypiratestest.postdetail.adapter.model.UserDataUIModel;
import com.taurus.holidaypiratestest.postdetail.adapter.viewholder.UserDataViewHolder;
import java.util.List;

/**
 * Created by eminuluyol on 16/07/2017.
 */

public class UserDataAdapterDelegate
    extends BaseAdapterDelegate<UserDataUIModel, GenericItem, UserDataViewHolder> {

  @Override
  protected boolean isForViewType(@NonNull GenericItem item, @NonNull List<GenericItem> items,
      int position) {
    return item instanceof UserDataUIModel;
  }

  @NonNull @Override protected UserDataViewHolder onCreateViewHolder(@NonNull ViewGroup parent) {
    return new UserDataViewHolder(parent, R.layout.list_item_user_data);
  }

  @Override protected void onBindViewHolder(@NonNull UserDataUIModel item,
      @NonNull UserDataViewHolder viewHolder, @NonNull List<Object> payloads) {
    viewHolder.bind(item);
  }
}
