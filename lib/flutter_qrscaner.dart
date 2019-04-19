import 'dart:async';

import 'package:flutter/services.dart';

class FlutterQrscaner {
  static const MethodChannel _channel =
      const MethodChannel('flutter_qrscaner');

  static Future<String> get startScan => _channel
      .invokeMethod("startScan")
      .then<String>((dynamic result) => result);
}
