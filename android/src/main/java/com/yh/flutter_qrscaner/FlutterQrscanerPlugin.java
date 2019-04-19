package com.yh.flutter_qrscaner;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry.Registrar;

/**
 * FlutterQrscanerPlugin
 */
public class FlutterQrscanerPlugin implements MethodCallHandler {
    private final ScanerDelegate delegate;

    /**
     * Plugin registration.
     */
    public static void registerWith(Registrar registrar) {
        final ScanerDelegate delegate =
                new ScanerDelegate(registrar.activity());
        registrar.addActivityResultListener(delegate);
        registrar.addRequestPermissionsResultListener(delegate);
        final MethodChannel channel = new MethodChannel(registrar.messenger(), "flutter_qrscaner");
        channel.setMethodCallHandler(new FlutterQrscanerPlugin(delegate));
    }

    FlutterQrscanerPlugin(ScanerDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public void onMethodCall(MethodCall call, Result result) {
        if (call.method.equals("startScan")) {
            delegate.StartScan(result);
        } else {
            result.notImplemented();
        }
    }
}
