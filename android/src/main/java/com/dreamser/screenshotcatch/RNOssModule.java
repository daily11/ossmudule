
package com.dreamser.screenshotcatch;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.core.DeviceEventManagerModule;

public class RNOssModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNOssModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @ReactMethod
  public void sayHello(String content) {
    reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class).emit("sayHello", "hello, " + content);
  }

  @Override
  public String getName() {
    return "RNOss";
  }
}