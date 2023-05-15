///
//  Generated code. Do not modify.
//  source: rainstream.proto
//
// @dart = 2.12
// ignore_for_file: annotate_overrides,camel_case_types,constant_identifier_names,deprecated_member_use_from_same_package,directives_ordering,library_prefixes,non_constant_identifier_names,prefer_final_fields,return_of_invalid_type,unnecessary_const,unnecessary_import,unnecessary_this,unused_import,unused_shown_name

import 'dart:core' as $core;
import 'dart:convert' as $convert;
import 'dart:typed_data' as $typed_data;
@$core.Deprecated('Use weatherRequestDescriptor instead')
const WeatherRequest$json = const {
  '1': 'WeatherRequest',
  '2': const [
    const {'1': 'streamLimit', '3': 1, '4': 1, '5': 5, '10': 'streamLimit'},
  ],
};

/// Descriptor for `WeatherRequest`. Decode as a `google.protobuf.DescriptorProto`.
final $typed_data.Uint8List weatherRequestDescriptor = $convert.base64Decode('Cg5XZWF0aGVyUmVxdWVzdBIgCgtzdHJlYW1MaW1pdBgBIAEoBVILc3RyZWFtTGltaXQ=');
@$core.Deprecated('Use weatherResponseDescriptor instead')
const WeatherResponse$json = const {
  '1': 'WeatherResponse',
  '2': const [
    const {'1': 'city', '3': 1, '4': 1, '5': 9, '10': 'city'},
    const {'1': 'info', '3': 2, '4': 1, '5': 9, '10': 'info'},
  ],
};

/// Descriptor for `WeatherResponse`. Decode as a `google.protobuf.DescriptorProto`.
final $typed_data.Uint8List weatherResponseDescriptor = $convert.base64Decode('Cg9XZWF0aGVyUmVzcG9uc2USEgoEY2l0eRgBIAEoCVIEY2l0eRISCgRpbmZvGAIgASgJUgRpbmZv');
