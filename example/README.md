## 功能
- 打开二维码扫码界面并返回扫码结果（目前只支持android端）
## Demo
[下载 APK-Demo](https://fir.im/ayxt)

![](https://github.com/yah0130/flutter_qrscaner/blob/master/%E6%88%AA%E5%9B%BE.png)
## 用法
#### 1.在 pubspec.yaml 中添加依赖
```
dependencies:
  flutter_qrscaner: ^0.0.3
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
