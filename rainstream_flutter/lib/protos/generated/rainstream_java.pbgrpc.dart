///
//  Generated code. Do not modify.
//  source: rainstream_java.proto
//
// @dart = 2.12
// ignore_for_file: annotate_overrides,camel_case_types,constant_identifier_names,directives_ordering,library_prefixes,non_constant_identifier_names,prefer_final_fields,return_of_invalid_type,unnecessary_const,unnecessary_import,unnecessary_this,unused_import,unused_shown_name

import 'dart:async' as $async;

import 'dart:core' as $core;

import 'package:grpc/service_api.dart' as $grpc;
import 'rainstream_java.pb.dart' as $0;
export 'rainstream_java.pb.dart';

class WeatherStreamServiceClient extends $grpc.Client {
  static final _$getInfoOnce =
      $grpc.ClientMethod<$0.WeatherRequest, $0.WeatherResponse>(
          '/brianbig.WeatherStreamService/getInfoOnce',
          ($0.WeatherRequest value) => value.writeToBuffer(),
          ($core.List<$core.int> value) =>
              $0.WeatherResponse.fromBuffer(value));
  static final _$getInfoContinuously =
      $grpc.ClientMethod<$0.WeatherRequest, $0.WeatherResponse>(
          '/brianbig.WeatherStreamService/getInfoContinuously',
          ($0.WeatherRequest value) => value.writeToBuffer(),
          ($core.List<$core.int> value) =>
              $0.WeatherResponse.fromBuffer(value));

  WeatherStreamServiceClient($grpc.ClientChannel channel,
      {$grpc.CallOptions? options,
      $core.Iterable<$grpc.ClientInterceptor>? interceptors})
      : super(channel, options: options, interceptors: interceptors);

  $grpc.ResponseFuture<$0.WeatherResponse> getInfoOnce(
      $0.WeatherRequest request,
      {$grpc.CallOptions? options}) {
    return $createUnaryCall(_$getInfoOnce, request, options: options);
  }

  $grpc.ResponseStream<$0.WeatherResponse> getInfoContinuously(
      $0.WeatherRequest request,
      {$grpc.CallOptions? options}) {
    return $createStreamingCall(
        _$getInfoContinuously, $async.Stream.fromIterable([request]),
        options: options);
  }
}

abstract class WeatherStreamServiceBase extends $grpc.Service {
  $core.String get $name => 'brianbig.WeatherStreamService';

  WeatherStreamServiceBase() {
    $addMethod($grpc.ServiceMethod<$0.WeatherRequest, $0.WeatherResponse>(
        'getInfoOnce',
        getInfoOnce_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $0.WeatherRequest.fromBuffer(value),
        ($0.WeatherResponse value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.WeatherRequest, $0.WeatherResponse>(
        'getInfoContinuously',
        getInfoContinuously_Pre,
        false,
        true,
        ($core.List<$core.int> value) => $0.WeatherRequest.fromBuffer(value),
        ($0.WeatherResponse value) => value.writeToBuffer()));
  }

  $async.Future<$0.WeatherResponse> getInfoOnce_Pre(
      $grpc.ServiceCall call, $async.Future<$0.WeatherRequest> request) async {
    return getInfoOnce(call, await request);
  }

  $async.Stream<$0.WeatherResponse> getInfoContinuously_Pre(
      $grpc.ServiceCall call, $async.Future<$0.WeatherRequest> request) async* {
    yield* getInfoContinuously(call, await request);
  }

  $async.Future<$0.WeatherResponse> getInfoOnce(
      $grpc.ServiceCall call, $0.WeatherRequest request);
  $async.Stream<$0.WeatherResponse> getInfoContinuously(
      $grpc.ServiceCall call, $0.WeatherRequest request);
}
