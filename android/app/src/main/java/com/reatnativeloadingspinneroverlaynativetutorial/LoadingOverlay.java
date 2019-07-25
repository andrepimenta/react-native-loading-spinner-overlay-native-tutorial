//PUT YOUR PACKAGE HERE, IT'S THE SAME AS IN MainApplication.java
package com.reatnativeloadingspinneroverlaynativetutorial;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import android.app.Activity;

//CHANGE LoadingOverlay WITH THE NAME OF YOUR CHOICE
public class LoadingOverlay extends ReactContextBaseJavaModule {

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

    }
}