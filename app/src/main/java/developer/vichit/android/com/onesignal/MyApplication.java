package developer.vichit.android.com.onesignal;

import android.app.Application;

import com.onesignal.OneSignal;

/**
 * Created by VichitDeveloper on 6/28/17.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .init();
    }
}
