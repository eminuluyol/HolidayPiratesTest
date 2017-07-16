package com.taurus.holidaypiratestest.customview;


import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

public class EndlessRecyclerView extends RecyclerView {

  private boolean loading = true;
  private int visibleThreshold = 0;
  private int firstVisibleItem, visibleItemCount, totalItemCount;

  private OnEndReachedListener onEndReachedListener;
  private OnTopReachedListener onTopReachedListener;

  /**
   * A Callback indicating the bottom of the recycler view has been reached.
   */
  public interface OnEndReachedListener {
    /**
     * This call back will be fired upon reaching end once!
     */
    void onEndReached();
  }

  /**
   * A Callback indicating the top of the recycler view has been reached.
   */
  public interface OnTopReachedListener {
    /**
     * This call back will be fired upon reaching end once!
     */
    void onTopReached();
  }

  /**
   * Constructor.
   *
   * @param context activity.
   */
  public EndlessRecyclerView(Context context) {
    super(context);
    init();
  }

  /**
   * Constructor.
   *
   * @param context activity
   * @param attrs   attribute set.
   */
  public EndlessRecyclerView(Context context, AttributeSet attrs) {
    super(context, attrs);
    init();
  }

  /**
   * Constructor.
   *
   * @param context  activity
   * @param attrs    attribute set.
   * @param defStyle style of view.
   */
  public EndlessRecyclerView(Context context, AttributeSet attrs, int defStyle) {
    super(context, attrs, defStyle);
    init();
  }

  /**
   * Instantiates a end callback.
   */
  private void init() {
    addOnScrollListener(new OnScrollListener() {
      @Override
      public void onScrolled(RecyclerView recyclerView, int dx, int dy) {

        final LinearLayoutManager layoutManager = (LinearLayoutManager) getLayoutManager();

        if (dy < 0) {

          if (layoutManager.findFirstCompletelyVisibleItemPosition() == 0) {
            //Top of the RecyclerView
            if (onTopReachedListener != null) {
              onTopReachedListener.onTopReached();
            }
          }

        } else {

          visibleItemCount = getChildCount();
          totalItemCount = layoutManager.getItemCount();
          firstVisibleItem = layoutManager.findFirstVisibleItemPosition();

          //                    Log.i("EndVisibleItemCount", "  " + visibleItemCount);
          //                    Log.i("EndTotalItemCount", "  " + totalItemCount);
          //                    Log.i("EndFirstVisibleItem", "  " + firstVisibleItem);
          //                    Log.i("EndLoading", "  " + !loading);
          //                    boolean result = (totalItemCount - visibleItemCount) <= (firstVisibleItem + visibleThreshold);
          //                    Log.i("EndResult", "  " + result);
          //                    Log.i("End", "----------------");

          if (!loading && (totalItemCount - visibleItemCount) <= (firstVisibleItem + visibleThreshold)) {
            // End has been reached
            if (onEndReachedListener != null) {
              onEndReachedListener.onEndReached();
            }
            loading = true;
          }

        }

      }
    });

  }

  public void setOnEndReachedListener(OnEndReachedListener onEndReachedListener) {
    this.onEndReachedListener = onEndReachedListener;
  }

  public void setOnTopReachedListener(OnTopReachedListener onTopReachedListener) {
    this.onTopReachedListener = onTopReachedListener;
  }


  /**
   * Resets the calculation for endlessness.
   *
   * @param flag loading flag.
   */
  public void setLoading(boolean flag) {
    loading = flag;
  }

}