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

import ch.fhnw.imvs.hwgstereader.api.HwgSteFetcher;
import ch.fhnw.imvs.hwgstereader.api.HwgSteNode;
import ch.fhnw.imvs.hwgstereader.api.HwgSteReading;
import io.github.mluppi.fhnw.hwgstereader.examples.util.PrintUtil;

/**
 * Shows how the {@link HwgSteFetcher} can be used.
 *
 * @author mluppi
 */
public class SimpleFetcher {

    public static void main(final String[] args) {

        // create fetcher
        final HwgSteFetcher fetcher = new HwgSteFetcher();

        // read the data
        final HwgSteReading reading = fetcher.fetch(new HwgSteNode("node-1", "192.168.250.128"));

        // print the data
        PrintUtil.printHwgSteMeasurements(reading.getMeasurements());
    }
}
