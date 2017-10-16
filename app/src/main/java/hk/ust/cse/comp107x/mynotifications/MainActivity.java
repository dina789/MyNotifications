package hk.ust.cse.comp107x.mynotifications;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.onesignal.OneSignal;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OneSignal.idsAvailable(new OneSignal.IdsAvailableHandler() {
            @Override
            public void idsAvailable(String userId, String registrationId) {
                Log.d("Dina", "idsAvailable: "+userId);
            }
        });

//https://onesignal.com/


        // Call syncHashedEmail anywhere in your app if you have the user's email.
        // This improves the effectiveness of OneSignal's "best-time" notification scheduling feature.
        // OneSignal.syncHashedEmail(userEmail);
        //https://documentation.onesignal.com/docs/android-sdk-setup#section-android-studio

      // https://onesignal.com/apps/fdfef688-a920-4d0c-874d-6173158de02a/notifications/new

    }
}
