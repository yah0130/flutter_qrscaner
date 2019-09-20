package com.yh.flutter_qrscaner;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;

import androidx.core.app.ActivityCompat;

import com.zxing.android.CaptureActivity;

import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;

public class ScanerDelegate implements PluginRegistry.ActivityResultListener,
        PluginRegistry.RequestPermissionsResultListener {
    static final int REQUEST_CODE_STAR_SCAN = 2000;
    private final Activity activity;
    private MethodChannel.Result result;

    public ScanerDelegate(final Activity activity) {
        this.activity = activity;
    }

    public boolean isPermissionGranted(String permissionName) {
        return ActivityCompat.checkSelfPermission(activity, permissionName)
                == PackageManager.PERMISSION_GRANTED;
    }

    public void askForPermission(String[] permissionNames, int requestCode) {
        ActivityCompat.requestPermissions(activity, permissionNames, requestCode);
    }

    public void StartScan(MethodChannel.Result result) {
        this.result = result;
        if (!isPermissionGranted(Manifest.permission.CAMERA)) {
            askForPermission(new String[]{Manifest.permission.CAMERA}
                    , REQUEST_CODE_STAR_SCAN);
            return;
        }
        scanCore();
    }

    private void scanCore() {
        Intent intent = new Intent(activity, CaptureActivity.class);
        activity.startActivityForResult(intent, REQUEST_CODE_STAR_SCAN);
    }

    @Override
    public boolean onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_CODE_STAR_SCAN) {
            if (data!=null){
                String content = data.getStringExtra("codedContent");
                result.success(content);
            }else{
                result.success("");
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean onRequestPermissionsResult(
            int requestCode, String[] permissions, int[] grantResults) {
        boolean permissionGranted =
                grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED;
        if (requestCode == REQUEST_CODE_STAR_SCAN) {
            if (permissionGranted) {
                scanCore();
            }
        } else {
            return false;
        }
        if (!permissionGranted) {
            result.success(null);
        }

        return true;
    }
}