import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class CPM {
    public static void main(String[] args) {
        // Create an observable that emits a sequence of integers
        Observable<Integer> observable = Observable.range(1, 5);

        // Create an observer that subscribes to the observable
        Observer<Integer> observer = new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {
                // This method is called when the observer subscribes to the observable
                System.out.println("Subscribed");
            }

            @Override
            public void onNext(Integer integer) {
                // This method is called for each item emitted by the observable
                System.out.println("Received: " + integer);
            }

            @Override
            public void onError(Throwable e) {
                // This method is called if the observable encounters an error
                System.out.println("Error: " + e.getMessage());
            }

            @Override
            public void onComplete() {
                // This method is called when the observable completes
                System.out.println("Completed");
            }
        };

        // Subscribe the observer to the observable
        observable.subscribe(observer);
    }
}