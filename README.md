# flutter_qrscaner
[![LICENSE](https://img.shields.io/badge/license-Anti%20996-blue.svg)](https://github.com/996icu/996.ICU/blob/master/LICENSE)
[![Badge](https://img.shields.io/badge/link-996.icu-red.svg)](https://996.icu/#/zh_CN)

## 功能
- 打开二维码扫码界面并返回扫码结果（目前只支持android端）
## Demo
[下载 APK-Demo](https://fir.im/ayxt)

![](https://raw.githubusercontent.com/yah0130/flutter_qrscaner/master/%E6%88%AA%E5%9B%BE.png)
## 用法
#### 1.在 pubspec.yaml 中添加依赖
```
dependencies:
  flutter_qrscaner: ^0.0.4
```
#### 2.在AndroidManifest.xml添加相机权限
```
<uses-permission android:name="android.permission.CAMERA" />
```
#### 3.在按钮点击事件里调用
```dart
import 'package:flutter_qrscaner/flutter_qrscaner.dart';
....
  RaisedButton(
    onPressed: () {
      FlutterQrscaner.startScan().then((value) {
        setState(() {
          _qrContent = value;
        });
      });
    },
    child: Text('开始扫码')),
```
## TODO
- IOS端支持（IOS不会，求帮助）
- 闪光灯
- 识别相册里的二维码
- 提供更多可供配置的选项参数
