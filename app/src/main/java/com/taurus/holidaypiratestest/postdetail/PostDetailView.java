package com.taurus.holidaypiratestest.postdetail;

import com.taurus.holidaypiratestest.baseadapter.model.GenericItem;
import com.taurus.holidaypiratestest.baseadapter.viewholder.BaseViewHolder;
import com.taurus.holidaypiratestest.core.BaseView;
import com.taurus.holidaypiratestest.postdetail.adapter.model.CommentsUIModel;
import java.util.List;

/**
 * Created by eminuluyol on 16/07/2017.
 */

public interface PostDetailView extends BaseView {

  void showGetDetailSuccess(List<GenericItem> detailList);

  void showGetCommentSuccess(List<GenericItem> comments);

}
