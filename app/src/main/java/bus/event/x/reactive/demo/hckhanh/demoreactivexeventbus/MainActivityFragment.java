package bus.event.x.reactive.demo.hckhanh.demoreactivexeventbus;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends EventBusFragment {
  public static final String TAG = "MainActivityFragment";

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_main, container, false);
    ButterKnife.bind(this, view);
    return view;
  }

  @Override public void onDestroyView() {
    super.onDestroyView();
    ButterKnife.unbind(this);
  }

  @OnClick(R.id.btn_move_screen) public void handleBtnOnMoveScreen(View view) {
    Log.d(TAG, "handleBtnOnMoveScreen");
    this.rxEventBus.send(view);
  }
}
