/*
Copyright 2020-2022 M. Luppi

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.github.mluppi.fhnw.hwgstereader.examples;

import ch.fhnw.imvs.hwgstereader.api.HwgSteNode;
import ch.fhnw.imvs.hwgstereader.api.HwgSteReading;
import ch.fhnw.imvs.hwgstereader.reader.HwgSteReader;
import io.github.mluppi.fhnw.hwgstereader.examples.util.PrintUtil;

import java.util.List;

/**
 * Shows how the {@link HwgSteReader} can be used.
 *
 * @author mluppi
 */
public class SimpleReader {

    public static void main(final String[] args) {

        // create a reader
        final HwgSteReader reader = new HwgSteReader();

        // attach a node
        reader.attachNode(new HwgSteNode("node-1", "192.168.250.128"));

        // read the data
        final List<HwgSteReading> readings = reader.read();

        // print the data
        PrintUtil.printHwgSteReadings(readings);
    }
}
