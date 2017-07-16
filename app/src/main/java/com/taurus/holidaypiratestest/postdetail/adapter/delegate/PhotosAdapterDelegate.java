package com.taurus.holidaypiratestest.postdetail.adapter.delegate;

import android.support.annotation.NonNull;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.BindView;
import com.taurus.holidaypiratestest.R;
import com.taurus.holidaypiratestest.baseadapter.BaseAdapterDelegate;
import com.taurus.holidaypiratestest.baseadapter.model.GenericItem;
import com.taurus.holidaypiratestest.postdetail.adapter.model.PhotosUIModel;
import com.taurus.holidaypiratestest.postdetail.adapter.viewholder.PhotosViewHolder;
import java.util.List;

/**
 * Created by eminuluyol on 16/07/2017.
 */

public class PhotosAdapterDelegate
    extends BaseAdapterDelegate<PhotosUIModel, GenericItem, PhotosViewHolder> {

  @Override
  protected boolean isForViewType(@NonNull GenericItem item, @NonNull List<GenericItem> items,
      int position) {
    return item instanceof PhotosUIModel;
  }

  @NonNull @Override protected PhotosViewHolder onCreateViewHolder(@NonNull ViewGroup parent) {
    return new PhotosViewHolder(parent, R.layout.list_item_photos);
  }

  @Override
  protected void onBindViewHolder(@NonNull PhotosUIModel item, @NonNull PhotosViewHolder viewHolder,
      @NonNull List<Object> payloads) {
    viewHolder.bind(item);
  }
}
