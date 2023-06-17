import 'package:grpc/grpc.dart';
import 'package:rainstream_flutter/protos/generated/rainstream.pbgrpc.dart';

class Api {
  final channel = ClientChannel(
    'localhost',
    port: 50051,
    options: const ChannelOptions(credentials: ChannelCredentials.insecure()),
  );

  late WeatherStreamServiceClient stub;
  Api() {
    stub = WeatherStreamServiceClient(channel);
  }

  Future<ResponseFuture<WeatherResponse>> getInfoOnce() async {
    return stub.getInfoOnce(WeatherRequest());
  }

  Future<ResponseStream<WeatherResponse>> getInfoContinously(int limit) async {
    return stub.getInfoContinuously(WeatherRequest(streamLimit: limit));
  }
}
