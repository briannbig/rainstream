import 'package:flutter/material.dart';
import 'package:rainstream_flutter/protos/generated/rainstream.pb.dart';

class WeatherInfoTable extends StatelessWidget {
  final List<WeatherResponse> list;
  const WeatherInfoTable({super.key, required this.list});

  @override
  Widget build(BuildContext context) {
    return SingleChildScrollView(
      scrollDirection: Axis.vertical,
      child: SizedBox(
        width: double.infinity,
        child: DataTable(
          headingRowColor: MaterialStateProperty.all(Colors.tealAccent),
          columns: const <DataColumn>[
            DataColumn(
              label: Expanded(
                child: Text(
                  'Avatar',
                  style: TextStyle(fontStyle: FontStyle.italic),
                ),
              ),
            ),
            DataColumn(
              label: Expanded(
                child: Text(
                  'City Name',
                  style: TextStyle(fontStyle: FontStyle.italic),
                ),
              ),
            ),
            DataColumn(
              label: Expanded(
                child: Text(
                  'Weather info',
                  style: TextStyle(fontStyle: FontStyle.italic),
                ),
              ),
            ),
          ],
          rows: List.generate(
              list.length,
              (index) => DataRow(cells: <DataCell>[
                    const DataCell(Icon(Icons.sunny_snowing,
                        color: Colors.black, size: 17)),
                    DataCell(Text(list.elementAt(index).city)),
                    DataCell(Text(list.elementAt(index).info)),
                  ])),
        ),
      ),
    );
  }
}
