/**
 * Copyright 2017 Goldman Sachs.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.gs.obevocomparer.input.text;

import java.io.IOException;
import java.io.Reader;

import au.com.bytecode.opencsv.CSVParser;

/**
 * CSV reader based on opencsv.
 */
public class CsvStreamDataSource extends AbstractStreamDataSource {

    private final CSVParser parser;

    public CsvStreamDataSource(String name, Reader stream) throws IOException {
        this(name, stream, ',', '"', '\\');
    }

    public CsvStreamDataSource(String name, Reader stream, char seperator, char quoteChar, char escapeChar) {
        super(name, stream);
        this.setHeader(true);
        this.parser = new CSVParser(seperator, quoteChar, escapeChar);
    }

    @Override
    protected String[] parseData(String line) {
        try {
            return this.parser.parseLine(line);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}