/**
 * The MIT License
 * Copyright © 2017 DTL
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.dtl.fairmetadata4j.io;

import nl.dtl.fairmetadata4j.model.FDPMetadata;
import nl.dtl.fairmetadata4j.utils.ExampleFilesUtils;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 * Unit tests for metadata field values.
 * 
 * @author Rajaram Kaliyaperumal <rr.kaliyaperumal@gmail.com>
 * @author Kees Burger <kees.burger@dtls.nl>
 * @since 2017-04-18
 * @version 0.1
 */
public class MetadataFieldsTest {
    
    /**
     * Test existence of conformsTo predicate 
     * @throws Exception 
     */
    @Test
    public void testExistenceconformsTo() throws Exception {
        FDPMetadataParser parser = new FDPMetadataParser();
        System.out.println("Test : Existence of conformsTo");
        FDPMetadata metadata = parser.parse(
                ExampleFilesUtils.getFileContentAsString(
                ExampleFilesUtils.FDP_METADATA_FILE), null,
                ExampleFilesUtils.FILE_FORMAT);
        assertNotNull(metadata.getSpecification());
    }
    
}
