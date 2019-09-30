import 'package:flutter/material.dart';
void main() => runApp(myApp());
class myApp extends StatelessWidget{
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "FlutterDemo",
      home: Scaffold(
        appBar: AppBar(
          title: Text("Flutter App"),
        ),
        body: Center(
          child: Text("Welcome"),
        ),
      ),
    );
  }
}