package com.taurus.holidaypiratestest.postdetail.adapter.viewholder;

import android.support.annotation.NonNull;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import com.taurus.holidaypiratestest.R;
import com.taurus.holidaypiratestest.baseadapter.viewholder.BaseViewHolder;
import com.taurus.holidaypiratestest.postdetail.adapter.model.CommentsUIModel;

/**
 * Created by eminuluyol on 16/07/2017.
 */

public class CommentsViewHolder extends BaseViewHolder {

  @BindView(R.id.commentTextViewName)
  TextView textViewName;

  @BindView(R.id.commentTextViewEmail)
  TextView textViewEmail;

  @BindView(R.id.commentTextViewBody)
  TextView textViewBody;

  public CommentsViewHolder(@NonNull ViewGroup parentView, int layoutId) {
    super(parentView, layoutId);
  }

  public void bind(CommentsUIModel item) {

    textViewName.setText(item.getName());
    textViewEmail.setText(item.getEmail());
    textViewBody.setText(item.getBody());

  }
}
