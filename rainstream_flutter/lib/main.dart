import 'package:flutter/material.dart';
import 'package:grpc/grpc.dart' as grpc;
import 'package:rainstream_flutter/api/api.dart';
import 'package:rainstream_flutter/protos/generated/rainstream.pb.dart';

import 'ui/weather_info_table.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: const MyHomePage(title: 'Flutter Demo Home Page'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({super.key, required this.title});

  final String title;

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  bool _stream = false;
  final List<WeatherResponse> weatherResponseList = List.empty(growable: true);
  final Api _api = Api();

  void _incrementCounter() {
    setState(() {
      _stream == false ? _stream = true : _stream = false;
    });
  }

  void fetchOnce(int streams) {
    _api
        .getInfoOnce()
        .then((value) => value.then((p0) => weatherResponseList.add(p0)));
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(
            _stream ? 'Streaming weather info' : 'Not streaming currently'),
      ),
      body: _stream
          ? StreamBuilder<grpc.ResponseStream<WeatherResponse>>(
              stream: Stream.fromFuture(_api.getInfoContinously(60)),
              builder: (context, snapshot) {
                if (snapshot.connectionState == ConnectionState.waiting) {
                  return const Center(
                    child: CircularProgressIndicator(),
                  );
                } else if (snapshot.hasError) {
                  return Center(
                    child: Text('an error occured! ${snapshot.error}'),
                  );
                } else if (!snapshot.hasData) {
                  return const Center(
                    child: Text('No data available'),
                  );
                } else {
                  final data = snapshot.data;
                  return WeatherInfoTable(list: feedDataToList(data));
                }
              })
          : WeatherInfoTable(list: weatherResponseList),
      floatingActionButton: ButtonBar(
        children: [
          FloatingActionButton(
              onPressed: _incrementCounter,
              tooltip:
                  _stream ? 'Get info once' : 'Start streaming weather info',
              child: _stream == false
                  ? const Icon(Icons.thunderstorm_outlined)
                  : const Icon(Icons.thunderstorm_rounded)),
        ],
      ),
    );
  }

  List<WeatherResponse> feedDataToList(
      grpc.ResponseStream<WeatherResponse>? data) {
    List<WeatherResponse> listData = List.empty(growable: true);
    data?.toList().then((value) => value.forEach((element) {
          listData.add(element);
        }));
    return listData;
  }
}
