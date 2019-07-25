//PUT YOUR PACKAGE HERE, IT'S THE SAME AS IN MainApplication.java
package com.reatnativeloadingspinneroverlaynativetutorial;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import android.app.Activity;

import com.kaopiz.kprogresshud.KProgressHUD;

//CHANGE LoadingOverlay WITH THE NAME OF YOUR CHOICE
public class LoadingOverlay extends ReactContextBaseJavaModule {

	KProgressHUD hud;

    public LoadingOverlay(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "LoadingOverlay";
    }

    @ReactMethod
    public void toggle(Boolean show) {
		final Activity activity = getCurrentActivity();
		//PUT YOUR NATIVE CODE HERE

		if(hud == null){
			hud = KProgressHUD.create(activity);
		}

		if(show){
			hud.setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
			.setLabel("Please wait")
			.setAnimationSpeed(2)
			.setDimAmount(0.1f)
			.show();
		}else{
			hud.dismiss();
		}


    }
}