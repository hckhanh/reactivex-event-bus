package bus.event.x.reactive.demo.hckhanh.demoreactivexeventbus;

import android.support.v4.app.Fragment;

public abstract class EventBusFragment extends Fragment {
  protected RxEventBus<Object> rxEventBus;

  public void setRxEventBus(RxEventBus<Object> rxEventBus) {
    this.rxEventBus = rxEventBus;
  }
}
