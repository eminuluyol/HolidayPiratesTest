package com.taurus.holidaypiratestest.baseadapter;

import com.hannesdorfmann.adapterdelegates3.AbsListItemAdapterDelegate;
import com.taurus.holidaypiratestest.baseadapter.viewholder.BaseViewHolder;

public abstract class BaseAdapterDelegate<I extends T, T, VH extends BaseViewHolder>
        extends AbsListItemAdapterDelegate<I, T, VH> {

}
