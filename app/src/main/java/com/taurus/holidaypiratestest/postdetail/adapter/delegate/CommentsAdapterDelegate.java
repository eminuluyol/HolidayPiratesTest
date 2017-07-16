package com.taurus.holidaypiratestest.postdetail.adapter.delegate;

import android.support.annotation.NonNull;
import android.view.ViewGroup;
import com.taurus.holidaypiratestest.R;
import com.taurus.holidaypiratestest.baseadapter.BaseAdapterDelegate;
import com.taurus.holidaypiratestest.baseadapter.model.GenericItem;
import com.taurus.holidaypiratestest.postdetail.adapter.model.CommentsUIModel;
import com.taurus.holidaypiratestest.postdetail.adapter.viewholder.CommentsViewHolder;
import java.util.List;

/**
 * Created by eminuluyol on 16/07/2017.
 */

public class CommentsAdapterDelegate extends
    BaseAdapterDelegate<CommentsUIModel, GenericItem, CommentsViewHolder> {

  @Override
  protected boolean isForViewType(@NonNull GenericItem item, @NonNull List<GenericItem> items,
      int position) {
    return item instanceof CommentsUIModel;
  }

  @NonNull
  @Override
  protected CommentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent) {
    return new CommentsViewHolder(parent, R.layout.list_item_comments);
  }

  @Override
  protected void onBindViewHolder(@NonNull CommentsUIModel item,
      @NonNull CommentsViewHolder viewHolder, @NonNull List<Object> payloads) {
    viewHolder.bind(item);
  }
}
