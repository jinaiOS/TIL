# Webapp ↔ Flutter 통신
```dart
import 'dart:async';
import 'package:flutter/material.dart';
import 'package:flutter_inappwebview/flutter_inappwebview.dart';
import 'package:url_launcher/url_launcher.dart';

void main() => runApp(MyApp());

class MyApp extends StatefulWidget {
  @override
  _MyAppState createState() => new _MyAppState();
}

class _MyAppState extends State<MyApp> {
  final GlobalKey webViewKey = GlobalKey();

  InAppWebViewController? webViewController;
  final urlController = TextEditingController(text: "");

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        body: Column(children: <Widget>[
          Expanded(
            child: InAppWebView(
              key: webViewKey,
              initialUrlRequest: URLRequest(url: Uri.parse(urlController.text)),
              initialOptions: InAppWebViewGroupOptions(
                crossPlatform: InAppWebViewOptions(
                  useShouldOverrideUrlLoading: true,
                  mediaPlaybackRequiresUserGesture: false,
                ),
              ),
              onWebViewCreated: (controller) {
                webViewController = controller;

                controller.addJavaScriptHandler(
                  handlerName: 'nativeUrlOpenBrowser',
                  callback: (args) {
                    nativeUrlOpenBrowser(args[0]);
                  },
                );
              },
            ),
          ),
        ]),
      ),
    );
  }

  void nativeUrlOpenBrowser(String urlString) async {
    final Uri url = Uri.parse(urlString);

    if (await launchUrl(url)) {
      await launchUrl(url);
    } else {
      throw 'Could not launch $url';
    }
  } 
}
```
