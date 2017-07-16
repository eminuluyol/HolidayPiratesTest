package com.taurus.holidaypiratestest.postdetail.adapter.viewholder;

import android.support.annotation.NonNull;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.BindView;
import com.taurus.holidaypiratestest.R;
import com.taurus.holidaypiratestest.baseadapter.viewholder.BaseViewHolder;
import com.taurus.holidaypiratestest.postdetail.adapter.model.PhotosUIModel;

/**
 * Created by eminuluyol on 16/07/2017.
 */

public class PhotosViewHolder extends BaseViewHolder {

  @BindView(R.id.photoImageViewPhoto)
  ImageView imageViewPhoto;


  public PhotosViewHolder(@NonNull ViewGroup parentView, int layoutId) {
    super(parentView, layoutId);
  }

  public void bind(PhotosUIModel item) {

    Glide.with(itemView.getContext())
        .load(item.getUrl())
        .placeholder(R.drawable.placeholder)
        .crossFade()
        .into(imageViewPhoto);

  }

}
