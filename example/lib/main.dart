import 'package:flutter/material.dart';
import 'package:flutter_qrscaner/flutter_qrscaner.dart';

void main() => runApp(MyApp());

class MyApp extends StatefulWidget {
  @override
  _MyAppState createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  String _qrContent = "";

  @override
  void initState() {
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: const Text('Plugin example app'),
        ),
        body: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: <Widget>[
              Spacer(),
              RaisedButton(
                  onPressed: () {
                    FlutterQrscaner.startScan().then((value) {
                      setState(() {
                        _qrContent = value;
                      });
                    });
                  },
                  child: Text('开始扫码')),
              Spacer(),
              Text('扫码结果：$_qrContent'),
              Spacer()
            ],
          ),
        ),
      ),
    );
  }
}
