///
//  Generated code. Do not modify.
//  source: rainstream_java.proto
//
// @dart = 2.12
// ignore_for_file: annotate_overrides,camel_case_types,constant_identifier_names,directives_ordering,library_prefixes,non_constant_identifier_names,prefer_final_fields,return_of_invalid_type,unnecessary_const,unnecessary_import,unnecessary_this,unused_import,unused_shown_name

import 'dart:core' as $core;

import 'package:protobuf/protobuf.dart' as $pb;

class WeatherRequest extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo(const $core.bool.fromEnvironment('protobuf.omit_message_names') ? '' : 'WeatherRequest', package: const $pb.PackageName(const $core.bool.fromEnvironment('protobuf.omit_message_names') ? '' : 'brianbig'), createEmptyInstance: create)
    ..a<$core.int>(1, const $core.bool.fromEnvironment('protobuf.omit_field_names') ? '' : 'streamLimit', $pb.PbFieldType.O3, protoName: 'streamLimit')
    ..hasRequiredFields = false
  ;

  WeatherRequest._() : super();
  factory WeatherRequest({
    $core.int? streamLimit,
  }) {
    final _result = create();
    if (streamLimit != null) {
      _result.streamLimit = streamLimit;
    }
    return _result;
  }
  factory WeatherRequest.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory WeatherRequest.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  @$core.Deprecated(
  'Using this can add significant overhead to your binary. '
  'Use [GeneratedMessageGenericExtensions.deepCopy] instead. '
  'Will be removed in next major version')
  WeatherRequest clone() => WeatherRequest()..mergeFromMessage(this);
  @$core.Deprecated(
  'Using this can add significant overhead to your binary. '
  'Use [GeneratedMessageGenericExtensions.rebuild] instead. '
  'Will be removed in next major version')
  WeatherRequest copyWith(void Function(WeatherRequest) updates) => super.copyWith((message) => updates(message as WeatherRequest)) as WeatherRequest; // ignore: deprecated_member_use
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static WeatherRequest create() => WeatherRequest._();
  WeatherRequest createEmptyInstance() => create();
  static $pb.PbList<WeatherRequest> createRepeated() => $pb.PbList<WeatherRequest>();
  @$core.pragma('dart2js:noInline')
  static WeatherRequest getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<WeatherRequest>(create);
  static WeatherRequest? _defaultInstance;

  @$pb.TagNumber(1)
  $core.int get streamLimit => $_getIZ(0);
  @$pb.TagNumber(1)
  set streamLimit($core.int v) { $_setSignedInt32(0, v); }
  @$pb.TagNumber(1)
  $core.bool hasStreamLimit() => $_has(0);
  @$pb.TagNumber(1)
  void clearStreamLimit() => clearField(1);
}

class WeatherResponse extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo(const $core.bool.fromEnvironment('protobuf.omit_message_names') ? '' : 'WeatherResponse', package: const $pb.PackageName(const $core.bool.fromEnvironment('protobuf.omit_message_names') ? '' : 'brianbig'), createEmptyInstance: create)
    ..aOS(1, const $core.bool.fromEnvironment('protobuf.omit_field_names') ? '' : 'city')
    ..aOS(2, const $core.bool.fromEnvironment('protobuf.omit_field_names') ? '' : 'info')
    ..hasRequiredFields = false
  ;

  WeatherResponse._() : super();
  factory WeatherResponse({
    $core.String? city,
    $core.String? info,
  }) {
    final _result = create();
    if (city != null) {
      _result.city = city;
    }
    if (info != null) {
      _result.info = info;
    }
    return _result;
  }
  factory WeatherResponse.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory WeatherResponse.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  @$core.Deprecated(
  'Using this can add significant overhead to your binary. '
  'Use [GeneratedMessageGenericExtensions.deepCopy] instead. '
  'Will be removed in next major version')
  WeatherResponse clone() => WeatherResponse()..mergeFromMessage(this);
  @$core.Deprecated(
  'Using this can add significant overhead to your binary. '
  'Use [GeneratedMessageGenericExtensions.rebuild] instead. '
  'Will be removed in next major version')
  WeatherResponse copyWith(void Function(WeatherResponse) updates) => super.copyWith((message) => updates(message as WeatherResponse)) as WeatherResponse; // ignore: deprecated_member_use
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static WeatherResponse create() => WeatherResponse._();
  WeatherResponse createEmptyInstance() => create();
  static $pb.PbList<WeatherResponse> createRepeated() => $pb.PbList<WeatherResponse>();
  @$core.pragma('dart2js:noInline')
  static WeatherResponse getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<WeatherResponse>(create);
  static WeatherResponse? _defaultInstance;

  @$pb.TagNumber(1)
  $core.String get city => $_getSZ(0);
  @$pb.TagNumber(1)
  set city($core.String v) { $_setString(0, v); }
  @$pb.TagNumber(1)
  $core.bool hasCity() => $_has(0);
  @$pb.TagNumber(1)
  void clearCity() => clearField(1);

  @$pb.TagNumber(2)
  $core.String get info => $_getSZ(1);
  @$pb.TagNumber(2)
  set info($core.String v) { $_setString(1, v); }
  @$pb.TagNumber(2)
  $core.bool hasInfo() => $_has(1);
  @$pb.TagNumber(2)
  void clearInfo() => clearField(2);
}

