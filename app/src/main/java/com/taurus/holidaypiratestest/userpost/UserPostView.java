package com.taurus.holidaypiratestest.userpost;

import com.taurus.holidaypiratestest.baseadapter.model.GenericItem;
import com.taurus.holidaypiratestest.core.BaseView;
import java.util.List;

/**
 * Created by eminuluyol on 16/07/2017.
 */

public interface UserPostView extends BaseView {

  void showGetUserPostSuccess(List<GenericItem> postList);

}
