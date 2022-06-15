package com.awesometsproject;

import android.util.Log;


import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;


public class KakaoTestModule extends ReactContextBaseJavaModule {
    KakaoTestModule(ReactApplicationContext context){
        super(context);
    }

    @Override
    public String getName(){
        return "KakaoTest";
    }

    @ReactMethod
    public void wirteTestKakao(String name,  Promise promise){
        if(!name.equals("")) {
            promise.resolve(true);
        }else {
            promise.resolve(false);
        }
    }
}