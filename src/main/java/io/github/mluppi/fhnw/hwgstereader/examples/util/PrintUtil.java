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
package io.github.mluppi.fhnw.hwgstereader.examples.util;

import ch.fhnw.imvs.hwgstereader.api.HwgSteMeasurement;
import ch.fhnw.imvs.hwgstereader.api.HwgSteReading;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Helper class to print data to stdout.
 *
 * @author mluppi
 */
public class PrintUtil {

    private static final Logger logger = LoggerFactory.getLogger(PrintUtil.class);

    public static void printHwgSteReadings(final List<HwgSteReading> readings) {
        for (final HwgSteReading reading : readings) {
           printHwgSteMeasurements(reading.getMeasurements());
        }
    }

    public static void printHwgSteMeasurements(final List<HwgSteMeasurement> measurements) {
        for (final HwgSteMeasurement measurement : measurements) {
            if (logger.isInfoEnabled()) {
                logger.info("{} -> {}", measurement.getType().name(), measurement.getValue());
            }
        }
    }

    private PrintUtil() {
    }
}
