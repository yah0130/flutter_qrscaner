import Flutter
import UIKit
import AVFoundation

public class SwiftFlutterQrscanerPlugin: NSObject, FlutterPlugin {
  public static func register(with registrar: FlutterPluginRegistrar) {
    let channel = FlutterMethodChannel(name: "flutter_qrscaner", binaryMessenger: registrar.messenger())
    let instance = SwiftFlutterQrscanerPlugin()
    registrar.addMethodCallDelegate(instance, channel: channel)
  }

  public func handle(_ call: FlutterMethodCall, result: @escaping FlutterResult) {
    if call.method=="startScan" {
        
    }
  }
}
