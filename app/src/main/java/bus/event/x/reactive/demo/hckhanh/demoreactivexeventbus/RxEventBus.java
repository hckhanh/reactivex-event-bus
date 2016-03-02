package bus.event.x.reactive.demo.hckhanh.demoreactivexeventbus;

import rx.Observable;
import rx.subjects.PublishSubject;

/**
 * This is the EventBus for Reactive
 */
public class RxEventBus<T> {
  private final PublishSubject<T> publishSubject = PublishSubject.create();

  public void send(T data) {
    publishSubject.onNext(data);
  }

  public Observable<T> toObservable() {
    return publishSubject;
  }
}
